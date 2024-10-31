package br.com.fiap.grupo19.msentrega.infra.persistence.entrega;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EntregaRepository extends JpaRepository<EntregaEntity, Long> {
    List<EntregaEntity> findByFuncionarioId(Long idFuncionario);
}
