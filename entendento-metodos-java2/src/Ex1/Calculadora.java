package Ex1;

public class Calculadora {

    public static void soma(double numero1, double numero2){
        double resultado;
        resultado = numero1 + numero2;
        System.out.println(" A soma de " + numero1 + " + " + numero2 + " = " + resultado);

    }

    public static void subtracao(double numero1, double numero2){
        double resultado;
        resultado = numero1 - numero2;
        System.out.println(" A subtração de " + numero1 + " - " + numero2 + " = " + resultado);

    }

    public static void multiplicaçao(double numero1, double numero2){
        double resultado;
        resultado = numero1 * numero2;
        System.out.println(" A multiplicação de " + numero1 + " X " + numero2 + " = " + resultado);

    }
    public static void divisao(double numero1, double numero2){
        double resultado;
        resultado = numero1 / numero2;
        System.out.println(" A divisão de " + numero1 + " + " + numero2 + " = " + resultado);

    }

}
