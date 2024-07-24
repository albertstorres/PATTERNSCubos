package br.com.cubosacademy.util.collection.map;

import java.util.HashMap;
import java.util.Map;

public class MapTeste {
    public static void main (String[] args) {
        Map <String, String> mapa = new HashMap<String, String>();
        mapa.put("122", "Albert");
        mapa.put("123", "Albert Sevy"); // A implementação seguionte assume o lugar da anterior quando repetimos a chave;
        mapa.put("124", "Anthony");

        for (String nome: mapa.values()) {// Imprime em formato de dicionário
            System.out.println(nome);
        }
        System.out.println(mapa.keySet());// Imprime as chaves como lista.
        System.out.println(mapa.values());// Imprime os valores como lista.
        System.out.println();

        System.out.println(mapa.get("123"));
        System.out.println(mapa);
    }
}
