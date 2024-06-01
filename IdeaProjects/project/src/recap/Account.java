package recap;

public class Account {
    private int name;
    private int balance;

    public int checkBalance( String pin) {

        return balance;
    }
    public void deposit(int amount) {
        balance = balance + amount;
    }

    public void withdraw(int amount) {
        if (amount < balance) {
            balance +=balance;


        }
    }
}

