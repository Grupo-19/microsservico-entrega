package br.com.fiap.grupo19.msentrega.application.gateways.entrega;

import br.com.fiap.grupo19.msentrega.domain.entity.entrega.Entrega;

import java.util.List;

public interface ObterTodasAsEntregasInterface {
    List<Entrega> obterTodasEntregas();
}