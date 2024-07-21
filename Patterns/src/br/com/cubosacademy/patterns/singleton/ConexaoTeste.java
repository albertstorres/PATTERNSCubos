package br.com.cubosacademy.patterns.singleton;

public class ConexaoTeste {
    public static void main(String[] args) {
        Conexao conexao = Conexao.getInstance("cubosacademy");
        Conexao conexao2 = Conexao.getInstance("cubosacademy2");
        System.out.println(conexao.getBancodedados());
        System.out.println(conexao2.getBancodedados());
    }
}
