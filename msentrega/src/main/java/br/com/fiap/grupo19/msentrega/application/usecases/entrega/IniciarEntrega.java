package br.com.fiap.grupo19.msentrega.application.usecases.entrega;

import br.com.fiap.grupo19.msentrega.application.gateways.entrega.IniciarEntregaInterface;
import br.com.fiap.grupo19.msentrega.domain.entity.entrega.Entrega;

public class IniciarEntrega {

    private final IniciarEntregaInterface iniciarEntregaInterface;

    public IniciarEntrega(IniciarEntregaInterface iniciarEntregaInterface) {
        this.iniciarEntregaInterface = iniciarEntregaInterface;
    }

    public Entrega iniciarEntrega(Entrega entrega) {
        return iniciarEntregaInterface.iniciarEntrega(entrega);
    }
}
