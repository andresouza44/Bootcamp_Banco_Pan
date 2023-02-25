package Listas;// Ecercícios de JAva Collection
// LIST
import com.sun.source.tree.WhileLoopTree;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;

public class Listas<notas2> {
    public static void main(String[] args){
        // Cria uma lista notas com 7 notas e imprima

        List<Double> notas =new ArrayList<Double>();
        notas.add(7d);
        notas.add(8.5);
        notas.add(9.0);
        notas.add(4.5);
        notas.add(8.5);
        notas.add(3d);
        notas.add(6d);

        System.out.println(notas);
        System.out.println("\nExiba a posição da nota 9: " + notas.indexOf(9d));

        // Adicione a nota 8 na Posição 4

        notas.add(4, 8.0);
        System.out.println(notas);

        System.out.println("\nSubstitua a  nota 9 pela nota 6 ");
        notas.set(notas.indexOf(9d),6d );
        System.out.println(notas);

        System.out.print("\nExiba a soma das notas - Total: ");
        double somaNotas = 0;

        for ( double i : notas){
            somaNotas += i;
        }
            System.out.println(somaNotas);

        // Outra Maneira

        Iterator<Double> iterador = notas.iterator();
        double soma=0;
        while (iterador.hasNext()){
            soma += iterador.next();

        }
        System.out.println("\nExiba a soma das notas outro método - Total: " + soma );



    /*
Para você: Resolva esses exercícios utilizando os métodos da implementação LinkedList:
        System.out.println("Crie uma lista chamada notas2 " +
                "e coloque todos os elementos da list Arraylist nessa nova lista: ");
        System.out.println("Mostre a primeira nota da nova lista sem removê-lo: ");
        System.out.println("Mostre a primeira nota da nova lista removendo-o: ");
*/
        LinkedList<Double> nota2 = new LinkedList<Double>();
        nota2.addAll(notas);
        System.out.println("\nLista de Notas 2:" +  nota2);

        System.out.println("Mostre a primeira nota da nova lista sem removê-lo: get(0)   " + nota2.get(0));
        System.out.println("Mostre a primeira nota da nova lista sem removê-lo: getFirst " + nota2.getFirst());
        System.out.println("\nLista de Notas 2:" +  nota2);

        System.out.println("Mostre a primeira nota da nova lista sem removê-lo: peek      " + nota2.peek());
        System.out.println("Mostre a primeira nota da nova lista sem removê-lo: peelFisrt " + nota2.peekFirst());
        System.out.println("\nLista de Notas 2:" +  nota2);

        System.out.println("Mostre a primeira nota da nova lista removendo-o: poll      " + nota2.poll());
        System.out.println("\nLista de Notas 2:" +  nota2);

        System.out.println("Mostre a primeira nota da nova lista removendo-o: pollFirst " + nota2.pollFirst());
        System.out.println("\nLista de Notas 2:" +  nota2);
    }





}
