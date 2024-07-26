package br.com.cubosacademy.util.stream;

import java.util.List;
import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamTeste {
    public static void main (String[] args) {
        List <String> lista = new ArrayList<String>();
        lista.add("Albert");
        lista.add("Anthony");
        lista.add("Davi Balbino AKA Pernalonga");

//        System.out.println(lista.stream().count());

        Stream<String> lista2 = lista.stream();
//        lista2.forEach((nome) -> {
//            if (nome == "Albert") {
//                System.out.println(nome);
//            }
//        });
// Após a retirada do código acima, a transformação da Stream em lista abaixo funcionou.

        Stream<String> resultados = lista2.filter((nome) -> nome.equals("Anthony"));
        System.out.println(resultados.toList());

        Pessoa albert = new Pessoa("Albert", "Sevy");
        Pessoa anthony = new Pessoa("Anthony", "Sevy");
        Pessoa antonio = new Pessoa("Antonio", "Sevy");

        List<Pessoa> usuarios = new ArrayList<Pessoa>();
        usuarios.add(albert);
        usuarios.add(anthony);
        usuarios.add(antonio);

        Stream<Pessoa> usuarioStream = usuarios.stream();
        Stream<String> res = usuarioStream.map(usuario -> {
            return usuario.getNome() + " " + usuario.getSobrenome();
        });
        System.out.println(res.toList());
    }
}
