package collections;

public class TestaCurso {

    public static void main(String[] args) {

        Curso listaDeCursos = new Curso("collectons", "murilo carvalho");


        listaDeCursos.adicionar(new Aula("introduçao", 15));
        //listaDeCursos.getAulas().add(new Aula("paula", 20));


        System.out.println(listaDeCursos.getAulas());


    }
}
