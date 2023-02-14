import java.util.Scanner;

public class Ex2_Nota {
    public static void main(String[] args) {    
        Scanner scan = new Scanner(System.in);
        int nota;
        System.out.print(" Digite uma Nota entre 0 e 10: ");
        nota = scan.nextInt();
        
        while (nota <= 0 || nota >= 10 ){

          /*  if ( nota >= 0 && nota <= 10 ) break; */
            System.out.print(" Valor Inválido. Digite novamente ");
            nota = scan.nextInt();

        }

        System.out.println(" A Nota digitada foi: "+ nota);


        
    }
    
}
