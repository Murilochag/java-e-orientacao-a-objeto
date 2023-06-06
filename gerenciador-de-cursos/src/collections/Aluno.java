package collections;

public class Aluno {
	
	private String nome;
	private int matricula;
	
	public Aluno(String nome, int matr) {

		if (nome == null) {
			throw new NullPointerException("Nome não pode ser nulo");
		}

		this.nome = nome;
		this.matricula = matr;
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	@Override
	public String toString() {

		return "[nome: " + this.getNome() + ", matricula: " + this.getMatricula()+ "]";
	}

	@Override
	public boolean equals(Object obj) {
		Aluno outroAluno = (Aluno) obj;
		return this.nome.equals(outroAluno.nome);
	}

	@Override
	public int hashCode() {
		return this.nome.hashCode();
	}
}
