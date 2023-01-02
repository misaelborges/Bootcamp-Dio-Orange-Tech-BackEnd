import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int numero;
        int resultado;

        System.out.print("qual tabuada voce quer? ");
        numero = scanner.nextInt();

        int count;
        for(count = 1; count <= 10; count++){
            resultado = numero * count;
            System.out.println(+numero+"x"+count+"="+resultado);
        }
    }
}
