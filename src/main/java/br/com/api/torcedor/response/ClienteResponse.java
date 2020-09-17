package br.com.api.torcedor.response;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class ClienteResponse {

	
	private int id_cliente;
	
	@JsonProperty(value = "Nome_Cliente")
	private String nomeCliente;
	
	@JsonProperty(value = "Id_Time")
	private int id_time_coracao;
	
	@JsonProperty(value = "Email")
	private String email;
	
	@JsonProperty(value = "Data_Nascimento")
	private Date dataNascimento;
}
