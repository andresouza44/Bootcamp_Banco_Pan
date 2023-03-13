/*
Bootcamp - Banco PAN Java Developer / DIO
Desafio Triângulo
Leia 3 valores reais (A, B e C) e verifique se eles formam ou não um triângulo.
Condição de existência de um triângulo:
| b - c | < a < b + c
| a - c | < b < a + c
| a - b | < c < a + b

Em caso positivo, calcule o perímetro do triângulo (soma de todos os lados) e apresente a mensagem:
Perimetro = XX.X
Em caso negativo, calcule a área do trapézio que tem A e B como base e C como altura, mostrando a mensagem:
Area = XX.X
 */

import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double A = leitor.nextDouble();
        double B = leitor.nextDouble();
        double C = leitor.nextDouble();

        // Verificar Condição de existência de um triângulo:
        if ( (A < (B + C) && B < (A + C) && C < (A + B))) {
            System.out.println("Perimetro = "+ (A+B+C));

        }else System.out.println("Area = " +  ((A+B)*C)/2);

    }
}
