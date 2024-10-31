package br.com.fiap.grupo19.msentrega.application.usecases.funcionario;

import br.com.fiap.grupo19.msentrega.application.gateways.funcionario.ObterFuncionarioPorCPFInterface;
import br.com.fiap.grupo19.msentrega.domain.entity.funcionario.Funcionario;

public class ObterFuncionarioPorCPF {

    private final ObterFuncionarioPorCPFInterface obterFuncionarioPorCPFInterface;

    public ObterFuncionarioPorCPF(ObterFuncionarioPorCPFInterface obterFuncionarioPorCPFInterface) {
        this.obterFuncionarioPorCPFInterface = obterFuncionarioPorCPFInterface;
    }

    public Funcionario obterFuncionarioPorCPF(String cpf) {
        return obterFuncionarioPorCPFInterface.obterFuncionarioPorCPF(cpf);
    }
}
