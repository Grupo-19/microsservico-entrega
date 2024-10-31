package br.com.fiap.grupo19.msentrega.infra.gateways.funcionario;

import br.com.fiap.grupo19.msentrega.domain.entity.funcionario.Funcionario;
import br.com.fiap.grupo19.msentrega.infra.persistence.funcionario.FuncionarioEntity;

public class FuncionarioMapper {

    public Funcionario toDomain (FuncionarioEntity input){
        return new Funcionario(input.getId(),
                input.getNome(),
                input.getCpf(),
                input.getEmail(),
                input.getTelefone());
    }

    public FuncionarioEntity toEntity (Funcionario input){
        return new FuncionarioEntity(input.getId(),
                input.getNome(),
                input.getCpf(),
                input.getEmail(),
                input.getTelefone());
    }
}
