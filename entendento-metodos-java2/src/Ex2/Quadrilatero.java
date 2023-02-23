package Ex2;

public class Quadrilatero {
    public static void calcularArea(double lado){
        System.out.println("A área do Quadrado é :" + 2*lado);
    }
    public static void calcularArea(double lado1, double lado2){
        System.out.println("A área do Retângulo é :" + lado1*lado2);
    }
    public static void calcularArea(double baseMaior, double baseMenor, double altura){
        System.out.println("A área do Trapézio é :" + (baseMaior+baseMaior)*altura);
    }

    public static void calcularArea(float diagonal1, float diagonal2){
        System.out.println("A área do Losango é :" + (diagonal1*diagonal2)/2);
    }



}
