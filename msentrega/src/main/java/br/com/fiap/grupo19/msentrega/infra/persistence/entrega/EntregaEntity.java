package br.com.fiap.grupo19.msentrega.infra.persistence.entrega;

import br.com.fiap.grupo19.msentrega.domain.entity.entrega.Status;
import br.com.fiap.grupo19.msentrega.domain.entity.funcionario.Funcionario;
import br.com.fiap.grupo19.msentrega.domain.entity.pedido.Pedido;
import br.com.fiap.grupo19.msentrega.infra.persistence.funcionario.FuncionarioEntity;
import br.com.fiap.grupo19.msentrega.infra.persistence.pedido.PedidoEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "entrega")
public class EntregaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "funcionario")
    private FuncionarioEntity funcionario;

    @OneToOne
    @Column(name = "pedido")
    private PedidoEntity pedido;

    @Column(name = "status")
    private Status status;

    @Column(name = "recebedor")
    private String recebedor;
}
