package br.com.fiap.grupo19.msentrega.application.gateways.entrega;

import br.com.fiap.grupo19.msentrega.domain.entity.entrega.Entrega;

public interface ObterUmaEntregaPorIDInterface {
    Entrega obterUmaEntregaPorID(Long id);
}
