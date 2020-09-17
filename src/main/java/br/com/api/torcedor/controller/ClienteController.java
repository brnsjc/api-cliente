package br.com.api.torcedor.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.api.torcedor.feign.CampanhaFeign;
import br.com.api.torcedor.response.CampanhaResponse;
import br.com.api.torcedor.response.ClienteResponse;
import br.com.api.torcedor.service.ClienteService;

@RestController
@RequestMapping(value = "v1/cliente")
@EnableFeignClients(basePackages = "br.com.api.torcedor.feign")
public class ClienteController {
	
	@Autowired
	ClienteService clienteService;

	@PostMapping(value = "/cadastrar")
	public List<CampanhaResponse> cadastrarCliente(@RequestBody ClienteResponse cliente) {
				
		return clienteService.cadastrarCliente(cliente);
	}

}
