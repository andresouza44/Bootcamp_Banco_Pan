/*
Desafio
A seguinte sequ�ncia de n�meros 0 1 1 2 3 5 8 13 21... � conhecida como s�rie de Fibonacci. Nessa sequ�ncia, cada n�mero, depois dos 2 primeiros, � igual � soma dos 2 anteriores. Escreva um algoritmo que leia um inteiro N (N < 46) e mostre os N primeiros n�meros dessa s�rie.

Entrada
O arquivo de entrada cont�m um valor inteiro N (0 < N < 46).

Sa�da
Os valores devem ser mostrados na mesma linha, separados por um espa�o em branco. N�o deve haver espa�o ap�s o �ltimo valor
 */

import java.io.IOException;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) throws IOException {

        Scanner leitor = new Scanner(System.in);
        int N = leitor.nextInt();

        int proximo, anterior = 0, atual = 1;
        for (int i = 0; i < N; i++) {
            if (i==0) {
                System.out.print("0 ");
            }else{
                proximo = atual + anterior;
                System.out.print(atual + " ");
                anterior = atual;
                atual = proximo;

            }


        }
    }


}
