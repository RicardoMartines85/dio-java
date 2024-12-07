

public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        System.out.println("TV ligada? " + smartTv.ligada);
        System.out.println("Canal Atual: "+smartTv.canal);
        System.out.println("Volume Atual: "+smartTv.volume);

        smartTv.ligarTv();
        System.out.println("Novo Status -> TV ligada :"+smartTv.ligada);
        
        smartTv.desligarTv();
        System.out.println("Novo Status -> TV ligada :"+smartTv.ligada);

        System.out.println("volume inicial: "+smartTv.volume);
        smartTv.aumentarVolume();
        System.out.println("Novo Status -> volume TV :"+smartTv.volume);

        System.out.println("canal inicial: "+smartTv.canal);
        smartTv.trocaCanal(5);
        System.out.println("Novo Canal:"+smartTv.canal);
 
    }
}
