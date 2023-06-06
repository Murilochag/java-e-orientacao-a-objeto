package collections;

import java.util.Set;

public class TestaCurso4 {
	
	public static void main(String[] args) {
		Curso curso = new Curso("curso de docker", "gustavo");
		
		curso.adicionar(new Aula("aula1", 30));
		curso.adicionar(new Aula("aula2", 27));
		curso.adicionar(new Aula("aula3", 29));
		
		Aluno murilo = new Aluno("murilo", 1234);
		Aluno paula = new Aluno("paula", 1235);

		curso.matricular(murilo);
		curso.matricular(paula);

		System.out.println(curso.estaMatriculado(murilo));
	}

}
