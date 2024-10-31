package br.com.fiap.grupo19.msentrega.application.usecases.entrega;

import br.com.fiap.grupo19.msentrega.application.gateways.entrega.AtualizarStatusDaEntregaInterface;
import br.com.fiap.grupo19.msentrega.domain.entity.entrega.Entrega;
import br.com.fiap.grupo19.msentrega.domain.entity.entrega.Status;

public class AtualizarStatusDaEntrega {

    private final AtualizarStatusDaEntregaInterface atualizarStatusDaEntregaInterface;

    public AtualizarStatusDaEntrega(AtualizarStatusDaEntregaInterface atualizarStatusDaEntregaInterface) {
        this.atualizarStatusDaEntregaInterface = atualizarStatusDaEntregaInterface;
    }

    public Entrega atualizarStatusDaEntrega(Entrega entrega, Status status) {
        return atualizarStatusDaEntregaInterface.atualizarStatusDaEntrega(entrega, status);
    }
}
