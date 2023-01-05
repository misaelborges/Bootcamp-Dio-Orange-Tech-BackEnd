public class App {
    public static void main(String[] args) throws Exception {
        Funcionario funcionario = new Funcionario();

        /* upcast */
        Funcionario gerente = new Gerente();
        Funcionario vendedor = new Funcionario();
        Funcionario faxineiro = new Faxineiro();
    }
}
