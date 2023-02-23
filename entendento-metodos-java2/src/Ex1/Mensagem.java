package Ex1;

public class Mensagem {
    public static void mensagem(int hora){

        if (hora >=5 && hora <=12) {
            System.out.println("Bom dia");

            } else if (hora >=13 && hora <= 17){
                System.out.println("Boa Tarde");

           } else if( hora <=4 ||( hora >= 18 && hora<=24)){
            System.out.println("Boa Noite");

           } else {
            System.out.println("Hora Inválida");
        }

    }

}
