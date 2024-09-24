package Com.Accountmanagement;

public class App {
	public static void main(String[] args) {
        Bankaccount account = new Bankaccount(1000);

        Thread user1 = new User(account, true, 200);
        Thread user2 = new User(account, false, 100);
        Thread user3 = new User(account, true, 300);
        Thread user4 = new User(account, false, 500);
        Thread user5 = new User(account, false, 1000);

        user1.start();
        user2.start();
        user3.start();
        user4.start();
        user5.start();

        try {
            user1.join();
            user2.join();
            user3.join();
            user4.join();
            user5.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final Balance: " + account.getBalance());
    }
}
