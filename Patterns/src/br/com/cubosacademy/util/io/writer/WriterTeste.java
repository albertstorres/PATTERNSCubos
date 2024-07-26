package br.com.cubosacademy.util.io.writer;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriterTeste {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("Patterns/src/teste.txt", true); // Similar ao open do Python. Arquivo vem em bytes;
        BufferedWriter buifferesWriter = new BufferedWriter(fileWriter); // Converte de bytes para caracteres;
//        buifferesWriter.write("Algo novo adicionado."); // Escreve por cima do arquivo;
//        buifferesWriter.close(); // Se não fechar o arquivo, apaga tudo;
        buifferesWriter.append("Usando .append() consigo adicionar ao arquivo.\n");
        buifferesWriter.close();
// O uso do .append() opara acrescentar infoprmação ao arquivo exige alteração na abertura do arquivo.
// Em FileWriter(), passamos o caminho do arquivo como parâmetro e um boolean TRUE para append em seguda.
// Adiciona na mesma linha. Lembrar de adicionar texto com \n para pular linha.

    }
}
