package br.com.cubosacademy.patterns.builder;

public class PacienteBuilder implements IPacienteBuilder {
    private String nome, email, cpf;

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Paciente getResultado() {
        return new Paciente(nome, email, cpf);
    }
}
