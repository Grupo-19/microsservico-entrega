package br.com.fiap.grupo19.msentrega.application.usecases.entrega;

import br.com.fiap.grupo19.msentrega.application.gateways.entrega.ObterTodasAsEntregasInterface;
import br.com.fiap.grupo19.msentrega.domain.entity.entrega.Entrega;

import java.util.List;

public class ObterTodasAsEntregas {

    private final ObterTodasAsEntregasInterface obterTodasAsEntregasInterface;

    public ObterTodasAsEntregas(ObterTodasAsEntregasInterface obterTodasAsEntregasInterface) {
        this.obterTodasAsEntregasInterface = obterTodasAsEntregasInterface;
    }

    public List<Entrega> obterTodasAsEntregas() {
        return obterTodasAsEntregasInterface.obterTodasEntregas();
    }
}
