import java.util.Random;

public class NumeroAleatorios {
    public static void main(String[] args) throws Exception {
        Random random = new Random();

        int[] numeroAleatorios = new int[20];

        for(int i = 0; i < numeroAleatorios.length; i++) {
            int numero = random.nextInt(100);
            numeroAleatorios[i] = numero;
        }

        System.out.print("Numeros aleatorios: ");
        for (int i : numeroAleatorios) {
            System.out.print((i) + " ");
        }

        System.out.print("\nSucessor dos numeros aleatorios: ");
        for (int i : numeroAleatorios) {
            System.out.print((i+1) + " ");
        }
    }
}
