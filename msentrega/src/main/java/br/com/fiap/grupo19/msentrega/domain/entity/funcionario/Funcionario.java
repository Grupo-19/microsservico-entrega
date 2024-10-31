package br.com.fiap.grupo19.msentrega.domain.entity.funcionario;

public class Funcionario {

    private Long id;
    private String nome;
    private String cpf;
    private String email;
    private String telefone;

    public Funcionario(Long id, String nome, String cpf, String email, String telefone) {

        if(cpf == null || cpf.isBlank() || nome == null || nome.isBlank() || email == null || email.isBlank()){
            throw new IllegalArgumentException("Campo Obrigatório está nulo ou vazio");
        }

        if(!cpf.matches("\\d{3}\\.\\d{3}\\.\\d{3}\\-\\d{2}")){
            throw new IllegalArgumentException("CPF no formato inválido");
        }

        if(!email.contains("@") && !email.contains(".com")){
            throw new IllegalArgumentException("Email no formato incorreto");
        }

        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.telefone = telefone;
    }

    public Funcionario() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
