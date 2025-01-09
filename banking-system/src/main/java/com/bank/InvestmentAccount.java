public class InvestmentAccount extends Account {
    private double investmentRate;

    public InvestmentAccount(double initialBalance, double investmentRate) {
        super(initialBalance);
        this.investmentRate = investmentRate;
    }

    public void applyInvestment() {
        double interest = getBalance() * investmentRate;
        deposit(interest);
    }

    @Override
    public String toString() {
        return "InvestmentAccount{" +
                "balance=" + getBalance() +
                ", investmentRate=" + investmentRate +
                '}';
    }
}