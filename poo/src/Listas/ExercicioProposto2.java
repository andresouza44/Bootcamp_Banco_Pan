/*
Utilizando listas, fa�a um programa que fa�a 5 perguntas para uma
pessoa sobre um crime. As perguntas s�o:

"Telefonou para a v�tima?"
"Esteve no local do crime?"
"Mora perto da v�tima?"
"Devia para a v�tima?"
"J� trabalhou com a v�tima?"

Se a pessoa responder positivamente a 2 quest�es ela deve ser
classificada como "Suspeita", entre 3 e 4 como "C�mplice" e 5 como
"Assassina". Caso contr�rio, ela ser� classificado como "Inocente".
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
        System.out.print("\nTelefonou para a v�tima? ");
        respostas.add(leitor.nextLine().toLowerCase());

        System.out.print("Esteve no local do crime? ");
        respostas.add(leitor.nextLine().toLowerCase());

        System.out.print("Mora perto da v�tima? ");
        respostas.add(leitor.nextLine().toLowerCase());

        System.out.print("Devia para a v�tima? ");
        respostas.add(leitor.nextLine().toLowerCase());

        System.out.print("J� trabalhou com a v�tima? ");
        respostas.add(leitor.nextLine().toLowerCase());

        for (int i=0; i<5; i++){
        //    System.out.println(respostas.get(i));
            if (respostas.get(i).equals("s")) countS++;
            }

        switch (countS){
            case 2: System.out.println("Voc� � Suspeito ");break;
            case 3: System.out.println("Voc� � um C�mplice ");break;
            case 4: System.out.println("Voc� � um C�mplice ");break;
            case 5: System.out.println("Voc� � o Assassino ");break;
            default: System.out.println("Voc� � Inocente ");break;
        }

      //  System.out.println(respostas);
      //  System.out.println( countS);

            }

}
