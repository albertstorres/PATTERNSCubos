package br.com.cubosacademy.util.generics;

// Classe de um tipo genérico O
public class Objeto<O> {
    // Atributo nome do tipo O;
    private O nome;

    // Construtoir recebe um nome do tipo O;
    public Objeto(O nome) {
        this.nome = nome;
    }

    // Get retorna um nome do tipo O;
    public O getNome() {
        return nome;
    }

    // Set recebe um nome do tipo O;
    public void setNome(O nome) {
        this.nome = nome;
    }
}
