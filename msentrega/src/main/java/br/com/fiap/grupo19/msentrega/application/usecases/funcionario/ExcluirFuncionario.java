package br.com.fiap.grupo19.msentrega.application.usecases.funcionario;

import br.com.fiap.grupo19.msentrega.application.gateways.funcionario.ExcluirFuncionarioInterface;

public class ExcluirFuncionario {

    private final ExcluirFuncionarioInterface excluirFuncionarioInterface;

    public ExcluirFuncionario(ExcluirFuncionarioInterface excluirFuncionarioInterface) {
        this.excluirFuncionarioInterface = excluirFuncionarioInterface;
    }

    public void excluirFuncionario(Long idFuncionario) {
        excluirFuncionarioInterface.excluirFuncionario(idFuncionario);
    }
}
