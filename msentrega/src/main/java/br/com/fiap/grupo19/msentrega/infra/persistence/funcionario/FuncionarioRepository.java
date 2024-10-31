package br.com.fiap.grupo19.msentrega.infra.persistence.funcionario;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface FuncionarioRepository extends JpaRepository<FuncionarioEntity, Long> {
    Optional<FuncionarioEntity> findByCpf(String cpf);
}
