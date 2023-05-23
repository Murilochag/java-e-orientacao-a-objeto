package collections;

public class Aula implements Comparable<Aula> {

    private String nome;
    private int tempo;

    public Aula(String nome, int tempo) {
        this.nome = nome;
        this.tempo = tempo;
    }

    @Override
    public String toString() {
        return "[nome: " + this.nome + ", tempo: " + this.tempo + " minutos]";
    }

    @Override
    public int compareTo(Aula outraAula) {
        return this.nome.compareTo(outraAula.getNome());
    }

    public String getNome() {
        return nome;
    }

    public int getTempo() {
        return tempo;
    }
}
