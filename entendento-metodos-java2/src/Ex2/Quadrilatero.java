package Ex2;

public class Quadrilatero {
    public static void calcularArea(double lado){
        System.out.println("A �rea do Quadrado � :" + 2*lado);
    }
    public static void calcularArea(double lado1, double lado2){
        System.out.println("A �rea do Ret�ngulo � :" + lado1*lado2);
    }
    public static void calcularArea(double baseMaior, double baseMenor, double altura){
        System.out.println("A �rea do Trap�zio � :" + (baseMaior+baseMaior)*altura);
    }

    public static void calcularArea(float diagonal1, float diagonal2){
        System.out.println("A �rea do Losango � :" + (diagonal1*diagonal2)/2);
    }



}
