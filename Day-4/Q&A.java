// DAY 4 INTERVIEW QUESTIONS

// You should eventually be able to answer these without notes:

// Encapsulation
// What is encapsulation?
// Why do we use encapsulation?
// How is encapsulation implemented in Java?
// Why should fields generally be private?
// What is data hiding?
// What is the difference between encapsulation and data hiding?
// Getters / Setters
// What is a getter?
// What is a setter?
// Why do we need getters and setters?
// Can a class have a getter but no setter?
// Can a class have a setter but no getter?
// Why shouldn't every field necessarily have a setter?
// Access Modifiers
// Explain private.
// Explain public.
// What is default/package-private access?
// What is protected?
// Which access modifier provides the strongest restriction?
// Design
// Why shouldn't BankAccount.balance be public?
// Why might password have a setter but no getter?
// Why might an ID have a getter but no setter?
// Can a constructor access private fields?
// Can methods inside the class access private fields?
// Java Concepts
// What is a POJO?
// What is a JavaBean?
// What is the difference between a POJO and a JavaBean?
// What is an immutable object?
// How can you make a field immutable?













// DAY 4 CHALLENGE

// At the end of Day 4, I want you to be able to look at this:

// public class BankAccount {

//     private final String accountNumber;
//     private String accountHolder;
//     private double balance;

//     public BankAccount(
//             String accountNumber,
//             String accountHolder,
//             double balance) {

//         this.accountNumber = accountNumber;
//         this.accountHolder = accountHolder;
//         this.balance = balance;
//     }

//     public String getAccountNumber() {
//         return accountNumber;
//     }

//     public String getAccountHolder() {
//         return accountHolder;
//     }

//     public void setAccountHolder(String accountHolder) {
//         this.accountHolder = accountHolder;
//     }

//     public double getBalance() {
//         return balance;
//     }

//     public void deposit(double amount) {
//         // validation
//     }

//     public void withdraw(double amount) {
//         // validation
//     }
// }

// and explain every single design decision.

// Not just:

// "It's encapsulation."

// I want you to be able to explain:

// Why is accountNumber private?
// Why is it final?
// Why is there no setter?
// Why is balance private?
// Why don't we have setBalance()?
// Why do we have deposit() and withdraw()?
// Why is getBalance() okay?
// Where should validation happen?