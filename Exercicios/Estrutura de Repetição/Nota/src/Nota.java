import java.util.Scanner;

public class Nota {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int nota;

        System.out.println("Nota: ");
        nota = scanner.nextInt();

        while(nota < 0 || nota > 10) {
            System.out.println("Nota invalida! Digite novamente: ");
            nota = scanner.nextInt();
        }
        System.out.println("Sua nota é " + nota);
    }
}