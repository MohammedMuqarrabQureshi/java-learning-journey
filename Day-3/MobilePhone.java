// Q6 — Mobile Phone

// Create:

// MobilePhone

// Fields:

// brand
// model
// price
// storage

// Create:

// Default constructor
// Constructor with brand + model
// Constructor with all fields

public class MobilePhone {
    String brand;
    String model;
    double price;
    int storage;

    // Default constructor
    MobilePhone() {
        this.brand = "Unknown";
        this.model = "Unknown";
        this.price = 0.0;
        this.storage = 0;
    }

    // Constructor with brand + model
    MobilePhone(String brand, String model) {
        this.brand = brand;
        this.model = model;
        this.price = 0.0;
        this.storage = 0;
    }

    // Constructor with all fields
    MobilePhone(String brand, String model, double price, int storage) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.storage = storage;
    }

    void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
        System.out.println("Storage: " + storage + "GB");
    }

    public static void main(String[] args) {
        MobilePhone phone1 = new MobilePhone();
        MobilePhone phone2 = new MobilePhone("Apple", "iPhone 17 Pro Max");
        MobilePhone phone3 = new MobilePhone("Samsung", "Galaxy S26 Ultra", 84000.00, 128);

        phone1.displayDetails();
        System.out.println();
        phone2.displayDetails();
        System.out.println();
        phone3.displayDetails();
    }
}