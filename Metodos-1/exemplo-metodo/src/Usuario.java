public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        System.out.println("Tv esta ligada? " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo Status -> Tv esta ligada? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo Status -> Tv esta ligada? " + smartTv.ligada);

        smartTv.aumentarVolume();
        System.out.println("Novo Status -> Volume atual: " + smartTv.volume);

        smartTv.diminuirVolume();
        System.out.println("Novo Status -> Volume atual: " + smartTv.volume);

        smartTv.aumentarCanal();
        System.out.println("Novo Status -> Canal atual: " + smartTv.canal);

        smartTv.diminuirCanal();
        System.out.println("Novo Status -> Canal atual: " + smartTv.canal);

        smartTv.mudarCanal(5);
        System.out.println("Novo Status -> Canal atual: " + smartTv.canal);
    }
}
