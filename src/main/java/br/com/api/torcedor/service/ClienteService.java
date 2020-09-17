package br.com.api.torcedor.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.api.torcedor.business.ClienteBusiness;
import br.com.api.torcedor.response.CampanhaResponse;
import br.com.api.torcedor.response.ClienteResponse;

@Service
public class ClienteService {

	@Autowired
	ClienteBusiness clienteBusiness;
	
	public List<CampanhaResponse> cadastrarCliente(ClienteResponse cliente) {
		
		return clienteBusiness.cadastrarCliente(cliente);
	}

}
