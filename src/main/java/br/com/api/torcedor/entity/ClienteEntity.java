package br.com.api.torcedor.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "cliente")
public class ClienteEntity {

	@Column(name = "id_cliente")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_cliente;
	
	@Column(name = "nome_completo")
	private String nomeCompleto;
	
	@Column(name ="idTimeCoracao")
	private int id_time_coracao;
	
	@Column(name= "email")
	private String email;
	
	@Column(name= "dataNascimento")
	private Date dataNascimento;
}
