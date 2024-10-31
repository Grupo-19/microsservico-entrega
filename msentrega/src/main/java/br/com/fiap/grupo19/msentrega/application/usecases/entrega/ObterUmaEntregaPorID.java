package br.com.fiap.grupo19.msentrega.application.usecases.entrega;

import br.com.fiap.grupo19.msentrega.application.gateways.entrega.ObterUmaEntregaPorIDInterface;
import br.com.fiap.grupo19.msentrega.domain.entity.entrega.Entrega;

public class ObterUmaEntregaPorID {

    private final ObterUmaEntregaPorIDInterface obterUmaEntregaPorIDInterface;

    public ObterUmaEntregaPorID(ObterUmaEntregaPorIDInterface obterUmaEntregaPorIDInterface) {
        this.obterUmaEntregaPorIDInterface = obterUmaEntregaPorIDInterface;
    }

    public Entrega obterUmaEntregaPorID(Long id) {
        return obterUmaEntregaPorIDInterface.obterUmaEntregaPorID(id);
    }
}
