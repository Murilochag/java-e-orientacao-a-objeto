package collections;

public class Aluno {
	
	private String nome;
	private int matricula;
	
	public Aluno(String nome, int matr) {
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
	
	

}
