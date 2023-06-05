package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaCurso2 {

    public static void main(String[] args) {


        Curso javaColecoes = new Curso("dominando coleçoes", "paulo silveira");

        javaColecoes.adicionar(new Aula("aula 1", 10));
        javaColecoes.adicionar(new Aula("aula 2", 13));
        javaColecoes.adicionar(new Aula("aula 3", 9));

        List<Aula> aulasImutaveis = javaColecoes.getAulas();
        System.out.println(aulasImutaveis);

        List<Aula> aulas = new ArrayList<>(aulasImutaveis);

        Collections.sort(aulas);
        System.out.println(aulas);

        System.out.println(javaColecoes.getTempoTotal());
    }
}
