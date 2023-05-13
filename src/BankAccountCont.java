import java.util.ArrayList;
public class BankAccountCont {
    private double balance;
    private String accountHolderName;
    private int accountNumber;

    public BankAccountCont(double initialBalance, String accountHolderName, int accountNumber) {
        this.balance = initialBalance;
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
    }

    public BankAccountCont() {
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter the account holder's name: ");
        this.accountHolderName = input.nextLine();
        System.out.print("Enter the starting balance: ");
        this.balance = input.nextDouble();
        System.out.print("Enter the account number: ");
        this.accountNumber = input.nextInt();
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdrawal(double amount) {
        balance -= amount;
    }

    public void printAccountDetails() {
        System.out.println("Account Holder's Name: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Balance: $" + balance);
    }

    public static void main(String[] args) {
        ArrayList<BankAccount> accounts = new ArrayList<BankAccount>();
        accounts.add(new BankAccount(1000.00, "Bill", 123456));
        accounts.add(new BankAccount(500.00, "Ted", 789012));
        accounts.add(new BankAccount());

        for (BankAccount account : accounts) {
            account.deposit(100.00);
            account.withdrawal(50.00);
            account.printAccountDetails();
            System.out.println();
        }
    }
}
