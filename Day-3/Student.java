// PRACTICAL 1 — Create Your First Class

class Student {
    String name;
    int age;
    double marks;

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Marks: " + marks);
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Muqarrab";
        s1.age = 24;
        s1.marks = 85.5;

        s1.display();
    }
}