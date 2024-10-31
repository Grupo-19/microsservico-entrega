package br.com.fiap.grupo19.msentrega.infra.gateways.pedido;

import br.com.fiap.grupo19.msentrega.domain.entity.pedido.Pedido;
import br.com.fiap.grupo19.msentrega.infra.persistence.pedido.PedidoEntity;

public class PedidoMapper {

    public Pedido toDomain(PedidoEntity input){
        return new Pedido(input.getId(),
                input.getEndereco());
    }

    public PedidoEntity toEntity(Pedido input){
        return new PedidoEntity(input.getId(),
                input.getEndereco());
    }
}
