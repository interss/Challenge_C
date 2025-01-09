// A classe InvestmentAccount estende a classe Account
public class InvestmentAccount extends Account {
    // Taxa de investimento
    private double investmentRate;

    // Construtor que inicializa o saldo inicial e a taxa de investimento
    public InvestmentAccount(double initialBalance, double investmentRate) {
        super(initialBalance); // Chama o construtor da classe pai (Account)
        this.investmentRate = investmentRate; // Inicializa a taxa de investimento
    }

    // Método que aplica o investimento ao saldo atual
    public void applyInvestment() {
        double interest = getBalance() * investmentRate; // Calcula o interesse baseado no saldo e na taxa de investimento
        deposit(interest); // Deposita o interesse no saldo
    }

    // Sobrescreve o método toString para fornecer uma representação em string do objeto
    @Override
    public String toString() {
        return "InvestmentAccount{" +
                "balance=" + getBalance() + // Obtém o saldo atual
                ", investmentRate=" + investmentRate + // Obtém a taxa de investimento
                '}';
    }
}