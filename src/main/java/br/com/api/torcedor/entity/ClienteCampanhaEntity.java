package br.com.api.torcedor.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "campanha_usuario")
public class ClienteCampanhaEntity {
	
	
	@Id
	@Column(name = "id_campanha")
	private int idCampanha;
	
	@Column(name = "id_cliente")
	private int idCliente;

}
