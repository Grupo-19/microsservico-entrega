package br.com.fiap.grupo19.msentrega.application.usecases.funcionario;

import br.com.fiap.grupo19.msentrega.application.gateways.funcionario.ObterFuncionarioPorIDInterface;
import br.com.fiap.grupo19.msentrega.domain.entity.funcionario.Funcionario;

public class ObterFuncionarioPorID {

    private final ObterFuncionarioPorIDInterface obterFuncionarioPorIDInterface;

    public ObterFuncionarioPorID(ObterFuncionarioPorIDInterface obterFuncionarioPorIDInterface) {
        this.obterFuncionarioPorIDInterface = obterFuncionarioPorIDInterface;
    }

    public Funcionario obterFuncionarioPorID(Long id) {
        return obterFuncionarioPorIDInterface.obterFuncionarioPorID(id);
    }
}
