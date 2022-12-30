public class App {
    public static void main(String[] args) throws Exception {

        String nomeUm = "Misael";
        String nomeDois = "Misael";

        System.out.println(nomeUm == nomeDois);

        String nomeTres = "Misael";
        String nomeQuatro = new String("Misael");

        System.out.println(nomeTres == nomeQuatro);
        
        System.out.println(nomeTres.equals(nomeQuatro));

        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;

        if(numero1 < numero2) {
            System.out.println("A nossa condição é verdadeira");
        } else {
            System.out.println("A nossa condição é falsa");
        }

        System.out.println("O numeroUm é igual numeroDois? " + simNao);

        simNao = numero1 != numero2;

        System.out.println("O numeroUm é diferente numeroDois? " + simNao);

        simNao = numero1 > numero2;

        System.out.println("O numeroUm é maior que numeroDois? " + simNao);

        simNao = numero1 < numero2;

        System.out.println("O numeroUm é menor que numeroDois? " + simNao);
    }
}
