package br.com.fiap.grupo19.msentrega.infra.gateways.endereco;

import br.com.fiap.grupo19.msentrega.domain.entity.endereco.Endereco;
import br.com.fiap.grupo19.msentrega.infra.persistence.endereco.EnderecoEntity;

public class EnderecoMapper {

    public Endereco toDomain(EnderecoEntity input){
        return new Endereco(input.getId(),
                input.getNumero(),
                input.getBairro(),
                input.getCidade(),
                input.getEstado(),
                input.getCep(),
                input.getLogradouro(),
                input.getComplemento(),
                input.getLatitude(),
                input.getLongitude());
    }

    public EnderecoEntity toDomain(Endereco input){
        return new EnderecoEntity(input.getId(),
                input.getNumero(),
                input.getBairro(),
                input.getCidade(),
                input.getEstado(),
                input.getCep(),
                input.getLogradouro(),
                input.getComplemento(),
                input.getLatitude(),
                input.getLongitude());
    }
}
