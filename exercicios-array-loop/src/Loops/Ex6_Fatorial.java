package Loops;

import java.util.Scanner;

/*
 * Calcular o Fatorial de um Número informado pelo usuário
 */

public class Ex6_Fatorial {
  public static void main(String[] args) {
    int numero; 
    int fatorial = 1;
    
    Scanner scan = new Scanner(System.in);
    System.out.println("Digite um número: ");
    numero = scan.nextInt();
    for (int x = numero; x>=1; x--){
        fatorial = fatorial*x;
    }
    System.out.println(numero+"! = "+fatorial);

    

    }
   
}
