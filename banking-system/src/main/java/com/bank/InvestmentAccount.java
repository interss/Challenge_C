// The InvestmentAccount class extends the Account class
// A classe InvestmentAccount estende a classe Account
public class InvestmentAccount extends Account {
    // Investment rate
    // Taxa de investimento
    private double investmentRate;

    // Constructor initializing the initial balance and investment rate
    // Construtor que inicializa o saldo inicial e a taxa de investimento
    public InvestmentAccount(double initialBalance, double investmentRate) {
        super(initialBalance); // Calls the constructor of the parent class (Account)
        // Chama o construtor da classe pai (Account)
        this.investmentRate = investmentRate; // Initializes the investment rate
        // Inicializa a taxa de investimento
    }

    // Method applying investment to the current balance
    // Método que aplica o investimento ao saldo atual
    public void applyInvestment() {
        double interest = getBalance() * investmentRate; // Calculates interest based on the balance and investment rate
        // Calcula o interesse baseado no saldo e na taxa de investimento
        deposit(interest); // Deposits the interest into the balance
        // Deposita o interesse no saldo
    }

    // Overrides the toString method to provide a string representation of the object
    // Sobrescreve o método toString para fornecer uma representação em string do objeto
    @Override
    public String toString() {
        return "InvestmentAccount{" +
                "balance=" + getBalance() + // Gets the current balance
                // Obtém o saldo atual
                ", investmentRate=" + investmentRate + // Gets the investment rate
                // Obtém a taxa de investimento
                '}';
    }
}