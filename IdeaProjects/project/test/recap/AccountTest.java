package recap;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {

    @Test
    public void newAccountBalance_isZero() {
        Account obaTurn = new Account();
        int balance = obaTurn.checkBalance("pin");
        assertEquals(0, balance);
        obaTurn.deposit(2000);
        int newBalance = obaTurn.checkBalance("pin");
        assertEquals(2000, newBalance);
        obaTurn.deposit(2000);
        int newBalanceOne = obaTurn.checkBalance("pin");
        assertEquals(4000, newBalanceOne);
    }
    @Test
    public void newAccountBalance_isPositive() {
        Account obaTurn = new Account();
        obaTurn.deposit(3000);
        int balance = obaTurn.checkBalance("pin");
        assertEquals(3000, balance);
    }

    @Test
    public void balanceOf1k_andWithdraw5k() {
        Account obaTurn = new Account();
        obaTurn.deposit(1000);
        obaTurn.withdraw(5000);
        int balance = obaTurn.checkBalance("pin");
        assertEquals(1000, balance);

    }

}

