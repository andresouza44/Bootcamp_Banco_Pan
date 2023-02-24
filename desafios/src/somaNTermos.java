import java.util.Scanner;

// Desafio Somar N termos

public class somaNTermos {

        public static void main(String[] Args) {

            double h = 0;

            Scanner sc = new Scanner(System.in);
            double n = sc.nextDouble();

            for (double i = 1; i <= n; i++) {
                h =h + 1/i; //TODO: Calcule o valor de H de forma que resulte na soma dos termos:
            }
            //TODO: Imprima a soma dos termos, considerando um resultado com duas casas decimais:
            System.out.println(Math.round(h));
        }
    }



