// The CheckingAccount class extends the Account class, representing a checking account
// A classe CheckingAccount estende a classe Account, representando uma conta corrente
public class CheckingAccount extends Account {
    
    // Constructor initializing the initial balance of the checking account
    // Construtor que inicializa o saldo inicial da conta corrente
    public CheckingAccount(double initialBalance) {
        super(initialBalance); // Calls the constructor of the parent class (Account)
        // Chama o construtor da classe pai (Account)
    }

    // Overrides the withdraw method to perform withdrawals from the checking account
    // Sobrescreve o método withdraw para realizar saques na conta corrente
    @Override
    public void withdraw(double amount) {
        super.withdraw(amount); // Calls the withdraw method of the parent class (Account)
        // Chama o método withdraw da classe pai (Account)
    }

    // Add other specific methods for the checking account, if necessary
    // Adicione outros métodos específicos para a conta corrente, se necessário
}