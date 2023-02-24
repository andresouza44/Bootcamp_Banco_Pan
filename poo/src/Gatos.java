import java.util.Comparator;

public class Gatos implements Comparable<Gatos> {
    private String nome;
    private Integer idade;
    private String cor;

    public Gatos(String nome, Integer idade, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public String getCor() {
        return cor;
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", cor='" + cor + '\'' +
                '}';
    }

    @Override
    public int compareTo(Gatos gatos) {
        return this.getNome().compareToIgnoreCase(gatos.toString());
    }


}

class ComparatorCor implements Comparator<Gatos>{

    @Override
    public int compare(Gatos g1, Gatos g2) {
        return g1.getCor().compareToIgnoreCase(g2.getCor());
    }

}
class CompartorIdade implements Comparator<Gatos> {
    @Override
    public int compare(Gatos g1, Gatos g2) {
        return Integer.compare(g1.getIdade(),g2.getIdade());
    }
}

class ComparatorNomeCorIdade implements Comparator<Gatos>{

    @Override
    public int compare(Gatos g1, Gatos g2) {
        int nome = g1.getNome().compareToIgnoreCase(g2.getNome());
        if (nome !=0 ) return nome;

        int cor = g1.getCor().compareToIgnoreCase((g2.getCor()));
        if (cor !=0 ) return cor;
        return g1.getIdade().compareTo(g2.getIdade());
    }
}


