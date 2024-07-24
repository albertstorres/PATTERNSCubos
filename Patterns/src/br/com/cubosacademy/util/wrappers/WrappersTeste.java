package br.com.cubosacademy.util.wrappers;

import java.util.HashMap;
import java.util.Map;

public class WrappersTeste {
    public static void main (String[] args) {
        Integer num1 = 10;
        Integer num2 = 2;

        System.out.println(num1.floatValue());// 10.0 (Transforma em float);
        System.out.println(num1.equals(11));// False (Confere igualdade);

        System.out.println(num1.compareTo(num2));// Retorna 0 para igual, -1 num1<num2 e 1 num1>num2 (Compara objetos);

        Boolean flag = true;
        Double valor = 12.9;
        System.out.println(valor.intValue());// Transforma em inteiro truncando o valor;

        Map<Integer, String> mapa = new HashMap<Integer, String>(); // Map não aceita tipos primitivos. Apenas Wrappers.
    }
}
