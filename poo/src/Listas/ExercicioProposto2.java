/*
Utilizando listas, faça um programa que faça 5 perguntas para uma
pessoa sobre um crime. As perguntas são:

"Telefonou para a vítima?"
"Esteve no local do crime?"
"Mora perto da vítima?"
"Devia para a vítima?"
"Já trabalhou com a vítima?"

Se a pessoa responder positivamente a 2 questões ela deve ser
classificada como "Suspeita", entre 3 e 4 como "Cúmplice" e 5 como
"Assassina". Caso contrário, ela será classificado como "Inocente".
 */


package Listas;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ExercicioProposto2 {
    public static void main (String[] args){
        Scanner leitor = new Scanner(System.in);
        int countS =0;
        System.out.println("------ Responda as Perguntas Somente com s/n ---- ");
        List<String> respostas = new ArrayList<String>(){};
        System.out.print("\nTelefonou para a vítima? ");
        respostas.add(leitor.nextLine().toLowerCase());

        System.out.print("Esteve no local do crime? ");
        respostas.add(leitor.nextLine().toLowerCase());

        System.out.print("Mora perto da vítima? ");
        respostas.add(leitor.nextLine().toLowerCase());

        System.out.print("Devia para a vítima? ");
        respostas.add(leitor.nextLine().toLowerCase());

        System.out.print("Já trabalhou com a vítima? ");
        respostas.add(leitor.nextLine().toLowerCase());

        for (int i=0; i<5; i++){
        //    System.out.println(respostas.get(i));
            if (respostas.get(i).equals("s")) countS++;
            }

        switch (countS){
            case 2: System.out.println("Você é Suspeito ");break;
            case 3: System.out.println("Você é um Cúmplice ");break;
            case 4: System.out.println("Você é um Cúmplice ");break;
            case 5: System.out.println("Você é o Assassino ");break;
            default: System.out.println("Você é Inocente ");break;
        }

      //  System.out.println(respostas);
      //  System.out.println( countS);

            }

}
