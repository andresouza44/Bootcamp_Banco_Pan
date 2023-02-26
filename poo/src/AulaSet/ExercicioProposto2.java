package AulaSet;

import java.util.*;

public class ExercicioProposto2 {
    public static void main(String[] args) {
        //crie um conjunto 3 linguagens
        Set<LinguagemFavorita> linguagem = new HashSet<>() {{
            add(new LinguagemFavorita("HTML 5", 1989, "Sublime Text"));
            add(new LinguagemFavorita("Python", 1990, "Visual Studio Code"));
            add(new LinguagemFavorita("Java", 1995, "Intelliji"));
            add(new LinguagemFavorita("Arduino",2005,"Arduino IDE"));
            add(new LinguagemFavorita("CSS",1990,"WebStorm"));
            add(new LinguagemFavorita("Angular",1990,"Sublime Tex"));
        }};
        System.out.println("\n--\tOrdem Aleatória\t--");
        for (LinguagemFavorita ling : linguagem) {
            System.out.println(ling.getNome() +" - " + ling.getAnoDeCriacao() + " - " +ling.getIde());
        }

        //ordene esse conjunt por: Ordem de Inserção
        System.out.println("\n--\tOrdem de Inserção\t--");
        Set<LinguagemFavorita> linguagem2 = new LinkedHashSet<>(){{
            add(new LinguagemFavorita("HTML 5", 1989, "Sublime Text"));
            add(new LinguagemFavorita("Python", 1990, "Visual Studio Code"));
            add(new LinguagemFavorita("Java", 1995, "Intelliji"));
            add(new LinguagemFavorita("Arduino",2005,"Arduino IDE"));
            add(new LinguagemFavorita("CSS",1990,"WebStorm"));
            add(new LinguagemFavorita("Angular",1990,"Sublime Tex"));
        }};
        for (LinguagemFavorita ling : linguagem2) {
            System.out.println(ling.getNome() +" - " + ling.getAnoDeCriacao() + " - " +ling.getIde());
        }
        // Ordem Natural (nome)
        System.out.println("\n--\tOrdem Natural (Nome)\t--");
        Set<LinguagemFavorita>linguagem3 = new TreeSet<>(linguagem);
        for (LinguagemFavorita ling : linguagem3) {
            System.out.println(ling.getNome() +" - " + ling.getAnoDeCriacao() + " - " +ling.getIde());
        }
        //  Oderm por IDE
        System.out.println("\n--\tOrdem IDE\t--");
        Set<LinguagemFavorita>linguagem4 = new TreeSet<>(new ComparadorIDE());
        linguagem4.addAll(linguagem3);

        for (LinguagemFavorita ling : linguagem4) {
            System.out.println(ling.getNome() +" - " + ling.getAnoDeCriacao() + " - " +ling.getIde());
        }

        //Ordem por Ano de criação e nome
        System.out.println("\n--\tOrdem por Ano de Criação e Nome\t--");
        Set<LinguagemFavorita> linguagem5 = new TreeSet<>(new ComparadorAnoNome());
        linguagem5.addAll(linguagem3);
        for (LinguagemFavorita ling : linguagem5){
            System.out.println(ling.getNome() +" - " + ling.getAnoDeCriacao() + " - " +ling.getIde());

        }

        // Nome, ano de criacao e IDE
        System.out.println("\n--\tOrdem por Ano de Criação e IDE\t--");
        Set <LinguagemFavorita> linguagem6 = new TreeSet<>(new ComparadorAnoIde());
        linguagem6.addAll(linguagem3);
        for (LinguagemFavorita ling : linguagem6){
            System.out.println(ling.getNome() +" - " + ling.getAnoDeCriacao() + " - " +ling.getIde());
        }


        //Ao final, exiba as linguagens no console, um abaixo da outra



    }
}


