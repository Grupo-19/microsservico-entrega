package br.com.fiap.grupo19.msentrega.application.usecases.entrega;

import br.com.fiap.grupo19.msentrega.application.gateways.entrega.FinalizarEntregaAoClienteInterface;
import br.com.fiap.grupo19.msentrega.domain.entity.entrega.Entrega;

public class FinalizarEntregaAoCliente {

    private final FinalizarEntregaAoClienteInterface finalizarEntregaAoClienteInterface;

    public FinalizarEntregaAoCliente(FinalizarEntregaAoClienteInterface finalizarEntregaAoClienteInterface) {
        this.finalizarEntregaAoClienteInterface = finalizarEntregaAoClienteInterface;
    }

    public Entrega finalizarEntregaAoCliente(Entrega entrega) {
        return finalizarEntregaAoClienteInterface.finalizarEntrega(entrega);
    }
}
