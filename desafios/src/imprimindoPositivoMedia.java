import java.util.Scanner;
import java.io.IOException;

public class imprimindoPositivoMedia {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int cont = 0;
        double media = 0;
        double x = 0;
        double entrada;

        //TODO: Implemente as condições adequadas para obter a quantidade
        //de valores positivos e a média dos valores positivos:
        for (int i = 0; i < 6; i++) {
            entrada = leitor.nextDouble();
            if (entrada > 0) {
                x += entrada;
                cont++;
            }

        }

        media = x / cont;
        System.out.println(cont + " valores positivos");
        System.out.println(String.format("%.1f", media));
    }
}





