package br.com.cubosacademy.util.io.reader;

import java.io.*;

public class InputTeste {

    public static void main (String[] args) throws IOException {
        FileInputStream arquivo = new FileInputStream("Patterns/src/teste.txt");//Aqui faz a leitura do arquivo em bytes. Aceitar a sugestão da dica!
        InputStreamReader arquivoLido = new InputStreamReader(arquivo);// Já conseguimos saber os caracteres do arquivo em bytes.
        BufferedReader arquivoFinal = new BufferedReader(arquivoLido);

//        System.out.println(arquivoFinal.readLine()); //Imprime linha por linha!

        String linha = arquivoFinal.readLine(); //Primeira linha adicionada na variável linha.

        while (linha != null) { // Enquanto a linha for diferente de null será impressa.
            System.out.println(linha);
            linha = arquivoFinal.readLine(); //Adiciona a próxima linha do arquivo na variável linha.
        }
    }
}
