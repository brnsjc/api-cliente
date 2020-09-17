package br.com.api.torcedor.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.api.torcedor.entity.ClienteEntity;

@Repository
public interface ClienteRepository extends JpaRepository<ClienteEntity, Integer> {

	@Query("from ClienteEntity cliente where cliente.email = :email")
	ClienteEntity findByEmail(@Param("email") String email);

}
