package Loops;

import java.util.Scanner;

/*
 * Calcular o Fatorial de um N�mero informado pelo usu�rio
 */

public class Ex6_Fatorial {
  public static void main(String[] args) {
    int numero; 
    int fatorial = 1;
    
    Scanner scan = new Scanner(System.in);
    System.out.println("Digite um n�mero: ");
    numero = scan.nextInt();
    for (int x = numero; x>=1; x--){
        fatorial = fatorial*x;
    }
    System.out.println(numero+"! = "+fatorial);

    

    }
   
}
