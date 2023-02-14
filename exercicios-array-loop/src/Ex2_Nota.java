import java.util.Scanner;

public class Ex2_Nota {
    public static void main(String[] args) {    
        Scanner scan = new Scanner(System.in);
        int nota;
        System.out.print(" Digite uma Nota entre 0 e 10: ");
        
        while (true){
            nota = scan.nextInt();
            if ( nota >= 0 && nota <= 10 ) break;
            System.out.print(" Valor Inválido, digite novamente ");

        }

        System.out.println(" A Nota digitada foi: "+ nota);


        
    }
    
}
