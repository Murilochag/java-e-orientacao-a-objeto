package collections;

import java.util.*;

public class Curso {

    private String nome;
    private String instrutor;
    private List<Aula> aulas = new LinkedList<>();
    private Set<Aluno> alunos = new HashSet<>();

    private Map<Integer, Aluno> matriculaParaAluno = new HashMap<>();


    public Curso(String nome, String instrutor) {
        this.nome = nome;
        this.instrutor = instrutor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getInstrutor() {
        return instrutor;
    }

    public void setInstrutor(String instrutor) {
        this.instrutor = instrutor;
    }

    public List<Aula> getAulas() {
        return Collections.unmodifiableList(this.aulas);
    }

    public void adicionar(Aula aula) {
        this.aulas.add(aula);
    }

    public int getTempoTotal(){
        int tempoTotal = 0;
        for(Aula aula : aulas){
            tempoTotal += aula.getTempo();
        }
        return tempoTotal;

    }
    
    public void matricular(Aluno aluno) {
    	this.alunos.add(aluno);
        this.matriculaParaAluno.put(aluno.getMatricula(), aluno);
    }
    
    public Set<Aluno> getAlunos(){
    	return Collections.unmodifiableSet(this.alunos);
    }

    public boolean estaMatriculado(Aluno aluno) {
        return alunos.contains(aluno);
    }

    public Aluno buscarMatriculado(int numMatricula) {
        return matriculaParaAluno.get(numMatricula);
    }
}
