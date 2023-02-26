/*



Limpe o conjunto
Confira se o conjunto est� vazio


*/

package AulaSet;

import java.util.*;

public class ExercicioProposto1 {
    public static void main (String[] Args) {
        //Crie um conjunto contendo as cores do arco-�ris
        List<String> arcoIris = new ArrayList<>() {
        };
        arcoIris.add("Laranja");
        arcoIris.add("Verde");
        arcoIris.add("Vermelho");
        arcoIris.add("Anil");
        arcoIris.add("Amarelo");
        arcoIris.add("Azul");
        arcoIris.add("Violeta");
        //Exiba todas as cores uma abaixo da outra
        for (String cor : arcoIris) {
            System.out.println(cor);
        }
        //A quantidade de cores que o arco-�ris tem
        System.out.println("O arco-�ris tem " + arcoIris.size() + " cores.");

        // Exiba as cores em ordem alfab�tica
        Set<String> arcoIris2 = new TreeSet<>();
        arcoIris2.addAll(arcoIris);

        System.out.println("\nCores em ordem alfab�tica: ");

        Iterator<String> iterador = arcoIris2.iterator();
        while (iterador.hasNext()) {
            System.out.println(iterador.next());
        }

        //Exiba as cores na ordem inversa da que foi informada - dica usar Collections
        System.out.println("\nCores em ordem inversa: ");
        Collections.sort(arcoIris);
        Collections.reverse(arcoIris);
        Iterator<String> iterador2 = arcoIris.iterator();
        while (iterador2.hasNext()) {
            System.out.println(iterador2.next());
        }

        //Exiba todas as cores que come�am com a letra ?v?
        System.out.println("\nCores que come�am com 'V': ");
        for (String cor : arcoIris) {
            if (cor.toLowerCase().startsWith("v")) {
                System.out.println(cor  );

            }
        }

        //Remova todas as cores que n�o come�am com a letra ?v?
        Iterator<String> iterador4 = arcoIris.iterator();
        while (iterador4.hasNext()){
            if (iterador4.next().toLowerCase().startsWith("v")) iterador4.remove();
        }


//       Limpe o conjunto
        arcoIris.clear();
        arcoIris2.clear();

//       Confira se o conjunto est� vazio
        System.out.println(arcoIris.isEmpty());
        System.out.println(arcoIris2.isEmpty());

        System.out.println(arcoIris);
        System.out.println(arcoIris2);

    }

}

