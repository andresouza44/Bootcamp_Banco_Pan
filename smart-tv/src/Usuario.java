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
        System.out.println(" ?A TV está ligada ? (2)" + smarTv.ligada);
        smarTv.desligar();
        System.out.println("A TV está ligada ? (3)" + smarTv.ligada);

        smarTv.onoffBotao();
        smarTv.onoffBotao();
        smarTv.onoffBotao();
        

        

       

    
}
        


       
    }
}
