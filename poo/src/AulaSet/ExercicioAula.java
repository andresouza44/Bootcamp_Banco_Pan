
/*Dadas as seguintes informa��es sobre minhas s�ries favoritas,
crie um conjunto e ordene este conjunto exibindo:
(nome - genero - tempo de epis�dio);
S�rie 1 = Nome: got, genero: fantasia, tempoEpisodio: 60
S�rie 2 = nome: dark, genero: drama, tempoEpisodio: 60
S�rie 3 = nome: that '70s show, genero: com�dia, tempoEpisodio: 25
*/


package AulaSet;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ExercicioAula {
    public static void main (String[] args) {

        System.out.println("--\tOrdem Aleat�ria\t--");
        Set<Series> minhasSeries = new HashSet<>() {{
            add(new Series("got", "fantasia", 60));
            add(new Series("dark", "drama", 60));
            add(new Series("that '70s", "comedia", 25));
            add(new Series("Star Trek", "fic�ao", 60));

        }};
        for (Series serie: minhasSeries){
            System.out.println(serie.getNome() + " - " + serie.getGenero()+ " - " + serie.getTempoEpsodio());

        }

        Set<Series> minhasSeries2 = new LinkedHashSet<>(){{
            add(new Series("got", "fantasia", 60));
            add(new Series("dark", "drama", 60));
            add(new Series("that '70s", "comedia", 25));
            add(new Series("Star Trek", "fic�ao", 60));
        }};
        System.out.println("\n--\tOrdem de Inser��o\t--");
        for (Series serie: minhasSeries2) {
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpsodio());
        }

        Set <Series> minhasSeries3 = new TreeSet<>(minhasSeries);
        System.out.println("\n--\tOrdem de Natural (Tempo Eps�dio) \t--");
        for (Series serie : minhasSeries3){
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpsodio());
        }

        System.out.println("\n--\tOrdem Nome/Genero/Tempo eps�dio\t--");
        Set <Series> minhasSeries4 = new TreeSet<> (new ComparatorNomeGeneroTempoEpsodio());
        minhasSeries4.addAll(minhasSeries);

        for (Series serie : minhasSeries4){
            System.out.println(serie.getNome() + " - " + serie.getGenero() + " - " + serie.getTempoEpsodio());
        }

    }


}
