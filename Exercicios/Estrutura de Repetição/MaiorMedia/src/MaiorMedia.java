import java.util.Scanner;

public class MaiorMedia {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int numero;
        int maior = 0;
        int soma = 0;

        int count = 0;
        do {
            System.out.println("Numero: ");
            numero = scanner.nextInt();
            soma = soma + numero;
            
            if(numero > maior) {
                maior = numero;
            }
            count++;
        } while (count < 5);
        System.out.println("Programa finalizado");
        System.out.println("Com o total de " + count + " Repetições!!!");
        System.out.println("O maior numero digitado foi: " + maior);
        System.out.println("Media: " + (soma/count));
    }
}
