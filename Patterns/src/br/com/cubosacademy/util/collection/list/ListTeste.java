package br.com.cubosacademy.util.collection.list;
import java.util.List;
import java.util.ArrayList;

public class ListTeste {
    public static void main(String[] args) {
        List <String> lista = new ArrayList<String>();
        lista.add("Morango");
        lista.add("Abacaxi");
        lista.add("Banana");
//        lista.add(2);
        lista.remove("Abacaxi");
        lista.remove(1);
//        lista.clear();
        lista.get(0);
        lista.set(0, "Verde");

        System.out.println(lista);
        System.out.println(lista.size());
        System.out.println(lista.isEmpty());
        System.out.println(lista.contains("Morango"));

        System.out.println(lista);
        System.out.println(lista.get(0));

        Pessoa albert = new Pessoa("Albert", 35);
        Pessoa anthony = new Pessoa("Anthony", 5);
        Pessoa antonio = new Pessoa("Antonio", 59);
        Pessoa drayton = new Pessoa("Drayton", 27);

        List <Pessoa> usuarios = new ArrayList<Pessoa>();
        usuarios.add(albert);
        usuarios.add(anthony);
        usuarios.add(antonio);
        usuarios.add(drayton);
//        usuarios.remove(albert);
//        usuarios.remove(0);

        System.out.println(usuarios);

        for (Pessoa usuario: usuarios) {
            System.out.println(usuario.getNome());
        }
    }
}
