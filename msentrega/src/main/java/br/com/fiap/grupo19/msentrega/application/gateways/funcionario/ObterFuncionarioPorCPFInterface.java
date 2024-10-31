package br.com.fiap.grupo19.msentrega.application.gateways.funcionario;

import br.com.fiap.grupo19.msentrega.domain.entity.funcionario.Funcionario;

public interface ObterFuncionarioPorCPFInterface {
    Funcionario obterFuncionarioPorCPF(String cpf);
}
