/*
Bootcamp - Banco PAN Java Developer / DIO
Desafio: Taxa de Imposto de Renda

 */
import java.io.IOException;
import java.util.Scanner;


public class TaxaImpostoRenda {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double renda = leitor.nextDouble();
        double imposto;
        if (renda <= 2000) System.out.println("Isento");
        if (renda > 2000 && renda <= 3000) System.out.printf("R$ " +"%.2f", imposto8(renda));
        if (renda > 3000 && renda <= 4500) System.out.printf("R$ " +"%.2f", imposto18(renda));
        if (renda > 4500) System.out.printf("R$ " +"%.2f", imposto28(renda));

        }

    public static double  imposto8 (double renda){
        return (renda-2000)*0.08;
    }
    public static double  imposto18 (double renda){
        return (renda - 3000)*0.18 + imposto8(3000);
    }

    public static double  imposto28 (double renda){
        return (renda - 4500)*0.28 + imposto18(4500);
    }
}