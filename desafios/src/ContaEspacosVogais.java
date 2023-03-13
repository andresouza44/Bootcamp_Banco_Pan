/*
Bootcamp - Banco PAN Java Developer / DIO
Desafio: Conta Espaços e Vogais
Jorginho é professor do primário de uma determinada escola.
Ele tem 100000 alunos e precisa criar um programa que verifica quantos espaços em branco e
quantas vogais existem em uma determinada string de entrada que os alunos entregaram na avaliação final.
Ajude-o a realizar essa tarefa antes que o tempo para entrega-la no fim do semestre acabe!
 */
import java.util.Scanner;

public class ContaEspacosVogais {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] strSplit = str.split(" ");
        char[] arrVogais = {'a', 'e', 'i', 'o', 'u'};
        int espacosEmBranco = strSplit.length - 1, quantVogais = 0;

        //TODO: Implemente condições (laços) adequados para que possamos contar os espaços em brancos e as vogais que existem na string.
        //Dica: Você pode utilizar o Character.toLowerCase em sua condição:

        for (String palavra: strSplit) {
            for (int i=0; i < palavra.length(); i+=1) {
                switch (palavra.toLowerCase().charAt(i)) {
                    case 'a': quantVogais += 1; break;
                    case 'e': quantVogais += 1; break;
                    case 'i': quantVogais += 1; break;
                    case 'o': quantVogais += 1; break;
                    case 'u': quantVogais += 1; break;
                }
            }
        }
        System.out.println("Espacos em branco: " + espacosEmBranco + " Vogais: " + quantVogais);
    }
}

