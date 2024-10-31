package br.com.fiap.grupo19.msentrega.application.gateways.entrega;

import br.com.fiap.grupo19.msentrega.domain.entity.entrega.Entrega;
import br.com.fiap.grupo19.msentrega.domain.entity.funcionario.Funcionario;
import br.com.fiap.grupo19.msentrega.domain.entity.pedido.Pedido;

public interface ReceberPedidoDaLojaInterface {
    Entrega receberPedidoDaLoja(Funcionario funcionario, Pedido pedido);
}
