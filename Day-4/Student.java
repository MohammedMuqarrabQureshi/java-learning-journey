// Q1 — Student

// Create:

// Student

// with:

// private name
// private age
// private marks

// Requirements:

// Getters for all
// Setters for all
// Age must be between 5 and 100
// Marks must be between 0 and 100

class student {
    private String name;
    private int age;
    private double marks;

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age with validation
    public void setAge(int age) {
        if (age < 5 || age > 100) {
            System.out.println("Invalid age");
        } else {
            this.age = age;
        }
    }

    // Getter for marks
    public double getMarks() {
        return marks;
    }

    // Setter for marks with validation
    public void setMarks(double marks) {
        if (marks < 0 || marks > 100) {
            System.out.println("Invalid marks");
        } else {
            this.marks = marks;
        }
    }

    public static void main(String[] args) {
        student student1 = new student();
        student1.setName("John Doe");
        student1.setAge(20);
        student1.setMarks(85.5);

        System.out.println("Student Name: " + student1.getName());
        System.out.println("Student Age: " + student1.getAge());
        System.out.println("Student Marks: " + student1.getMarks());
    }
}