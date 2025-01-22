import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AccountTest {
    private Account account;

    // Initial setup before each test
    // Configuração inicial antes de cada teste
    @BeforeEach
    void setUp() {
        account = new CheckingAccount(0); // Initializes a checking account with zero balance
        // Inicializa uma conta corrente com saldo zero
    }

    // Test to verify deposit into the account
    // Teste para verificar o depósito na conta
    @Test
    void testDeposit() {
        account.deposit(100); // Deposits 100 into the account
        // Deposita 100 na conta
        assertEquals(100, account.getBalance()); // Verifies if the balance is 100
        // Verifica se o saldo é 100
    }

    // Test to verify withdrawal with sufficient funds
    // Teste para verificar o saque com fundos suficientes
    @Test
    void testWithdrawWithSufficientFunds() {
        account.deposit(100); // Deposits 100 into the account
        // Deposita 100 na conta
        account.withdraw(50); // Withdraws 50 from the account
        // Saca 50 da conta
        assertEquals(50, account.getBalance()); // Verifies if the balance is 50
        // Verifica se o saldo é 50
    }

    // Test to verify withdrawal with insufficient funds
    // Teste para verificar o saque com fundos insuficientes
    @Test
    void testWithdrawWithInsufficientFunds() {
        account.deposit(50); // Deposits 50 into the account
        // Deposita 50 na conta
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            account.withdraw(100); // Attempts to withdraw 100, which should throw an exception
            // Tenta sacar 100, o que deve lançar uma exceção
        });
        assertEquals("Insufficient balance", exception.getMessage()); // Verifies if the exception message is "Insufficient balance"
        // Verifica se a mensagem da exceção é "Saldo insuficiente"
    }

    // Test to verify the account balance
    // Teste para verificar o saldo da conta
    @Test
    void testGetBalance() {
        account.deposit(200); // Deposits 200 into the account
        // Deposita 200 na conta
        assertEquals(200, account.getBalance()); // Verifies if the balance is 200
        // Verifica se o saldo é 200
    }
}