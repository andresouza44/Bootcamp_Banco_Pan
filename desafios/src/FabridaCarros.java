import java.util.Scanner;

public class FabridaCarros {


    // Para ler e escrever dados em Java, aqui na DIO padronizamos da seguinte forma:
// - new Scanner(System.in): cria um leitor de Entradas, com m�todos �teis com prefixo "next";
// - System.out.println:.imprime um texto de Sa�da (Output) e pulando uma linha.



        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            int custoFabrica = scan.nextInt();
            int porcentagemDistribuidor = scan.nextInt();
            int PercentualImpostos = scan.nextInt();

            int custoConsumidor;

            int Distribuidor;
            int ValorImpostos;

            // TODO: Implemente uma condi��o que calcule a porcentagem do distribuidor e dos impostos:

            Distribuidor = (custoFabrica * porcentagemDistribuidor) / 100;
            Distribuidor = (custoFabrica * porcentagemDistribuidor) / 100;
            ValorImpostos = (custoFabrica*PercentualImpostos)/100;
            custoConsumidor = custoFabrica + Distribuidor + ValorImpostos;


            System.out.println(custoConsumidor);
        }

    }

