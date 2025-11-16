public class contaBancaria {

    
    private String numeroConta;
    private String titular;
    private double saldo;

    
    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        if (numeroConta == null || numeroConta.isEmpty()) {
            System.out.println("Erro: O número da conta não pode ser nulo ou vazio.");
        } else {
            this.numeroConta = numeroConta;
        }
    }

    
    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        if (titular == null || titular.isEmpty()) {
            System.out.println("Erro: O titular não pode ser nulo ou vazio.");
        } else {
            this.titular = titular;
        }
    }

    
    public double getSaldo() {
        return saldo;
    }


    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$ " + valor + " realizado com sucesso!");
        } else {
            System.out.println("Erro: O valor do depósito deve ser positivo.");
        }
    }

    public void sacar(double valor) {
        if (valor <= 0) {
            System.out.println("Erro: O valor do saque deve ser positivo.");
        } else if (valor > saldo) {
            System.out.println("Erro: Saldo insuficiente para saque.");
        } else {
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso!");
        }
    }
}
