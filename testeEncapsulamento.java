public class testeEncapsulamento {

    public static void main(String[] args) {

        
        contaBancaria conta = new contaBancaria();

        
        conta.setNumeroConta("12345-6");
        conta.setTitular("João da Silva");

        
        conta.depositar(300);     
        conta.depositar(-50);     

        conta.sacar(100);         
        conta.sacar(500);         
        conta.sacar(-20);         

        
        System.out.println("\nSaldo final: R$ " + conta.getSaldo());
    }
}
