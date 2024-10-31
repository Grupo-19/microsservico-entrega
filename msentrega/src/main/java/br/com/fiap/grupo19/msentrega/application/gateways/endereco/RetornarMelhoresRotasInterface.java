package br.com.fiap.grupo19.msentrega.application.gateways.endereco;

import br.com.fiap.grupo19.msentrega.domain.entity.endereco.Endereco;
import br.com.fiap.grupo19.msentrega.domain.entity.endereco.Rotas;

public interface RetornarMelhoresRotasInterface {
    Rotas retornarMelhoresRotasInterface(Endereco origem, Endereco destino);
}
