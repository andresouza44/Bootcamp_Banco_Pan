/*
Faça um programa que receba a temperatura média dos 6
primeiros meses do ano e armazene-as em uma lista.

Após isto, calcule a média semestral das temperaturas e
mostre todas as temperaturas acima desta média, e em que
mês elas ocorreram (mostrar o mês por extenso: 1 ? Janeiro, 2? Fevereiro e etc).
*/

package Listas;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class ExercioProposto1 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        //  double [][] tempMedia = new  double[6][6];
        // Não consegui fazer a soma desta maneira, tentando simplificar
 /*       List<TemMedia> tempMedia = new ArrayList<>() {{
                {
                    for (int i = 1; i <= 6; i++) {
                        System.out.println("Informar a temperatura do mês " + i);
                        Double temp = leitor.nextDouble();
                        switch (i) {
                            case 1:
                                add(new TemMedia("Janeiro", temp));
                                break;
                            case 2:
                                add(new TemMedia("Fevereiro", temp));
                                break;
                            case 3:
                                add(new TemMedia("Março", temp));
                                break;
                            case 4:
                                add(new TemMedia("Abril", temp));
                                break;
                            case 5:
                                add(new TemMedia("Maio", temp));
                                break;
                            case 6:
                                add(new TemMedia("Junho", temp));
                                break;
                        }

                    }
                }

            }};

 */
        List <Double> tempMensal = new ArrayList<Double>();
        for (int i=1; i<=6; i++){
            System.out.print("Informe a temperatura do mês " +i + ": ");
            tempMensal.add(leitor.nextDouble());
        }
        double somaTemp =0;
        for ( double i : tempMensal){
            somaTemp += i;
        }
        double tempMediaSemestral = somaTemp/6;
        String tempMediaAux = new DecimalFormat("#,##0.00").format(tempMediaSemestral);

        System.out.println("\nTemperatura Média Semestral :" + tempMediaAux + "ºC");
        System.out.println("\n === Temperaturas acima da média ===");
        for (int i=0; i<6; i++){
            double tempAux = tempMensal.get(i);
            if (tempAux > tempMediaSemestral){
                switch (i){
                    case 0: System.out.println("Janeiro: "   + tempMensal.get(0) + "ºC");
                        break;
                    case 1: System.out.println("Fevereiro: " + tempMensal.get(1)+ "ºC");
                        break;
                    case 2: System.out.println("Março: "     + tempMensal.get(2)+ "ºC");
                        break;
                    case 3: System.out.println("Abril: "     + tempMensal.get(3)+ "ºC");
                        break;
                    case 4: System.out.println("Maio: "      + tempMensal.get(4)+ "ºC");
                        break;
                    case 5: System.out.println("Junho: "     + tempMensal.get(4)+ "ºC");
                        break;


                }

            }

        }
    }
}