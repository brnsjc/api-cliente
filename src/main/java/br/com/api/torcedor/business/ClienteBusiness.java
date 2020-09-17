package br.com.api.torcedor.business;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.api.torcedor.entity.ClienteCampanhaEntity;
import br.com.api.torcedor.entity.ClienteEntity;
import br.com.api.torcedor.feign.CampanhaFeign;
import br.com.api.torcedor.repository.ClienteCampanhaRepository;
import br.com.api.torcedor.repository.ClienteRepository;
import br.com.api.torcedor.response.CampanhaResponse;
import br.com.api.torcedor.response.ClienteResponse;

@Component
public class ClienteBusiness {

	@Autowired
	ClienteRepository clienteRep;
	
	@Autowired
	ClienteCampanhaRepository clienteCampanhaRepo ;
	
	ModelMapper modelMapper = new ModelMapper();
	
	ClienteEntity clienteEntity;
	
	List<ClienteCampanhaEntity> clienteCampanhaEntity = new ArrayList<ClienteCampanhaEntity>();
	
	ClienteResponse clienteResp = new ClienteResponse();
	
	@Autowired
	CampanhaFeign campanhaFeign ;
	
	List<CampanhaResponse> campanhas =new ArrayList<CampanhaResponse>();
	
	List<CampanhaResponse> campanhasTimeCoracao =new ArrayList<CampanhaResponse>();
	
	ClienteCampanhaEntity clienteCampanha = new ClienteCampanhaEntity();
	List<ClienteCampanhaEntity> clientesCampanhas = new ArrayList<ClienteCampanhaEntity>();
	
	
	public List<CampanhaResponse> cadastrarCliente(ClienteResponse cliente) {
		
		campanhas =  campanhaFeign.getCampanhas();
		
		clienteEntity = clienteRep.findByEmail(cliente.getEmail());
		
		if(clienteEntity == null) {
		
			clienteRep.save(modelMapper.map(cliente,ClienteEntity.class));
			
			clienteEntity = clienteRep.findByEmail(cliente.getEmail());
			
			for(CampanhaResponse campanha : campanhas) {
				
				if(campanha.getIdTime() == cliente.getId_time_coracao()) {
					
					campanhasTimeCoracao.add(campanha);
					
					clienteCampanha.setIdCampanha(campanha.getId_campanha());
					clienteCampanha.setIdCliente(clienteEntity.getId_cliente());
					
					clienteCampanhaRepo.save(clienteCampanha);
					
				}		
			}
			
		}
		
		for(CampanhaResponse campanha : campanhas) {
			
			if(campanha.getIdTime() == cliente.getId_time_coracao()) {
				
				campanhasTimeCoracao.add(campanha);
				
				clienteEntity = clienteRep.findByEmail(cliente.getEmail());
				
				clienteCampanha.setIdCampanha(campanha.getId_campanha());
				clienteCampanha.setIdCliente(clienteEntity.getId_cliente());
				
				clienteCampanhaRepo.save(clienteCampanha);
			}		
		
	}
		
		return campanhasTimeCoracao;
		
	}
}
