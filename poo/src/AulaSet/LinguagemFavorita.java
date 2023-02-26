package AulaSet;
//Crie uma classe LinguagemFavorita que possua os atributos nome, anoDeCriacao e ide. Em seguida,

import java.util.Comparator;
import java.util.Objects;

public class LinguagemFavorita implements Comparable <LinguagemFavorita> {
    private String nome;
    private Integer anoDeCriacao;
    protected String ide;

    public LinguagemFavorita(String nome, Integer anoDeCriacao, String ide) {
        this.nome = nome;
        this.anoDeCriacao = anoDeCriacao;
        this.ide = ide;
    }

    public String getNome() {
        return nome;
    }

    public Integer getAnoDeCriacao() {
        return anoDeCriacao;
    }

    public String getIde() {
        return ide;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LinguagemFavorita that = (LinguagemFavorita) o;
        return Objects.equals(nome, that.nome) && Objects.equals(anoDeCriacao, that.anoDeCriacao) && Objects.equals(ide, that.ide);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, anoDeCriacao, ide);
    }

    public void setAnoDeCriacao(Integer anoDeCriacao) {
        this.anoDeCriacao = anoDeCriacao;
    }

    public void setIde(String ide) {
        this.ide = ide;
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", anoDeCriacao=" + anoDeCriacao +
                ", ide='" + ide + '\'' +
                '}';
    }

    @Override
    public int compareTo(LinguagemFavorita linguagem) {
        return this.getNome().toLowerCase().compareTo(linguagem.getNome().toLowerCase());
    }

}
class ComparadorIDE implements Comparator<LinguagemFavorita> {

    @Override
    public int compare(LinguagemFavorita l1, LinguagemFavorita l2) {
        int ide = l1.getIde().toLowerCase().compareTo(l2.getIde().toLowerCase());
        return ide;

    }
}

class ComparadorAnoIde implements Comparator<LinguagemFavorita> {

    @Override
    public int compare(LinguagemFavorita l1, LinguagemFavorita l2) {
       int ano = Integer.compare(l1.getAnoDeCriacao(),l2.getAnoDeCriacao());
       if ( ano!= 0) return ano;
       int ide = l1.getIde().toLowerCase().compareTo(l2.getIde().toLowerCase());
       return ide;

    }
}

class ComparadorAnoNome implements Comparator<LinguagemFavorita>{

    @Override
    public int compare(LinguagemFavorita l1, LinguagemFavorita l2) {
        int ano = l1.getAnoDeCriacao().compareTo(l2.getAnoDeCriacao());
        if ( ano !=0) return ano;
        int nome = l1.getNome().toLowerCase().compareTo(l2.getNome().toLowerCase());
        return nome;
    }
}