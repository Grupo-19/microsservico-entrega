package br.com.fiap.grupo19.msentrega.application.usecases.entrega;

import br.com.fiap.grupo19.msentrega.application.gateways.entrega.ObterEntregasPorIDFuncionarioInterface;
import br.com.fiap.grupo19.msentrega.domain.entity.entrega.Entrega;

import java.util.List;

public class ObterEntregasPorIDFuncionario {

    private final ObterEntregasPorIDFuncionarioInterface obterEntregasPorIDFuncionarioInterface;

    public ObterEntregasPorIDFuncionario(ObterEntregasPorIDFuncionarioInterface obterEntregasPorIDFuncionarioInterface) {
        this.obterEntregasPorIDFuncionarioInterface = obterEntregasPorIDFuncionarioInterface;
    }

    public List<Entrega> obterEntregasPorIDFuncionario(Long idFuncionario) {
        return obterEntregasPorIDFuncionarioInterface.obterEntregaPorIDFuncionario(idFuncionario);
    }
}
