/*
Exiba a soma da popula��o desses estados;
Exiba a m�dia da popula��o deste dicion�rio de estados;
Remova os estados com a popula��o menor que 4.000.000;
Apague o dicion�rio de estados;
Confira se o dicion�rio est� vazio.
 */
package Map;

import java.util.*;

public class ExercicopProposto1 {
    public static void main (String[] args){
    /*
    Dada a popula��o estimada de alguns estados do NE brasileiro, fa�a:
    Estado = PE - Popula��o = 9.616.621
    Estado = AL - Popula��o = 3.351.543
    Estado = CE - Popula��o = 9.187.103
    Estado = RN - Popula��o = 3.534.265

    Crie um dicion�rio e relacione os estados e suas popula��es;
     */
    Map<String,Integer> populacao = new HashMap<>(){{
        put("PE", 96166210);
        put("AL",  3351543);
        put("CE", 9187103);
        put("RN", 3534265);

    }};
        System.out.println(populacao);
    //  Substitua a popula��o do estado do RN por 3.534.165;
        populacao.put("RN", 3534165);
        System.out.println(populacao);

    //  Confira se o estado PB est� no dicion�rio, caso n�o adicione: PB - 4.039.277;
        System.out.println("\nConfira se o estado PB est� no dicion�rio: " + populacao.containsKey("PB"));
        if ( !populacao.containsKey("PB")) {populacao.put("PB",4039277 );};

        System.out.println(populacao);
    //  Exiba a popula��o PE;
        System.out.println("\nPopula��o de Pernambuco: " + populacao.get("PB"));

    // Exiba todos os estados e suas popula��es na ordem que foi informado;
    Map<String,Integer> populacao2 = new LinkedHashMap<>(){{
        put("PE", 9616621);
        put("AL",  3351543);
        put("CE", 9187103);
        put("RN", 3534265);

    }};
    System.out.println("\nExiba todos os estados e suas popula��es na ordem que foi informado:");
    System.out.println(populacao2);
    // Exiba os estados e suas popula��es em ordem alfab�tica;

    Map<String,Integer> populacao3 = new TreeMap(populacao);
    System.out.println("\nExiba os estados e suas popula��es em ordem alfab�tica;");
    System.out.println(populacao3);

    // Exiba o estado com o menor popula��o e sua quantidade;
    Integer menorPop = Collections.min(populacao3.values());
    Set<Map.Entry<String, Integer>> entries = populacao3.entrySet();
    String estadoMenosPop;
    for (Map.Entry<String, Integer> entry: entries){
        if (entry.getValue().equals(menorPop)) {
            estadoMenosPop = entry.getKey();
            System.out.println("\nEstado menos populoso: " + estadoMenosPop + " = " + entry.getValue());
        }
    }

    //Exiba o estado com a maior popula��o e sua quantidade;
    Integer maiorPop = Collections.max(populacao3.values());
    String estadoMaisPop;
    for (Map.Entry<String,Integer> entry : entries){
        if (entry.getValue().equals(maiorPop)){
            estadoMaisPop = entry.getKey();
            System.out.println("Estado mais populoso: " + estadoMaisPop + " = " + entry.getValue());
        }
        }
    //Exiba a soma da popula��o desses estados;
    Integer somaPop=0;
    for (Map.Entry<String,Integer> entradas : entries){
        somaPop+= entradas.getValue();
    }
    System.out.println("Soma Popula��o: " + somaPop);

    //Exiba a m�dia da popula��o deste dicion�rio de estados;
    System.out.println("M�dia da popula��o: " + somaPop/entries.size());

    //Remova os estados com a popula��o menor que 4.000.000;
    System.out.println("\nEstador com popula�ao acima de 4.000.000: ");
    Iterator <Integer> iterador = populacao.values().iterator();
        while (iterador.hasNext()){
            if (iterador.next() <= 4000000) iterador.remove();

    }
    System.out.println(populacao);
    populacao.clear();
    System.out.println(populacao);
    //    Confira se o dicion�rio est� vazio.
    System.out.println("Esta vazia ?: " + populacao.isEmpty());


    }
}
