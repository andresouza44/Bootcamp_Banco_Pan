package Arrays;
/*
Criar um arry de 6 números e imprimir na ordem inversa
 */
public class Ex1_OrdemInvesa {
    public static void main(String[] args) {
        int[] array = {5, 10, -5, 55, 89, -65};

        for (int x = (array.length - 1); x >= 0; x--) {
            System.out.print(array[x]+ " ");


        }

    }
}