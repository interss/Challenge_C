// Abstract class Account representing a bank account
// Classe abstrata Account que representa uma conta bancária
public abstract class Account {
    // Account balance
    // Saldo da conta
    protected double balance;

    // Constructor initializing the initial account balance
    // Construtor que inicializa o saldo inicial da conta
    public Account(double initialBalance) {
        this.balance = initialBalance;
    }

    // Method returning the current account balance
    // Método que retorna o saldo atual da conta
    public double getBalance() {
        return balance;
    }

    // Method to deposit an amount into the account, if the amount is positive
    // Método que deposita um valor na conta, se o valor for positivo
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    // Abstract method for withdrawal, to be implemented by subclasses
    // Método abstrato para saque, que deve ser implementado pelas subclasses
    public abstract boolean withdraw(double amount);
}