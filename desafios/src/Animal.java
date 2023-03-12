/*
DESAFIO - Bootcamp Banco Pan Java Devs
Neste problema, voc� dever� ler 3 palavras que definem o tipo de animal poss�vel segundo o esquema abaixo,
da esquerda para a direita.  Em seguida conclua qual dos animais seguintes foi escolhido,
atrav�s das tr�s palavras fornecidas.
 */

import java.io.IOException;
import java.util.Scanner;

public class Animal {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        String AN1, AN2, AN3;

        AN1 = sc.nextLine();
        AN2 = sc.nextLine();
        AN3 = sc.nextLine();

        //TODO: Implemente as condi��o necess�ria para que seja verificado que tipo de animal �:
        if (AN1.equals("vertebrado")) {
            if (AN2.equals("ave")) {
                if (AN3.equals("carnivoro")) {
                    System.out.println("aguia");
                } else {
                    System.out.println("pomba");
                }
            } else {
                if (AN3.equals("onivoro")) {
                    System.out.println("homem");
                } else {
                    System.out.println("vaca");
                }
            }

        } else {
            if (AN2.equals("inseto")) {
                if (AN3.equals("hematofago")) {
                    System.out.println("pulga");
                } else {
                    System.out.println("lagarta");
                }
            } else {
                if (AN3.equals("hematofago")) {
                    System.out.println("sanguessuga");
                } else {
                    System.out.println("minhoca");
                }

            }


            //Dica: Voc� pode utilizar o m�todo equals para realizar compara��es.
        }
    }

}

/*
vertebrado
ave
carnivoro


invertebrado
anelideo
onivoro
 */

