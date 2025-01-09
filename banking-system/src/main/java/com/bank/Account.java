// Classe abstrata Account que representa uma conta bancária
public abstract class Account {
    // Saldo da conta
    protected double saldo;

    // Construtor que inicializa o saldo inicial da conta
    public Account(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    // Método que retorna o saldo atual da conta
    public double getSaldo() {
        return saldo;
    }

    // Método que deposita um valor na conta, se o valor for positivo
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        }
    }

    // Método abstrato para saque, que deve ser implementado pelas subclasses
    public abstract boolean sacar(double valor);
}