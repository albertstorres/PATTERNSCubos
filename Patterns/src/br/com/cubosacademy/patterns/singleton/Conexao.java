package br.com.cubosacademy.patterns.singleton;

public final class Conexao {
    private static Conexao instancia;
    private String bancodedados;

    private Conexao(String bancodedados) {
        this.bancodedados = bancodedados;
    }

    public static Conexao getInstance(String bancodedados) {
        if (instancia == null) {
            instancia = new Conexao(bancodedados);
        }
        return instancia;
    }

    public String getBancodedados() {
        return this.bancodedados;
    }
}
