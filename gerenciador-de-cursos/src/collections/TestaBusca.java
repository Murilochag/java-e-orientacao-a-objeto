package collections;

public class TestaBusca {

    public static void main(String[] args) {
        Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");

        javaColecoes.adicionar(new Aula("Trabalhando com ArrayList", 21));
        javaColecoes.adicionar(new Aula("Criando uma Aula", 20));
        javaColecoes.adicionar(new Aula("Modelando com coleções", 24));

        Aluno a1 = new Aluno("Rodrigo Turini", 34672);
        Aluno a2 = new Aluno("Guilherme Silveira", 5617);
        Aluno a3 = new Aluno("Mauricio Aniche", 17645);

        javaColecoes.matricular(a1);
        javaColecoes.matricular(a2);
        javaColecoes.matricular(a3);

        System.out.println(javaColecoes.buscarMatriculado(12345));
    }
}
