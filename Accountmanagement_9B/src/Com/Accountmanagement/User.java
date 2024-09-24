package Com.Accountmanagement;

public class User extends Thread{
	private Bankaccount account;
    private boolean deposit;
    private double amount;

    public User(Bankaccount account, boolean deposit, double amount) {
        this.account = account;
        this.deposit = deposit;
        this.amount = amount;
    }

    @Override
    public void run() {
        if (deposit) {
            account.deposit(amount);
        } else {
            account.withdraw(amount);
        }
    }
}
