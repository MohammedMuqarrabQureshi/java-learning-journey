// MINI PROJECT — BANK ACCOUNT SYSTEM
// Now build a small but realistic console application.
// Requirements
// Create:
// BankAccount
// Fields:

// private String accountNumber;
// private String accountHolder;
// private double balance;

// Create constructors.

// Constructor 1
// BankAccount()
// Constructor 2
// BankAccount(String accountNumber,
//             String accountHolder,
//             double balance)

// Methods:
// deposit()
// withdraw()
// displayAccountDetails()
// Expected interaction

// Your program should eventually behave something like:
// ===== BANK ACCOUNT =====

// Account Number: 1001
// Account Holder: Muqarrab
// Balance: ₹10000

// Depositing ₹5000...

// Current Balance: ₹15000

// Withdrawing ₹3000...

// Current Balance: ₹12000

// Add these rules:
// deposit amount <= 0
//         ↓
// Invalid amount

// withdraw amount <= 0
//         ↓
// Invalid amount

// withdraw amount > balance
//         ↓
// Insufficient balance

public class BankAccountSystem {
    private String accountNumber;
    private String accountHolder;
    private double balance;

    // Constructor 1
    public BankAccountSystem() {
        this.accountNumber = "0000";
        this.accountHolder = "Default Holder";
        this.balance = 0.0;
    }

    // Constructor 2
    public BankAccountSystem(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount");
            return;
        }
        balance += amount;
        System.out.println("Deposited: ₹" + amount);
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount");
            return;
        }
        if (amount > balance) {
            System.out.println("Insufficient balance");
            return;
        }
        balance -= amount;
        System.out.println("Withdrew: ₹" + amount);
    }

    public void displayAccountDetails() {
        System.out.println("===== BANK ACCOUNT =====");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: ₹ " +  balance);
    }

    public static void main(String[] args) {
        BankAccountSystem account1 = new BankAccountSystem("1001", "Muqarrab", 10000.0);
        account1.displayAccountDetails();

        System.out.println("\nDepositing ₹5000...");
        account1.deposit(5000.0);
        System.out.println("Current Balance: ₹" + account1.balance);

        System.out.println("\nWithdrawing ₹3000...");
        account1.withdraw(3000.0);
        System.out.println("Current Balance: ₹" + account1.balance);

        System.out.println("\nAttempting to withdraw ₹20000...");
        account1.withdraw(20000.0); // Attempt to withdraw more than balance
    }
}