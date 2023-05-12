public class BankAccount {
    private double balance;
    private String accountHolderName;

    public BankAccount(double initialBalance, String accountHolderName) {
        this.balance = initialBalance;
        this.accountHolderName = accountHolderName;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdrawal(double amount) {
        balance -= amount;
    }

    public void printAccountDetails() {
        System.out.println("Account Holder's Name: " + accountHolderName);
        System.out.println("Account Balance: $" + balance);
    }
}
