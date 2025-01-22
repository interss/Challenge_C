// The SavingsAccount class extends the Account class, representing a savings account
// A classe SavingsAccount estende a classe Account, representando uma conta poupança
package com.bank;

public class SavingsAccount extends Account {
    // Interest rate of the savings account
    // Taxa de juros da conta poupança
    private double interestRate;

    // Constructor initializing the initial balance and interest rate of the savings account
    // Construtor que inicializa o saldo inicial e a taxa de juros da conta poupança
    public SavingsAccount(double initialBalance, double interestRate) {
        super(initialBalance); // Calls the constructor of the parent class (Account)
        // Chama o construtor da classe pai (Account)
        this.interestRate = interestRate; // Initializes the interest rate
        // Inicializa a taxa de juros
    }

    // Method applying interest to the current balance
    // Método que aplica os juros ao saldo atual
    public void applyInterest() {
        double interest = getBalance() * interestRate; // Calculates interest based on the balance and interest rate
        // Calcula o interesse baseado no saldo e na taxa de juros
        deposit(interest); // Deposits the interest into the balance
        // Deposita o interesse no saldo
    }

    // Overrides the toString method to provide a string representation of the object
    // Sobrescreve o método toString para fornecer uma representação em string do objeto
    @Override
    public String toString() {
        return "SavingsAccount{" +
                "balance=" + getBalance() + // Gets the current balance
                // Obtém o saldo atual
                ", interestRate=" + interestRate + // Gets the interest rate
                // Obtém a taxa de juros
                '}';
    }
}