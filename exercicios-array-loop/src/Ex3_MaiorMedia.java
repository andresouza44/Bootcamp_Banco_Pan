import java.util.Scanner;

/* Digitar 5 notas
   Calcular a m�dia
   e mostar a maior
*/

public class Ex3_MaiorMedia {
     public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
         int soma = 0;
         int maior;
         long media;
         int nota;

         System.out.println(" Digite a nota N� 1: ");
         nota = scan.nextInt();
         maior = nota;
         soma  = nota;

         for (int n=2; n<6; n++) {
             System.out.println(" Digite a nota N�: "+ n +" ");
             nota = scan.nextInt();
             soma = soma + nota;
             if (nota > maior) maior = nota;

         }
         media = soma/5;
         System.out.println(" Maior nota digitada foi: "+ maior);
         System.out.println(" A soma �: " + soma);
         System.out.println(" A m�dia das notas �: " +  media);

     }

}
