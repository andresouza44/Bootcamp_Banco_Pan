package Arrays;
import java.util.Random;
/*
Ler 20 n�meros inteiros aleat�rio entre (0 e 100) a armazen em um vetor
Mostro os n�mero e seus sucessores.
 */


public class Ex3_NumeroAleatorio {
    public static void main(String[] args) {
        Random random = new Random();
        int [] numerosAleat�rios = new int [20];
        for (int i=0; i<20; i++){
            int numero = random.nextInt(100);
            numerosAleat�rios[i] = numero;

        }
        System.out.println("N�meros Aleat�rios: ");
        for ( int i: numerosAleat�rios) {
            System.out.print(i + " ");
        }
        System.out.println("\n\nN�meros Aleat�rios Subsequentes: ");
        for ( int i: numerosAleat�rios){
            System.out.print((i+1)+" ");

            }

    }

}
