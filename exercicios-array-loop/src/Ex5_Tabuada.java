import java.util.Scanner;

public class Ex5_Tabuada {
    public static void main(String[] args) {
        Scanner  scan = new Scanner(System.in);
        int tabuada;
        System.out.println("Qual a tabuada deseja ver ? ");       
        tabuada = scan.nextInt();
        for (int x=1; x<11; x++){
            System.out.println(tabuada+ " X "+ x + " = " + (tabuada*x) );

        }
    }
}
