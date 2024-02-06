public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Criando a primeira conta: ");

        Conta conta01 = new Conta();
        conta01.setAgencia(1);
        conta01.setConta(1010);
        conta01.setNomeCliente("Bruno");
        conta01.setSaldo(1000);

        conta01.imprimeConta();
    }
}
