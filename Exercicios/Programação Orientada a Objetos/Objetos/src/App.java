public class App {
    public static void main(String[] args) throws Exception {
        Carro carro = new Carro();

        carro.setCor("Azul");
        carro.setModelo("BMW Série 3");
        carro.setCapacidadeTanque(59);

        System.out.println(carro.getCor());
        System.out.println(carro.getModelo());
        System.out.println(carro.getCapacidadeTanque());
        System.out.println(carro.totalValorTanque(6.39));
    }
}
