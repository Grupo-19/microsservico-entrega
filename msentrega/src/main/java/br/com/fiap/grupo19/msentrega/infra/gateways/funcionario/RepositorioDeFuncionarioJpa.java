package br.com.fiap.grupo19.msentrega.infra.gateways.funcionario;

import br.com.fiap.grupo19.msentrega.application.gateways.funcionario.*;
import br.com.fiap.grupo19.msentrega.domain.entity.funcionario.Funcionario;
import br.com.fiap.grupo19.msentrega.infra.persistence.funcionario.FuncionarioEntity;
import br.com.fiap.grupo19.msentrega.infra.persistence.funcionario.FuncionarioRepository;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

public class RepositorioDeFuncionarioJpa implements
        CadastrarFuncionarioInterface,
        EditarFuncionarioInterface,
        ExcluirFuncionarioInterface,
        ObterFuncionarioPorCPFInterface,
        ObterFuncionarioPorIDInterface,
ObterTodosOsFuncionariosInterface{

    private final FuncionarioRepository repository;
    private final FuncionarioMapper mapper;

    public RepositorioDeFuncionarioJpa(FuncionarioRepository repository, FuncionarioMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public Funcionario cadastrarFuncionario(Funcionario funcionario) {
        FuncionarioEntity entity = mapper.toEntity(funcionario);
        return mapper.toDomain(repository.save(entity));
    }

    @Override
    public Funcionario editarFuncionario(Funcionario funcionario) {
        repository.findById(funcionario.getId()).orElseThrow(() ->
                new NoSuchElementException("Funcionário não encontrado"));
        FuncionarioEntity entity = mapper.toEntity(funcionario);
        return mapper.toDomain(repository.save(entity));

    }

    @Override
    public void excluirFuncionario(Long id) {
        repository.findById(id).orElseThrow(() ->
                new NoSuchElementException("Funcionário não encontrado"));
        repository.deleteById(id);
    }

    @Override
    public Funcionario obterFuncionarioPorCPF(String cpf) {
        return mapper.toDomain(repository.findByCpf(cpf).orElseThrow(() ->
                new NoSuchElementException("Funcionário não encontrado")));
    }

    @Override
    public Funcionario obterFuncionarioPorID(Long id) {
        return mapper.toDomain(repository.findById(id).orElseThrow(() ->
                new NoSuchElementException("Funcionário não encontrado")));
    }

    @Override
    public List<Funcionario> obterFuncionarios() {
        return repository.findAll()
                .stream()
                .map(mapper::toDomain)
                .collect(Collectors.toList());
    }
}
