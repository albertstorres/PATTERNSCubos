package br.com.cubosacademy.util.lambda;
import java.util.List;
import java.util.ArrayList;

interface TesteLambda {
    public String executar (String texto);
}
interface ICalc{
    public double soma (double num1, double num2);
}

public class LambdaTeste {
    public static void main(String[] args) {
        Runnable runnable = () -> {
            System.out.println("Olá pessoal!");
        };
        runnable.run();

        TesteLambda teste = (String texto) -> {
            return texto;
        };
        System.out.println(teste.executar("Olá mundo!"));

        ICalc calculadora = (double num1, double num2) -> {
            return num1 + num2;
        };
        System.out.println(calculadora.soma(12.5, 6.6));

        List <String> usuarios = new ArrayList<String>();
        usuarios.add("Albert");
        usuarios.add("Anthony");
        usuarios.add("Antonio");
        usuarios.add("Stephanny");

        usuarios.forEach((usuario) -> {
            System.out.println(usuario + " Cubos");
        });
    }
}
