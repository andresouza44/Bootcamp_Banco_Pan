
public class SmartTv{
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligar(){
        ligada = true;
    }
    public void desligar(){
        ligada = false;

    }    
 
    public void botaoOnOff (){
        ligada = !ligada;
        if (ligada == true){
            System.out.println(" Agora a TV está LIGADA");
        } else{
            System.out.println(" Agora a TV está DESLIGADA");
        }

    }

    public void aumentarVolume (){
        volume++;
    }

    public void diminuirVolume (){
        volume--;
    }

    public void mudarCanal (int novoCanal){
        canal = novoCanal;

    }

}