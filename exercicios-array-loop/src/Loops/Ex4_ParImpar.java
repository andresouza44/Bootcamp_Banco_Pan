package Loops;

import java.util.Scanner;
/*
Digite N n�meros
Calcular e mosyrar a quantidade de n�meros pares e impares


 */
public class Ex4_ParImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int qtdeNumeros;
        int qtdePar=0;
        int qtdeImpar=0;
        int numero;

        System.out.println(" Quantidade de n�meros ? ");
        qtdeNumeros = scan.nextInt();

        for (int x=0; x<qtdeNumeros; x++){
            System.out.println(" Digite o n�mero "+(x+1));
            numero = scan.nextInt();
            if (numero %2 ==0){
                qtdePar ++;
                System.out.println(" O n�mero "+ numero +" � par");
                } else {
                    System.out.println(" O n�mero " + numero+ " � impar");
                    qtdeImpar++;
                }
        }
        System.out.println(" Foram digitados "+ qtdePar+ " n�meros pares e "+ qtdeImpar+ " n�meros impares");



    }


    }



