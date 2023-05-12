/*public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(500, "Bob");
        account.deposit(100);
        account.printAccountDetails();
    }
}
 */
public class Main {
    public static void main(String[] args) {
        // Create the first account with an initial balance of $5000
        BankAccount account1 = new BankAccount(5000, "Bob");

        // Create the second account with an initial balance of $300
        BankAccount account2 = new BankAccount(300, "Bill");

        // Withdraw $100 from account1
        account1.withdrawal(100);

        // Deposit $100 into account2
        account2.deposit(100);

        // Print the account details for both accounts
        account1.printAccountDetails();
        account2.printAccountDetails();
    }
}

