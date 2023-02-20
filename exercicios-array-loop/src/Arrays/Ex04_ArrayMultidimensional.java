package Arrays;

import java.util.Random;

/*
Criar uma Matrix 4x4 com núimeros Aleatórios entre 0 e 9
 */
public class Ex04_ArrayMultidimensional {
    public static void main(String[] args) {
        Random random = new Random();
        int [][] matriz= new int[4][4];

        for (int x=0; x< matriz.length; x++){
            System.out.println();
            for( int y=0; y< matriz[x].length; y++){
                int numeroAleatorio = random.nextInt(9);
                matriz[x][y] = numeroAleatorio;
                System.out.print(matriz[x][y]+" ");
            }
        }




    }
}


