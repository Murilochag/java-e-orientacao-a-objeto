package collections;

import java.sql.PseudoColumnUsage;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TestandoListaDeAulas {

    public static void main(String[] args) {


        List<Aula> listaDeAulas = new ArrayList<>();

        Aula aula1 = new Aula("aula ordenacao", 28);
        Aula aula2 = new Aula("aula primeira", 24);
        Aula aula3 = new Aula("aula listando obj", 19);

        listaDeAulas.add(aula1);
        listaDeAulas.add(aula2);
        listaDeAulas.add(aula3);
        
        listaDeAulas.forEach(aula -> {
            System.out.println(aula);
        });

        System.out.println(listaDeAulas);


        listaDeAulas.sort(Comparator.comparing(Aula::getTempo));
        System.out.println(listaDeAulas);

    }
}
