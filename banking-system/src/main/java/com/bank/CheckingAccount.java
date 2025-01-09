public class CheckingAccount extends Account {
    
    public CheckingAccount(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public void withdraw(double amount) {
        super.withdraw(amount);
    }

    // Adicione outros métodos específicos para a conta corrente, se necessário
}