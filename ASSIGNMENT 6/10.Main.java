// 10. Create an abstract class Accounts with the following details: Data Members: (a) Balance (b) accountNumber (c) accountHoldersName (d) address
// Methods: (a) withdrawl()- abstract , (b) deposit()- abstract , (c) display() to show the balance of the account number Create a subclass of this class SavingsAccount and add the following details:
// Data Members: (a) rateOfInterest Methods: (a) calculateAount()

// Abstract class Accounts
abstract class Accounts {
    // Data members
    protected double balance;
    protected String accountNumber;
    protected String accountHoldersName;
    protected String address;

    // Constructor
    public Accounts(double balance, String accountNumber, String accountHoldersName, String address) {
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.accountHoldersName = accountHoldersName;
        this.address = address;
    }

    // Abstract methods
    public abstract void withdrawl(double amount);
    public abstract void deposit(double amount);

    // Concrete method to display balance
    public void display() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}

// Subclass SavingsAccount
class SavingsAccount extends Accounts {
    // Data member
    private double rateOfInterest;

    // Constructor
    public SavingsAccount(double balance, String accountNumber, String accountHoldersName, String address, double rateOfInterest) {
        super(balance, accountNumber, accountHoldersName, address);
        this.rateOfInterest = rateOfInterest;
    }

    // Implement abstract method for withdrawal
    public void withdrawl(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance!");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful. Updated balance: " + balance);
        }
    }

    // Implement abstract method for deposit
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit successful. Updated balance: " + balance);
    }

    // Method to calculate interest
    public void calculateAmount() {
        double interest = balance * rateOfInterest / 100;
        System.out.println("Interest calculated: " + interest);
        balance += interest;
        System.out.println("Balance after interest: " + balance);
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        // Create an object of SavingsAccount
        SavingsAccount savingsAccount = new SavingsAccount(1000, "SA12345", "John Doe", "123 Main St", 5.0);

        // Display initial balance
        savingsAccount.display();

        // Perform operations
        savingsAccount.deposit(500);  // Deposit 500
        savingsAccount.withdrawl(200); // Withdraw 200
        savingsAccount.calculateAmount(); // Calculate interest

        // Display final balance
        savingsAccount.display();
    }
}