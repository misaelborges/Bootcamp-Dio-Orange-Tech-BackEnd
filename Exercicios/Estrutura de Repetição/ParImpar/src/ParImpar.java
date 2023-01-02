import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int qtdnumero;
        int numero;
        int par = 0;
        int impar = 0;

        System.out.print("Quantidade de números: ");
        qtdnumero = scanner.nextInt();

        int count = 0;
        do {
            System.out.print("Numero: ");
            numero = scanner.nextInt();
            if(numero % 2 == 0) {
                par++;
            } else {
                impar++;
            }
            count++;
        } while (count < qtdnumero);
        System.out.println("Quantidade de N° par: " + par);
        System.out.println("Quantidade de N° par: " + impar);
    }
}
