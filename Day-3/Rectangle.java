// Q2 — Rectangle

// Create:

// Rectangle

// Fields:

// length
// width

// Methods:

// calculateArea()
// calculatePerimeter()

// Use a parameterized constructor.


class Rectangle {
    double length;
    double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    double calculateArea() {
        return length * width;
    }

    double calculatePerimeter() {
        return 2 * (length + width);
    }

    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(5.0, 3.0);
        System.out.println("Area of Rectangle 1: " + rect1.calculateArea());
        System.out.println("Perimeter of Rectangle 1: " + rect1.calculatePerimeter());

        System.out.println("");

        Rectangle rect2 = new Rectangle(7.5, 4.5);
        System.out.println("Area of Rectangle 2: " + rect2.calculateArea());
        System.out.println("Perimeter of Rectangle 2: " + rect2.calculatePerimeter());
    }
}