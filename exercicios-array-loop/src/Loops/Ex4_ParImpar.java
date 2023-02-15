package Loops;

import java.util.Scanner;
/*
Digite N números
Calcular e mosyrar a quantidade de números pares e impares


 */
public class Ex4_ParImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int qtdeNumeros;
        int qtdePar=0;
        int qtdeImpar=0;
        int numero;

        System.out.println(" Quantidade de números ? ");
        qtdeNumeros = scan.nextInt();

        for (int x=0; x<qtdeNumeros; x++){
            System.out.println(" Digite o número "+(x+1));
            numero = scan.nextInt();
            if (numero %2 ==0){
                qtdePar ++;
                System.out.println(" O número "+ numero +" é par");
                } else {
                    System.out.println(" O número " + numero+ " é impar");
                    qtdeImpar++;
                }
        }
        System.out.println(" Foram digitados "+ qtdePar+ " números pares e "+ qtdeImpar+ " números impares");



    }


    }



