package br.com.fiap.grupo19.msentrega.infra.gateways.entrega;

import br.com.fiap.grupo19.msentrega.application.gateways.entrega.*;
import br.com.fiap.grupo19.msentrega.domain.entity.entrega.Entrega;
import br.com.fiap.grupo19.msentrega.domain.entity.entrega.Status;
import br.com.fiap.grupo19.msentrega.domain.entity.funcionario.Funcionario;
import br.com.fiap.grupo19.msentrega.domain.entity.pedido.Pedido;
import br.com.fiap.grupo19.msentrega.infra.persistence.entrega.EntregaEntity;
import br.com.fiap.grupo19.msentrega.infra.persistence.entrega.EntregaRepository;
import br.com.fiap.grupo19.msentrega.infra.persistence.funcionario.FuncionarioRepository;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

public class RepositorioDeEntregaJpa implements
        AtualizarStatusDaEntregaInterface,
        FinalizarEntregaAoClienteInterface,
        IniciarEntregaInterface,
        ObterEntregasPorIDFuncionarioInterface,
        ObterTodasAsEntregasInterface,
        ObterUmaEntregaPorIDInterface,
        RealizarDevoluçãoParaLojaInterface,
        ReceberPedidoDaLojaInterface {

    private final EntregaRepository repository;
    private final FuncionarioRepository funcionarioRepository;
    private final EntregaMapper mapper;

    public RepositorioDeEntregaJpa(EntregaRepository repository, FuncionarioRepository funcionarioRepository, EntregaMapper mapper) {
        this.repository = repository;
        this.funcionarioRepository = funcionarioRepository;
        this.mapper = mapper;
    }

    @Override
    public Entrega atualizarStatusDaEntrega(Entrega entrega, Status status) {
        EntregaEntity entity = checarCondicaoDaEntrega(entrega);
        entity.setStatus(status);
        return mapper.toDomain(repository.save(entity));
    }

    @Override
    public Entrega finalizarEntrega(Entrega entrega) {
        EntregaEntity entity = checarCondicaoDaEntrega(entrega);
        entity.setStatus(Status.REALIZADA);
        return mapper.toDomain(repository.save(entity));
    }

    @Override
    public Entrega iniciarEntrega(Entrega entrega) {
        EntregaEntity entity = checarCondicaoDaEntrega(entrega);
        entity.setStatus(Status.EM_TRANSITO);
        return mapper.toDomain(repository.save(entity));
    }

    @Override
    public List<Entrega> obterEntregaPorIDFuncionario(Long idFuncionario) {
        return repository.findByFuncionarioId(idFuncionario)
                .stream()
                .map(mapper::toDomain)
                .collect(Collectors.toList());
    }

    @Override
    public List<Entrega> obterTodasEntregas() {
        return repository.findAll()
                .stream()
                .map(mapper::toDomain)
                .collect(Collectors.toList());
    }

    @Override
    public Entrega obterUmaEntregaPorID(Long id) {
        return repository.findById(id).orElseThrow(() -> new NoSuchElementException("Não foi possível encontrar a entrega"))
    }

    @Override
    public Entrega realizarDevoluçãoParaLoja(Entrega entrega) {
        EntregaEntity entity = checarCondicaoDaEntrega(entrega);
        entity.setStatus(Status.DEVOLVIDA);
        return mapper.toDomain(repository.save(entity));
    }

    @Override
    public Entrega receberPedidoDaLoja(Funcionario funcionario, Pedido pedido) {
        Entrega entrega = new Entrega(funcionario, pedido, Status.RECEBIDA);
        EntregaEntity entity = mapper.toEntity(entrega);
        funcionarioRepository.findById(entity.getFuncionario().getId()).orElseThrow(() ->
                new NoSuchElementException("Não foi possível encontrar o funcionário para fazer a entrega"));
        return mapper.toDomain(repository.save(entity));
    }

    public EntregaEntity checarCondicaoDaEntrega(Entrega entrega) {
        EntregaEntity entity = repository.findById(entrega.getId()).orElseThrow(() ->
                new NoSuchElementException("Entrega não encontrada"));

        if(entity.getStatus().equals(Status.REALIZADA)) throw new
                IllegalArgumentException("Essa entrega já foi finalizada");

        return entity;
    }
}
