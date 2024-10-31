package br.com.fiap.grupo19.msentrega.application.usecases.endereco;

import br.com.fiap.grupo19.msentrega.application.gateways.endereco.RetornarMelhoresRotasInterface;
import br.com.fiap.grupo19.msentrega.domain.entity.endereco.Endereco;
import br.com.fiap.grupo19.msentrega.domain.entity.endereco.Rotas;

public class RetornarMelhoresRotas {
    private final RetornarMelhoresRotasInterface retornarMelhoresRotasInterface;

    public RetornarMelhoresRotas(RetornarMelhoresRotasInterface retornarMelhoresRotasInterface) {
        this.retornarMelhoresRotasInterface = retornarMelhoresRotasInterface;
    }

    public Rotas retornarMelhoresRotas(Endereco origem, Endereco destino) {
        return retornarMelhoresRotasInterface.retornarMelhoresRotasInterface(origem, destino);
    }
}
