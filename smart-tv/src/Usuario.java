public class Usuario {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        SmartTv smarTv = new SmartTv();
        System.out.println("A TV está ligada ? (1) " + smarTv.ligada);
        System.out.println("Canal atual:" + smarTv.canal);
        System.out.println("Volume: "+ smarTv.volume);

        smarTv.ligar();
        System.out.println("A TV está ligada ? (2) " + smarTv.ligada);
        smarTv.desligar();
        System.out.println("A TV está ligada ? (3) " + smarTv.ligada);
 
        smarTv.botaoOnOff();
        smarTv.botaoOnOff();
        smarTv.botaoOnOff();
        
        smarTv.aumentarVolume();
        smarTv.aumentarVolume();
        smarTv.aumentarVolume();
        smarTv.diminuirVolume();
        System.out.println(" Volume Atual em: " + smarTv.volume);

        smarTv.mudarCanal(13);
        System.out.println(" Canal atual: " + smarTv.canal);

    }        

    
}
