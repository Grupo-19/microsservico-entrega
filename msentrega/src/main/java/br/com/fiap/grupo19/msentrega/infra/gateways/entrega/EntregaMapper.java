package br.com.fiap.grupo19.msentrega.infra.gateways.entrega;

import br.com.fiap.grupo19.msentrega.domain.entity.entrega.Entrega;
import br.com.fiap.grupo19.msentrega.infra.gateways.funcionario.FuncionarioMapper;
import br.com.fiap.grupo19.msentrega.infra.gateways.pedido.PedidoMapper;
import br.com.fiap.grupo19.msentrega.infra.persistence.entrega.EntregaEntity;

public class EntregaMapper {

    private FuncionarioMapper funcionarioMapper = new FuncionarioMapper();
    private PedidoMapper pedidoMapper = new PedidoMapper();

    public Entrega toDomain(EntregaEntity input) {
        return new Entrega(input.getId(),
                funcionarioMapper.toDomain(input.getFuncionario()),
                pedidoMapper.toDomain(input.getPedido()),
                input.getStatus(),
                input.getRecebedor());
    }

    public EntregaEntity toEntity(Entrega input) {
        return new EntregaEntity(input.getId(),
                funcionarioMapper.toEntity(input.getFuncionario()),
                pedidoMapper.toEntity(input.getPedido()),
                input.getStatus(),
                input.getRecebedor());
    }
}
