package Ex2;
// Exercícios de Sobrecarga
// Claculo da Áreo de Quadrilateros

public class Main {
    public static void main (String[] args){

        Quadrilatero.calcularArea(5);
        Quadrilatero.calcularArea(11,6,3);
        Quadrilatero.calcularArea(5d,3d);
        Quadrilatero.calcularArea(5f,3f);

        System.out.println(Quadrilatero2.calcularArea(5));
        System.out.println(Quadrilatero2.calcularArea(11,6,3));
        System.out.println(Quadrilatero2.calcularArea(5d,3d));
        System.out.println(Quadrilatero2.calcularArea(5f,3f));
    }


}
