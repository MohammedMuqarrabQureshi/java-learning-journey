// PRACTICAL 2
// -Add Validation

// Create:

// class Product {

//     private String name;
//     private double price;
//     private int quantity;
// }

// Create:

// getName()
// setName()

// getPrice()
// setPrice()

// getQuantity()
// setQuantity()

// Rules:

// price < 0
//     ↓
// Invalid price

// quantity < 0
//     ↓
// Invalid quantity

// name == null or empty
//     ↓
// Invalid name

class Product {

    private String name;
    private double price;
    private int quantity;

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name with validation
    public void setName(String name) {
        if (name == null || name.isBlank()) {
            System.out.println("Invalid name");
        } else {
            this.name = name;
        }
    }

    // Getter for price
    public double getPrice() {
        return price;
    }

    // Setter for price with validation
    public void setPrice(double price) {
        if (price <= 0) {
            System.out.println("Invalid price");
        } else {
            this.price = price;
        }
    }

    // Getter for quantity
    public int getQuantity() {
        return quantity;
    }

    // Setter for quantity with validation
    public void setQuantity(int quantity) {
        if (quantity <= 0) {
            System.out.println("Invalid quantity");
        } else {
            this.quantity = quantity;
        }
    }

    public static void main(String[] args) {
        Product product = new Product();

        // Test setting valid values
        product.setName("Laptop");
        product.setPrice(1200.50);
        product.setQuantity(10);

        System.out.println("Product Name: " + product.getName());
        System.out.println("Product Price: " + product.getPrice());
        System.out.println("Product Quantity: " + product.getQuantity());

        // Test setting invalid values
        product.setName("");
        product.setPrice(-100);
        product.setQuantity(-5);
    }
}