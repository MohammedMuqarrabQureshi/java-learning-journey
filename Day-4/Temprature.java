// Q3 — Temperature

// Create:
// Temperature

// Field:
// private double celsius;

// Setter:
// setCelsius()

// Rules:
// temperature < -273.15
//         ↓
// Invalid

// Getter:
// getCelsius()

// Also create:
// getFahrenheit()

// Formula:
// F = (C × 9/5) + 32

/**
 * Temprature
 */
public class Temprature {

    private double celsius;

    public double getCelsius() {
        return celsius;
    }

    public void setCelsius(double celsius) {
        if (celsius < -273.15) {
            System.out.println("Invalid");
        } else {
            this.celsius = celsius;
        }
    }

    public double getFahrenheit() {
        return (celsius * 9 / 5) + 32;
    }

    public static void main(String[] args) {
        Temprature temp = new Temprature();
        temp.setCelsius(25);
        System.out.println("Celsius: " + temp.getCelsius());
        System.out.println("Fahrenheit: " + temp.getFahrenheit());

        temp.setCelsius(-300); // Invalid
    }
}