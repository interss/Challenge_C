import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AccountTest {
    private Account account;

    @BeforeEach
    void setUp() {
        account = new CheckingAccount();
    }

    @Test
    void testDeposit() {
        account.deposit(100);
        assertEquals(100, account.getBalance());
    }

    @Test
    void testWithdrawWithSufficientFunds() {
        account.deposit(100);
        account.withdraw(50);
        assertEquals(50, account.getBalance());
    }

    @Test
    void testWithdrawWithInsufficientFunds() {
        account.deposit(50);
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            account.withdraw(100);
        });
        assertEquals("Saldo insuficiente", exception.getMessage());
    }

    @Test
    void testGetBalance() {
        account.deposit(200);
        assertEquals(200, account.getBalance());
    }
}