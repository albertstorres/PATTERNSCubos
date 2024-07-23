package br.com.cubosacademy.util.collection;
import java.util.List;
import java.util.ArrayList;

public class ListTeste {
    public static void main(String[] args) {
        List lista = new ArrayList();
        lista.add("Morango");
        lista.add("Abacaxi");
        lista.add("Banana");
        lista.remove("Abacaxi");
        lista.remove(1);
//        lista.clear();
        lista.get(0);
        lista.set(0, "Verde");

        System.out.println(lista.size());
        System.out.println(lista.isEmpty());
        System.out.println(lista.contains("Morango"));

        System.out.println(lista);
        System.out.println(lista.get(0));
    }
}
