package Map;

import java.util.Objects;

public class Populacao {
    private String estado;
    private Double populacao;

    public Populacao(String estado, Double populacao) {
        this.estado = estado;
        this.populacao = populacao;
    }

    public String getEstado() {
        return estado;
    }

    public Double getPopulacao() {
        return populacao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Populacao populacao1 = (Populacao) o;
        return estado.equals(populacao1.estado) && populacao.equals(populacao1.populacao);
    }

    @Override
    public String toString() {
        return "{" +
                "estado='" + estado + '\'' +
                ", populacao=" + populacao +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(estado, populacao);
    }
}




