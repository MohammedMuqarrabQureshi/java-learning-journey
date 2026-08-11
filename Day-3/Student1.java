// PRACTICAL 2 — Add Constructor

public class Student1 {
    String name;
    int age;
    double marks;

    Student1(String name, int age, double marks) {
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Marks: " + marks);
    }

    public static void main(String[] args) {
        Student1 s1 = new Student1("Muqarrab", 24, 85.5);
        Student1 s2 = new Student1("Ali", 22, 90.0);

        s1.display();
        s2.display();
    }
}
