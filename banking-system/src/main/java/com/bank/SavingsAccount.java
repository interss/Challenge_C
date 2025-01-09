// A classe SavingsAccount estende a classe Account, representando uma conta poupança
package com.bank;

public class SavingsAccount extends Account {
    // Taxa de juros da conta poupança
    private double interestRate;

    // Construtor que inicializa o saldo inicial e a taxa de juros da conta poupança
    public SavingsAccount(double initialBalance, double interestRate) {
        super(initialBalance); // Chama o construtor da classe pai (Account)
        this.interestRate = interestRate; // Inicializa a taxa de juros
    }

    // Método que aplica os juros ao saldo atual
    public void applyInterest() {
        double interest = getBalance() * interestRate; // Calcula o interesse baseado no saldo e na taxa de juros
        deposit(interest); // Deposita o interesse no saldo
    }

    // Sobrescreve o método toString para fornecer uma representação em string do objeto
    @Override
    public String toString() {
        return "SavingsAccount{" +
                "balance=" + getBalance() + // Obtém o saldo atual
                ", interestRate=" + interestRate + // Obtém a taxa de juros
                '}';
    }
}