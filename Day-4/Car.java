// PRACTICAL 1

// class Car {

//     private String brand;
//     private String model;
//     private double price;
// }

// Create getters and setters.

class Car {

    private String brand;
    private String model;
    private double price;

    // Getter for brand
    public String getBrand() {
        return brand;
    }

    // Setter for brand
    public void setBrand(String brand) {
        this.brand = brand;
    }

    // Getter for model
    public String getModel() {
        return model;
    }

    // Setter for model
    public void setModel(String model) {
        this.model = model;
    }

    // Getter for price
    public double getPrice() {
        return price;
    }

    // Setter for price
    public void setPrice(double price) {
        this.price = price;
    }

    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setBrand("Toyota");
        car1.setModel("Camry");
        car1.setPrice(30000);

        System.out.println("Car Brand: " + car1.getBrand());
        System.out.println("Car Model: " + car1.getModel());
        System.out.println("Car Price: $" + car1.getPrice());
    }
}   