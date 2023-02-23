package Ex2;

// Neste Exercício o métodp deve retornoar um valor


public class Quadrilatero2 {

    public static double calcularArea(double lado){
      //double resultado = 2*lado;
      return 2*lado;

    }
    public static double calcularArea(double lado1, double lado2){
        return lado1*lado2;

    }
    public static double calcularArea(double baseMaior, double baseMenor, double altura){
        return  (baseMaior+baseMaior)*altura;
    }

    public static double calcularArea(float diagonal1, float diagonal2){
        return (diagonal1*diagonal2)/2;

    }



}
