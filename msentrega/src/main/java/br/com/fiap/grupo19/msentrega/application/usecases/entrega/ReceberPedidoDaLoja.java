package br.com.fiap.grupo19.msentrega.application.usecases.entrega;

import br.com.fiap.grupo19.msentrega.application.gateways.entrega.ReceberPedidoDaLojaInterface;
import br.com.fiap.grupo19.msentrega.domain.entity.entrega.Entrega;
import br.com.fiap.grupo19.msentrega.domain.entity.funcionario.Funcionario;
import br.com.fiap.grupo19.msentrega.domain.entity.pedido.Pedido;

public class ReceberPedidoDaLoja {

    private final ReceberPedidoDaLojaInterface receberPedidoDaLojaInterface;

    public ReceberPedidoDaLoja(ReceberPedidoDaLojaInterface receberPedidoDaLojaInterface) {
        this.receberPedidoDaLojaInterface = receberPedidoDaLojaInterface;
    }

    public Entrega receberPedidoDaLoja(Funcionario funcionario, Pedido pedido) {
        return receberPedidoDaLojaInterface.receberPedidoDaLoja(funcionario, pedido);
    }
}
