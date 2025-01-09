package com.bank;

public class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(double initialBalance, double interestRate) {
        super(initialBalance);
        this.interestRate = interestRate;
    }

    public void applyInterest() {
        double interest = getBalance() * interestRate;
        deposit(interest);
    }

    @Override
    public String toString() {
        return "SavingsAccount{" +
                "balance=" + getBalance() +
                ", interestRate=" + interestRate +
                '}';
    }
}