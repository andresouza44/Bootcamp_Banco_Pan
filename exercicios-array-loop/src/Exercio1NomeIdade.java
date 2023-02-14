
import java.util.Scanner;

public class Exercio1NomeIdade {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String nome;
            int idade;

            while (true) {
                System.out.println("Digite o Nome: ");
                nome = scan.next();
                if (nome.equals("0")) break;
                System.out.println("Digite a Idade: ");
                idade = scan.nextInt();
                System.out.println(nome+" tem "+ idade+" anos.");

                }
            System.out.println("Fim do programa");
            }
        }



