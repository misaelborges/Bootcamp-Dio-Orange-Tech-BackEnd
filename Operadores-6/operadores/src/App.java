public class App {
    public static void main(String[] args) throws Exception {
        boolean condicao1 = true;
        boolean condicao2 = false;

        if(condicao1 && condicao2) {
            System.out.println("As duas condições são verdadeiras");
        }

        if(condicao1 || condicao2) {
            System.out.println("Uma das condições são verdadeira");
        }

        System.out.println("Fim");
    }
}
