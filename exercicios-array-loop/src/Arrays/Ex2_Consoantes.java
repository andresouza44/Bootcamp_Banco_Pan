package Arrays;
import java.util.Scanner;

/*
Ler um Vetor de 6 caractres.
Dizer quantas consoantes foram lidas
Imprimir as consoantes
 */
public class Ex2_Consoantes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String consoantes []= new String[6];
        int quantidadeConsoantes =0;

        int count = 0;

        do {
            System.out.println("Digite uma Letra: ");
            String letra = scan.next();
            if (!(letra.equalsIgnoreCase("a")|
                    letra.equalsIgnoreCase("e")|
                    letra.equalsIgnoreCase("i")|
                    letra.equalsIgnoreCase("o")|
                    letra.equalsIgnoreCase("u"))){
                consoantes[count]=letra;
            }

            count++;

        } while(count < consoantes.length);

        for (String x : consoantes) {
            if (x !=null) {
                System.out.print(x + " ");
            }
        }
    }
}
