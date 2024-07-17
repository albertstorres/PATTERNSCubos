package br.com.cubosacademy.patterns.builder;

public class BuilderTeste {
    public static void main(String[] args) {
        Paciente albert = new Paciente("Albert", "asbt@cesar.school","076.666.555-00");
        //Daforma feita acima, são poucos atributos e lembramos da ordem dos parâmetros. Em objetos
        //complexos isso pode não ocorrer. Logo usamos o Builder para facilitar o processo.
        PacienteBuilder builder = new PacienteBuilder();
        //Agora criamos o objeto a partir de um passo a passo.
        builder.setNome("Anthony");
        builder.setEmail("antonhy@email.com");
        builder.setCpf("777.666.555-44");
        //Agora chamamos o getResultado da classe Builder:
        Paciente anthony = builder.getResultado();
        //O getResultado retorna uma estância da classe Paciente com as informações que o builder está
        // criando. Isso finaliza a criação do objeto que estamos montando com o Builder. Toda a montagem
        // deve ser implementada antes de chamar o getResuldado.
        System.out.println(anthony.getNome());

    }
}
