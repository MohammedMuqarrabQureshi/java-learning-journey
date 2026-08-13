// Q4 — User Account

// Create:

// UserAccount

// Fields:

// private username
// private email
// private password

// Requirements:

// username cannot be empty
// email must contain @
// password must have at least 8 characters

// Important:

// Create:

// getUsername()
// getEmail()

// but do not create getPassword().

// Why?

// Because password is sensitive data and should not casually be exposed.

// This is a good real-world design exercise.


import java.util.Scanner;
class UserAccount {
    private String username;
    private String email;
    private String password;

    // Constructor
    public UserAccount(String username, String email, String password) {
        setUsername(username);
        setEmail(email);
        setPassword(password);
    }

    // Getter for username
    public String getUsername() {
        return username;
    }

    // Setter for username with validation
    public void setUsername(String username) {
        if (username == null || username.isBlank()) {
            System.out.println("Invalid username");
        } else {
            this.username = username;
        }
    }

    // Getter for email
    public String getEmail() {
        return email;
    }

    // Setter for email with validation
    public void setEmail(String email) {
        if (email == null || !email.contains("@")) {
            System.out.println("Invalid email");
        } else {
            this.email = email;
        }
    }

    // Setter for password with validation
    public void setPassword(String password) {
        if (password == null || password.length() < 8) {
            System.out.println("Invalid password");
        } else {
            this.password = password;
        }
    }

    public static void main(String[] args) {
        // UserAccount user = new UserAccount("john_doe", "johndoe@gmail.com", "password123");
        // System.out.println("Username: " + user.getUsername());  
        // System.out.println("Email: " + user.getEmail());
        // System.out.println("Password is set but not retrievable for security reasons.");
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter username: ");
    String username = scanner.nextLine();
    System.out.print("Enter email: ");
    String email = scanner.nextLine();
    System.out.print("Enter password: ");
    String password = scanner.nextLine();
    System.out.println("Creating user account...");
    UserAccount user = new UserAccount(username, email, password);
    System.out.println("Username: " + user.getUsername());
    System.out.println("Email: " + user.getEmail());
    System.out.println("Password is set but not retrievable for security reasons.");
    scanner.close();
    }

}