package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestandoListas {

    public static void main(String[] args) {

        List<String> cursos = new ArrayList();

        var curso1 = "Spring Boot 3: desenvolva uma API Rest em Java";
        var curso11 = "Spring Boot 3 -";
        var curso2 = "Spring Boot 3: aplique boas práticas e proteja uma API Rest";
        var curso3 = "Spring Boot 3: documente, teste e prepare uma API para o deploy";


        cursos.add(curso1);
        cursos.add(curso11);
        cursos.add(curso2);
        cursos.add(curso3);

        cursos.remove(1);

        System.out.println("o primeiro curso da lista é: \n" + cursos.get(0));

        Collections.sort(cursos);

        cursos.forEach(curso -> {
            System.out.println("curso: " + curso);
        });

        for(String curso: cursos){
           System.out.println(curso);
        }

        System.out.println(cursos);


    }
}
