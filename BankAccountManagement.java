class BankAccount {
    // Class attributes
    public String accountNumber;
    protected String accountHolder;
    private double balance;

    // Parameterized Constructor
    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Method to get balance
    public double getBalance() {
        return balance;
    }

    // Method to set balance
    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Method to display account details
    public void displayAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
    }
}

// Subclass
class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String accountNumber, String accountHolder, double balance, double interestRate) {
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }

    // Method to display saving account details
    public void displaySavingsAccountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + getBalance());
        System.out.println("Interest Rate: " + interestRate);
    }

    // Method to update account holder
    public void updateAccountHolder(String newAccountHolder) {
        this.accountHolder = newAccountHolder;
    }
}

public class BankAccountManagement {
    public static void main(String[] args) {
        System.out.println("Account Details:");
        BankAccount account1 = new BankAccount("123456789", "Alice Smith", 1000.0);
        account1.displayAccountDetails();

        account1.setBalance(1500.0);
        System.out.println("Updated Balance: " + account1.getBalance());

        System.out.println("Saving Account Details:");
        SavingsAccount savingsAccount1 = new SavingsAccount("987654321", "Charlie Johnson", 2000.0, 0.02);
        savingsAccount1.displaySavingsAccountDetails();

        System.out.println("Updated Saving Account Details:");
        savingsAccount1.updateAccountHolder("Alex Johnson");
        savingsAccount1.displaySavingsAccountDetails();

        System.out.println("Account number of account 1: " + account1.accountNumber);
        System.out.println("Account number of savings account 1: " + savingsAccount1.accountNumber);
    }
}

/*
Output:
    Account Details:
    Account Number: 123456789
    Account Holder: Alice Smith
    Balance: 1000.0
    Updated Balance: 1500.0
    Saving Account Details:
    Account Number: 987654321
    Balance: 2000.0
    Interest Rate: 0.02
    Updated Saving Account Details:
    Account Number: 987654321
    Balance: 2000.0
    Interest Rate: 0.02
    Account number of account 1: 123456789
    Account number of savings account 1: 987654321
 */