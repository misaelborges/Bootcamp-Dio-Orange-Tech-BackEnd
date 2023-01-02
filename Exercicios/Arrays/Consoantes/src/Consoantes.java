import java.util.Scanner;

public class Consoantes {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        String[] consoantes = new String[6];
        int qtdConsoante = 0;
        
        int count = 0;
        do {
            System.out.print("Letra: ");
            String letra = scanner.next();

            if(!(letra.equalsIgnoreCase("a") ||
                letra.equalsIgnoreCase("e") ||
                letra.equalsIgnoreCase("i") ||
                letra.equalsIgnoreCase("o") ||
                letra.equalsIgnoreCase("U"))) {
                    consoantes[count] = letra;
                    qtdConsoante++;
                }
                count++;
        } while (count < consoantes.length);
        System.out.print("Consoantes: ");
        for (String consoante : consoantes) {
            if(consoante != null) {
                System.out.print(consoante + " ");
            }
        }
        System.out.println("\nQuantidade de consoantes: " + qtdConsoante);
    }
}
