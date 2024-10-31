package br.com.fiap.grupo19.msentrega.domain.entity.entrega;

import br.com.fiap.grupo19.msentrega.domain.entity.funcionario.Funcionario;
import br.com.fiap.grupo19.msentrega.domain.entity.pedido.Pedido;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

public class Entrega {

    private Long id;

    @ManyToOne
    @JoinColumn(name = "funcionario_id")
    private Funcionario funcionario;
    private Pedido pedido;
    private Status status;
    private String recebedor;

    public Entrega(Long id, Funcionario funcionario, Pedido pedido, Status status, String recebedor) {
        this.id = id;
        this.funcionario = funcionario;
        this.pedido = pedido;
        this.status = status;
        this.recebedor = recebedor;
    }

    public Entrega(Funcionario funcionario, Pedido pedido, Status status) {
        this.funcionario = funcionario;
        this.pedido = pedido;
        this.status = status;
    }

    public Entrega() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getRecebedor() {
        return recebedor;
    }

    public void setRecebedor(String recebedor) {
        this.recebedor = recebedor;
    }
}
