public class MinhaClasse {
    public static void main(String[] args) {
        String primeioNome = "Misael";
        String segundoNome = "Borges";

        String nomeCompleto = nomeCompleto(primeioNome, segundoNome);
        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        return "Resultado do método: " + primeiroNome.concat(" ").concat(segundoNome);
    }
}
