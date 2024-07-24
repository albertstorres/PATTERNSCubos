package br.com.cubosacademy.util.collection.set;

import java.util.HashSet;
import java.util.Set;

public class SetTeste {
    public static void main (String[] args) {
        Set <String> nomes = new HashSet<String>();
        nomes.add("Albert");
        nomes.add("Anthony");

        System.out.println(nomes);
    }
}
