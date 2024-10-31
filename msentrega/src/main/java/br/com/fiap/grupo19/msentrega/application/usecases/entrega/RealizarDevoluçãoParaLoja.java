package br.com.fiap.grupo19.msentrega.application.usecases.entrega;

import br.com.fiap.grupo19.msentrega.application.gateways.entrega.RealizarDevoluçãoParaLojaInterface;
import br.com.fiap.grupo19.msentrega.domain.entity.entrega.Entrega;

public class RealizarDevoluçãoParaLoja {

    private final RealizarDevoluçãoParaLojaInterface realizarDevoluçãoParaLojaInterface;

    public RealizarDevoluçãoParaLoja(RealizarDevoluçãoParaLojaInterface realizarDevoluçãoParaLojaInterface) {
        this.realizarDevoluçãoParaLojaInterface = realizarDevoluçãoParaLojaInterface;
    }

    public Entrega realizarDevoluçãoParaLoja(Entrega entrega){
        return realizarDevoluçãoParaLojaInterface.realizarDevoluçãoParaLoja(entrega);
    }
}
