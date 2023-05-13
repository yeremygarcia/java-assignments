public class BankAccount {
    private double balance;
    private String accountHolderName;
    private int accountNumber;
    public BankAccount(double initialBalance, String accountHolderName,  int accountNumber) {
        this.balance = initialBalance;
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
    }

    public void deposit(double amount) {
        balance += amount;
    }
    public int getAccountNumber() {
        return accountNumber;
    }
    public void withdrawal(double amount) {
        balance -= amount;
    }

    public void printAccountDetails() {
        System.out.println("Account Holder's Name: " + accountHolderName);
        System.out.println("Account Balance: $" + balance);
        System.out.println("Account Number: ");
    }
}
