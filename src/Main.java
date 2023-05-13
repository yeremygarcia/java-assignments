/*public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(500, "Bob");
        account.deposit(100);
        account.printAccountDetails();
    }
}

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
*/
import java.util.ArrayList;
import java.util.Scanner;
public class BankAccountMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<BankAccount> accounts = new ArrayList<>();

        BankAccount bankAccount = new BankAccount(500, "Bob", 1);
        BankAccount bankAccount1 = new BankAccount(5000, "Bill", 2);
        BankAccount bankAccount2 = new BankAccount(300, "Jen", 3);


        accounts.add(bankAccount);
        accounts.add(bankAccount1);
        accounts.add(bankAccount2);

        System.out.println("Hello World! Welcome to the Bank of CTAC!");
        System.out.println("Are you an existing customer? (-1 to exit)");
        System.out.println("1. Yes");
        System.out.println("2. No");
        int accountChoice = scanner.nextInt();

        if (accountChoice == 1) {
            System.out.println("Select an account:");
            for (int i = 0; i < accounts.size(); i++) {
                System.out.println((i + 1) + ". " + accounts.get(i).getAccountHolderName());
            }
            int selectedAccountChoice = scanner.nextInt();
            scanner.nextLine();

            if (selectedAccountChoice >= 1 && selectedAccountChoice <= accounts.size()) {
                BankAccount selectedAccount = accounts.get(selectedAccountChoice - 1);
                mainMenu(selectedAccount, accounts);
            } else {
                System.out.println("Invalid. Please try again.");
            }
        } else if (accountChoice == 2) {
            scanner.nextLine();
            System.out.println("Welcome to Bank of CTAC! Enter your name.");
            String accountHolder = scanner.nextLine();
            System.out.println("What is the beginning balance for the account?");
            double initialBalance = scanner.nextDouble();
            scanner.nextLine();

            BankAccount newAccount = new BankAccount(initialBalance, accountHolder, accounts.size() + 1);
            accounts.add(newAccount);

            System.out.println("Your new account has been created successfully.");
            mainMenu(newAccount, accounts);
        } else {
            System.out.println("Please come again and have a great day!");
        }
    }

    public static void mainMenu(BankAccount bankAccount, ArrayList<BankAccount> accounts) {
        Scanner scanner = new Scanner(System.in);
        String userChoice;
        boolean exitMenu = false;

        System.out.println("Hello " + bankAccount.getAccountHolderName() + "!");
        System.out.println("Welcome to the main menu, what would you like to do today?");

        while (!exitMenu) {
            System.out.println("1. To Check Account Balance");
            System.out.println("2. To Make A Withdrawal");
            System.out.println("3. To Make A Deposit");
            System.out.println("4. To Make A Transfer To An Another Account");
            System.out.println("0. To Exit");
            userChoice = scanner.nextLine();

            switch (userChoice) {
                case "1":
                    System.out.println("Account Balance: $" + bankAccount.getAccountBalance());
                    break;
                case "2":
                    System.out.print("Enter the withdrawal amount: $");
                    double withdrawalAmount = scanner.nextDouble();
                    scanner.nextLine();
                    bankAccount.withdrawal(withdrawalAmount);
                    break;
                case "3":
                    System.out.print("Enter the deposit amount: $");
                    double depositAmount = scanner.nextDouble();
                    scanner.nextLine();
                    bankAccount.deposit(depositAmount);
                    break;
                case "4":
                    System.out.print("Enter the destination account number: ");
                    int destinationAccountNumber = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter the transfer amount: $");
                    double transferAmount = scanner.nextDouble();
                    scanner.nextLine();

                    BankAccount destinationAccount = null;

                    for (BankAccount account : accounts) {
                        if (account.getAccountNumber() == destinationAccountNumber) {
                            destinationAccount = account;
                            break;
                        }
                    }

                    if (destinationAccount != null) {
                        bankAccount.transfer(destinationAccount, transferAmount);
                    } else {
                        System.out.println("Destination account not found. You must enter a real account, the transfer is cancelled.");
                    }
                    break;
                case "0":
                    System.out.println("Thank you for using CTAC Bank! Have a nice day!");
                    exitMenu = true;
                    break;
                default:
                    System.out.println("Invalid. Please try again.");
            }
        }
    }
}
