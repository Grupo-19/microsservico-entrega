package br.com.fiap.grupo19.msentrega.application.usecases.funcionario;

import br.com.fiap.grupo19.msentrega.application.gateways.funcionario.CadastrarFuncionarioInterface;
import br.com.fiap.grupo19.msentrega.domain.entity.funcionario.Funcionario;

public class CadastrarFuncionario {

    private final CadastrarFuncionarioInterface cadastrarFuncionarioInterface;

    public CadastrarFuncionario(CadastrarFuncionarioInterface cadastrarFuncionarioInterface) {
        this.cadastrarFuncionarioInterface = cadastrarFuncionarioInterface;
    }

    public Funcionario cadastrarFuncionario(Funcionario funcionario) {
        return cadastrarFuncionarioInterface.cadastrarFuncionario(funcionario);
    }
}
