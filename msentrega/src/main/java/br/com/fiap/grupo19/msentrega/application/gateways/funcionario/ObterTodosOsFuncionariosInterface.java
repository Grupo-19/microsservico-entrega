package br.com.fiap.grupo19.msentrega.application.gateways.funcionario;

import br.com.fiap.grupo19.msentrega.domain.entity.funcionario.Funcionario;

import java.util.List;

public interface ObterTodosOsFuncionariosInterface {
    List<Funcionario> obterFuncionarios();
}
