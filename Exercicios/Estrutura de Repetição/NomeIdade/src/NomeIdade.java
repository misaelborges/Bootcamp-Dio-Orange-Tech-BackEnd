import java.util.Scanner;

public class NomeIdade {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        String nome;
        int idade;

        while(true) {
            System.out.print("Nome: ");
            nome = scanner.next();
            if(nome.equals("0")) break;

            System.out.print("Idade: ");
            idade = scanner.nextInt();

            System.out.println("nome: " + nome + " Idade: " + idade);
            System.out.println("-------------");
        }
        System.out.println("-------------");
        System.out.println("Nome invalido! Programa finalizado...");
    }
}