// Q3 — Bank Account

// Create:

// BankAccount

// Fields:

// accountNumber
// accountHolder
// balance

// Methods:

// deposit()
// withdraw()
// displayBalance()

// Use a constructor to initialize the account.

public class BankAccount {
    int accountNumber;
    String accountHolder;
    double balance;

    BankAccount(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    void displayBalance() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(123456, "Muqarrab", 1000.0);
        account1.displayBalance();
        account1.deposit(500.0);
        account1.displayBalance();
        account1.withdraw(200.0);
        account1.displayBalance();
        account1.withdraw(2000.0); // Attempt to withdraw more than balance
    }
}
