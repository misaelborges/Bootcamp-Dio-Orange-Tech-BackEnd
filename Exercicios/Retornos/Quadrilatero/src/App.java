public class App {
    public static void main(String[] args) throws Exception {
        double areaQuadrado = Quadrilatero.area(3);
        System.out.println("Araea do quadrado: " + areaQuadrado);

        double areaRetangulo = Quadrilatero.area(5, 5);
        System.out.println("Araea do retangulo: " + areaRetangulo);

        double areaTrapezio = Quadrilatero.area(7, 8, 9);
        System.out.println("Araea do trapezio: " + areaTrapezio);
    }
}
