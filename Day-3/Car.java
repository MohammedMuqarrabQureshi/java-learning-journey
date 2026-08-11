// Q1 — Car Class

// Create a Car class containing:

// brand
// model
// price

// Create a method:

// displayDetails()

// Create 3 car objects and display their details.

class Car {
    String brand;
    String model;
    double price;

    Car(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "Supra", 25000);
        Car car2 = new Car("Honda", "Civic", 22000);
        Car car3 = new Car("Ford", "Mustang", 35000);

        car1.displayDetails();
        System.out.println();
        car2.displayDetails();
        System.out.println();
        car3.displayDetails();
    }
}
