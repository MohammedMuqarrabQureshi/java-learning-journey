// Q2 — BankAccount

// Improve your Day-3 BankAccount.

// Fields:

// private String accountNumber;
// private String accountHolder;
// private double balance;

// Create:

// getAccountNumber()
// getAccountHolder()
// getBalance()

// Don't create:

// setBalance()

// Instead, balance should only change through:

// deposit()
// withdraw()


/**
 * BankAccount
 */
public class BankAccount {

    private String accountNumber;
    private String accountHolder;
    private double balance;

    // Constructor
    public BankAccount(String accountNumber, String accountHolder, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
    }

    // Getters
    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        } else if (amount > balance) {
            System.out.println("Insufficient funds.");
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }

    //Setters for accountNumber and accountHolder
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    //balance should not have a setter as per the requirement, so we won't create a setBalance() method.
    public static void main(String[] args) {
    BankAccount account = new BankAccount("123456", "John Doe", 1000.0);

    System.out.println("Account Number: " + account.getAccountNumber());
    System.out.println("Account Holder: " + account.getAccountHolder());
    System.out.println("Initial Balance: " + account.getBalance());

    System.out.println("Depositing 500...");
    account.deposit(500);

    System.out.println("Balance: " + account.getBalance());

    System.out.println("Withdrawing 200...");
    account.withdraw(200);

    System.out.println("Balance: " + account.getBalance());
}

}