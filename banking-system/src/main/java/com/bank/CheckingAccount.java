// A classe CheckingAccount estende a classe Account, representando uma conta corrente
public class CheckingAccount extends Account {
    
    // Construtor que inicializa o saldo inicial da conta corrente
    public CheckingAccount(double initialBalance) {
        super(initialBalance); // Chama o construtor da classe pai (Account)
    }

    // Sobrescreve o método withdraw para realizar saques na conta corrente
    @Override
    public void withdraw(double amount) {
        super.withdraw(amount); // Chama o método withdraw da classe pai (Account)
    }

    // Adicione outros métodos específicos para a conta corrente, se necessário
}