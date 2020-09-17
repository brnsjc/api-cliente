package br.com.api.torcedor.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.api.torcedor.entity.ClienteCampanhaEntity;

public interface ClienteCampanhaRepository extends JpaRepository<ClienteCampanhaEntity, Integer> {

}
