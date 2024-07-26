package br.com.cubosacademy.util.generics;

public class GenericsTeste {
    public static void main (String[] args) {
        Objeto<String> objeto = new Objeto<String>("Albert");
        // Criamos um classe de tipo genérico e ao implementar, definimos o tipo de dado que ela deve receber;
        Objeto<Integer> objeto2 = new Objeto<Integer>(123);//Novo objeto com tipo diferente;
        System.out.println(objeto.getNome());
        System.out.println(objeto2.getNome());
    }
}

