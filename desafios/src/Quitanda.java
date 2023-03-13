/*
Bootcamp - Banco PAN Java Developer / DIO
Desafio
Seu Zé está vendendo frutas com a seguinte tabela de preços:
        Até 5 Kg	Acima de 5 Kg
Morango	R$ 2,50 por Kg	R$ 2,20 por Kg
Maçã	R$ 1,80 por Kg	R$ 1,50 por Kg
Se o cliente comprar mais de 8 Kg em frutas ou o valor total da compra ultrapassar R$ 25,00,
receberá ainda um desconto de 10% sobre este total.
Escreva um algoritmo para ler a quantidade (em Kg) de morangos e a quantidade (em Kg) de maças adquiridas
e escreva o valor a ser pago pelo cliente.
 */

import java.util.Scanner;


public class Quitanda {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int morangos = input.nextInt();
        int macas = input.nextInt();
        int pesoTotal = morangos + macas;
        double precoMorango = 0;
        double precoMaca = 0;
        double precoTotal = 0;
        // Cálculo da compra de maça e morango
        if (morangos <=5) precoMorango =  morangos*2.5; else precoMorango = morangos*2.2;
        if (macas<=5)  precoMaca =macas*1.8; else precoMaca =macas*1.5;
        precoTotal = precoMorango + precoMaca;

        // Verificaçãop do desconto e cálculo preço total
        if (pesoTotal > 8 ||  precoTotal > 25) precoTotal *=0.9;
        System.out.println(precoTotal);
    }
}
