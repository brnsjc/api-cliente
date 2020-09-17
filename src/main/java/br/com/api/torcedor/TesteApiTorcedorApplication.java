package br.com.api.torcedor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class TesteApiTorcedorApplication {

	public static void main(String[] args) {
		SpringApplication.run(TesteApiTorcedorApplication.class, args);
	}

}
