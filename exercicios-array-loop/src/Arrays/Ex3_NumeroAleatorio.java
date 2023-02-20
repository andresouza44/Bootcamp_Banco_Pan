package Arrays;
import java.util.Random;
/*
Ler 20 números inteiros aleatório entre (0 e 100) a armazen em um vetor
Mostro os número e seus sucessores.
 */


public class Ex3_NumeroAleatorio {
    public static void main(String[] args) {
        Random random = new Random();
        int [] numerosAleatórios = new int [20];
        for (int i=0; i<20; i++){
            int numero = random.nextInt(100);
            numerosAleatórios[i] = numero;

        }
        System.out.println("Números Aleatórios: ");
        for ( int i: numerosAleatórios) {
            System.out.print(i + " ");
        }
        System.out.println("\n\nNúmeros Aleatórios Subsequentes: ");
        for ( int i: numerosAleatórios){
            System.out.print((i+1)+" ");

            }

    }

}
