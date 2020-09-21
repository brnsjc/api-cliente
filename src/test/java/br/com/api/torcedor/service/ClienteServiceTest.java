package br.com.api.torcedor.service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;
import org.springframework.beans.factory.annotation.Autowired;


import br.com.api.torcedor.business.ClienteBusiness;
import br.com.api.torcedor.response.CampanhaResponse;
import br.com.api.torcedor.response.ClienteResponse;

public class ClienteServiceTest {

	@InjectMocks
	@Autowired
	ClienteService clienteService;
	
	@Mock
	ClienteBusiness clienteBusiness;
	
	@Mock
	CampanhaResponse campanhaResponse;
	
	@Mock
	ClienteResponse clienteResponse;
	
	@Spy
	List<CampanhaResponse> campanhas = new ArrayList<CampanhaResponse>();
	
	@Before
	public void inciarMocks() {
		
		MockitoAnnotations.initMocks(this);
		campanhas.add(campanhaResponse);
		campanhas.add(campanhaResponse);
		campanhas.add(campanhaResponse);
	
	}
	
	@Test
	public void cadastrarClienteTest() {
		
		when(clienteService.cadastrarCliente(clienteResponse)).thenReturn(campanhas);
		
		assertThat(clienteService.cadastrarCliente(clienteResponse)).isEqualTo(campanhas);
		
	}
	
}
