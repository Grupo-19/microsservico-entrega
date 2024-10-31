package br.com.fiap.grupo19.msentrega.application.usecases.funcionario;

import br.com.fiap.grupo19.msentrega.application.gateways.funcionario.EditarFuncionarioInterface;
import br.com.fiap.grupo19.msentrega.domain.entity.funcionario.Funcionario;

public class EditarFuncionario {

    private final EditarFuncionarioInterface editarFuncionarioInterface;

    public EditarFuncionario(EditarFuncionarioInterface editarFuncionarioInterface) {
        this.editarFuncionarioInterface = editarFuncionarioInterface;
    }

    public Funcionario editarFuncionario(Funcionario funcionario) {
        return editarFuncionarioInterface.editarFuncionario(funcionario);
    }
}
