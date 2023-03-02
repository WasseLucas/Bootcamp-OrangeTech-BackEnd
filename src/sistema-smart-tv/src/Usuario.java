public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        System.out.println("TV Ligada ? " + smartTv.ligada);
        System.out.println("Canal Atual : " + smartTv.canal);
        System.out.println("Volume atual : " + smartTv.volume);
        System.out.println("------------Ligando SmartTv----------------");
        smartTv.ligar();
        System.out.println("Novo status -> TV ligada ? " + smartTv.ligada);
        smartTv.mudarCanal(13);
        System.out.println("Canal atual : " + smartTv.canal);
        System.out.println("------------Alterando volume---------------");
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.diminuirVolume();
        smartTv.desligar();
        System.out.println("Novo status -> TV ligada ? " + smartTv.ligada);


    }
}
