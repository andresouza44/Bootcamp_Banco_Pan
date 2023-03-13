/*
Bootcamp - Banco PAN Java Developer / DIO
Desafio Tri�ngulo
Leia 3 valores reais (A, B e C) e verifique se eles formam ou n�o um tri�ngulo.
Condi��o de exist�ncia de um tri�ngulo:
| b - c | < a < b + c
| a - c | < b < a + c
| a - b | < c < a + b

Em caso positivo, calcule o per�metro do tri�ngulo (soma de todos os lados) e apresente a mensagem:
Perimetro = XX.X
Em caso negativo, calcule a �rea do trap�zio que tem A e B como base e C como altura, mostrando a mensagem:
Area = XX.X
 */

import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double A = leitor.nextDouble();
        double B = leitor.nextDouble();
        double C = leitor.nextDouble();

        // Verificar Condi��o de exist�ncia de um tri�ngulo:
        if ( (A < (B + C) && B < (A + C) && C < (A + B))) {
            System.out.println("Perimetro = "+ (A+B+C));

        }else System.out.println("Area = " +  ((A+B)*C)/2);

    }
}
