package collections;

import java.util.Set;

public class TestaCurso3 {
	
	public static void main(String[] args) {
		Curso curso = new Curso("curso de docker", "gustavo");
		
		curso.adicionar(new Aula("aula1", 30));
		curso.adicionar(new Aula("aula2", 27));
		curso.adicionar(new Aula("aula3", 29));
		
		curso.matricular(new Aluno("murilo", 1234));
		curso.matricular(new Aluno("paula", 1235));
		
		Set<Aluno> alunos = curso.getAlunos();
		
		alunos.add(new Aluno("murilo2", 15));
	}

}
