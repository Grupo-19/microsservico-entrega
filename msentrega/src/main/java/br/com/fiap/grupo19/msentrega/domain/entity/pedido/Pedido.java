package br.com.fiap.grupo19.msentrega.domain.entity.pedido;

import br.com.fiap.grupo19.msentrega.domain.entity.endereco.Endereco;

public class Pedido {
    private String id;
    private Endereco endereco;

    public Pedido(String id, Endereco endereco) {
        this.id = id;
        this.endereco = endereco;
    }

    public Pedido() {}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
