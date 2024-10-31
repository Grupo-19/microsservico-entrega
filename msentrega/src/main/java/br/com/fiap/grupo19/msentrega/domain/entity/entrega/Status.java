package br.com.fiap.grupo19.msentrega.domain.entity.entrega;

public enum Status {
    REALIZADA("Realizada"),
    DEVOLVIDA("Devolvida à loja"),
    EM_TRANSITO("Saiu para entrega"),
    RECEBIDA("No centro de distribuição");

    private final String descricao;

    Status(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return descricao;
    }
}
