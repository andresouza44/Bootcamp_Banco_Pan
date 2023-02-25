package Listas;

import java.util.*;

public class OrdenacaoLista {
    public static void main (String[] args){

        List<Gatos> meusGatos = new ArrayList<>(){{
           add(new Gatos("Andre",18, "preto"));
           add(new Gatos("Joao",6, "amarelo"));
           add(new Gatos("Joao",12, "amarelo"));
        }};

        System.out.println("Lista Ordem de Insersão :");
        System.out.println(meusGatos);

        System.out.println("\nLista bagunçada ");
        Collections.shuffle(meusGatos);
        System.out.println(meusGatos);

        System.out.println("\nLista ordenada por nome ");
        Collections.sort(meusGatos);
        System.out.println(meusGatos);

        System.out.println("\nLista ordenada por Idade: ");
        Collections.sort(meusGatos, new CompartorIdade());
        System.out.println(meusGatos);

        System.out.println("\nLista ordenada por Cor: ");
       // Collections.sort(meusGatos, new ComparatorCor());
        meusGatos.sort( new ComparatorCor());
        System.out.println(meusGatos);

        System.out.println("\nLista ordenada por NomeCorIdade: ");
       // Collections.sort(meusGatos, new ComparatorCor());
        meusGatos.sort( new ComparatorNomeCorIdade());
        System.out.println(meusGatos);
    }


}
