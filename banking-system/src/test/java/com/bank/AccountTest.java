import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AccountTest {
    private Account account;

    // Configuração inicial antes de cada teste
    @BeforeEach
    void setUp() {
        account = new CheckingAccount(0); // Inicializa uma conta corrente com saldo zero
    }

    // Teste para verificar o depósito na conta
    @Test
    void testDeposit() {
        account.deposit(100); // Deposita 100 na conta
        assertEquals(100, account.getBalance()); // Verifica se o saldo é 100
    }

    // Teste para verificar o saque com fundos suficientes
    @Test
    void testWithdrawWithSufficientFunds() {
        account.deposit(100); // Deposita 100 na conta
        account.withdraw(50); // Saca 50 da conta
        assertEquals(50, account.getBalance()); // Verifica se o saldo é 50
    }

    // Teste para verificar o saque com fundos insuficientes
    @Test
    void testWithdrawWithInsufficientFunds() {
        account.deposit(50); // Deposita 50 na conta
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            account.withdraw(100); // Tenta sacar 100, o que deve lançar uma exceção
        });
        assertEquals("Saldo insuficiente", exception.getMessage()); // Verifica se a mensagem da exceção é "Saldo insuficiente"
    }

    // Teste para verificar o saldo da conta
    @Test
    void testGetBalance() {
        account.deposit(200); // Deposita 200 na conta
        assertEquals(200, account.getBalance()); // Verifica se o saldo é 200
    }
}