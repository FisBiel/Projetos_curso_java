import entities.Account;
import entities.BusinessAccount;
import entities.SavingAccount;

public class App {
    public static void main(String[] args) throws Exception {
        BusinessAccount account = new BusinessAccount();

        Account acc = new Account(1001, "Alex", 0.0);
        BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);

        // Upcasting

        Account acc1 = bacc;
        Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
        Account acc3 = new SavingAccount(1004, "Anna", 0.0, 0.01);

        // Dpwncasting

        BusinessAccount acc4 = (BusinessAccount) acc2;
        acc4.loan(100.0);
        if (acc3 instanceof BusinessAccount) {
            BusinessAccount acc5 = (BusinessAccount) acc3;
            acc5.loan(200.0);
            System.out.println("loan!");
        }

        if (acc3 instanceof SavingAccount) {
            SavingAccount acc5 = (SavingAccount) acc3;
            acc5.updateBalnace();
            System.out.println("Update!");
        }
    }
}
