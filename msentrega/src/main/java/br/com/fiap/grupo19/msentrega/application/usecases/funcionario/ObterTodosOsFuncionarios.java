package br.com.fiap.grupo19.msentrega.application.usecases.funcionario;

import br.com.fiap.grupo19.msentrega.application.gateways.funcionario.ObterTodosOsFuncionariosInterface;
import br.com.fiap.grupo19.msentrega.domain.entity.funcionario.Funcionario;

import java.util.List;

public class ObterTodosOsFuncionarios {

    private final ObterTodosOsFuncionariosInterface obterTodosOsFuncionariosInterface;

    public ObterTodosOsFuncionarios(ObterTodosOsFuncionariosInterface obterTodosOsFuncionariosInterface) {
        this.obterTodosOsFuncionariosInterface = obterTodosOsFuncionariosInterface;
    }

    public List<Funcionario> obterFuncionario() {
        return obterTodosOsFuncionariosInterface.obterFuncionarios();
    }
}
