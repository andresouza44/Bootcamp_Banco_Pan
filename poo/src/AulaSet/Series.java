package AulaSet;

import java.util.Comparator;
import java.util.Locale;
import java.util.Objects;

public class Series implements Comparable <Series> {
    private String nome;
    private String genero;
    private Integer tempoEpsodio;

    public Series(String nome, String genero, Integer tempoEpsodio) {
        this.nome = nome;
        this.genero = genero;
        this.tempoEpsodio = tempoEpsodio;
    }

    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }

    public Integer getTempoEpsodio() {
        return tempoEpsodio;
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", genero='" + genero + '\'' +
                ", tempoEpsodio=" + tempoEpsodio +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Series series = (Series) o;
        return nome.equals(series.nome) && genero.equals(series.genero) && tempoEpsodio.equals(series.tempoEpsodio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, genero, tempoEpsodio);
    }

    @Override
    public int compareTo(Series serie) {

        int tempoEpsodio = Integer.compare(this.getTempoEpsodio(),serie.getTempoEpsodio());
        if (tempoEpsodio != 0) return  tempoEpsodio;

        return this.getGenero().toLowerCase().compareTo(serie.getGenero().toLowerCase());
    }

}
class  ComparatorNomeGeneroTempoEpsodio implements Comparator <Series> {

    @Override
    public int compare(Series s1, Series s2) {
        int nome = s1.getNome().toLowerCase().compareTo(s2.getNome().toLowerCase());
        if ( nome !=0) return nome;
        int genero = s1.getGenero().toLowerCase().compareTo(s2.getGenero().toLowerCase());
        if (genero !=0) return genero;

        return Integer.compare(s1.getTempoEpsodio(), s2.getTempoEpsodio());
    }


}

