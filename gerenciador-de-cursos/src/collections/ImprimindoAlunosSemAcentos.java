package collections;

import java.util.*;

public class ImprimindoAlunosSemAcentos {

    public static void main(String[] args) {

        Set<String> alunos = new HashSet<>();
        alunos.add("Paulo");
        alunos.add("Alberto");
        alunos.add("Pedro");
        alunos.add("Nico");

        //tente imprimir os alunos usando foreach

        alunos.forEach(aluno -> System.out.println(aluno));

        Set<String> alunos2 = new HashSet<>();

        //1) adicione alguns alunos
        alunos2.add("murilo");
        alunos2.add("paula");
        alunos2.add("ana");
        alunos2.add("gabriel");

        //2) imprima o tamanho da colecao
        System.out.println(alunos2.size());

        //3) tente adicionar um aluno que existe
        alunos2.add("paula");

        //4) imprima novamente o tamanho da colecao
        System.out.println(alunos2.size());

        boolean adicionou = alunos.add("Pedro");
        System.out.println("Pedro foi adicionado ao Set? " + adicionou);

    }
}
