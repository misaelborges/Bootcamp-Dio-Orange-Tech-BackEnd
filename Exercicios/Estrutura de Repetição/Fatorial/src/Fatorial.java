import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int numero;
        int multiplicacao = 1;
        System.out.print("Fatorial: ");
        numero = scanner.nextInt();

        int i;
        for(i = numero; i > 0; i--) {
            multiplicacao = multiplicacao * i;
        }

        System.out.println(numero + "! = " + multiplicacao);
    }
}
