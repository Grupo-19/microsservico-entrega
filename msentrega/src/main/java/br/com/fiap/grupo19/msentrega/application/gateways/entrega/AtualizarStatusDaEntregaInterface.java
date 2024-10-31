package br.com.fiap.grupo19.msentrega.application.gateways.entrega;

import br.com.fiap.grupo19.msentrega.domain.entity.entrega.Entrega;
import br.com.fiap.grupo19.msentrega.domain.entity.entrega.Status;

public interface AtualizarStatusDaEntregaInterface {
    Entrega atualizarStatusDaEntrega(Entrega entrega, Status status);
}
