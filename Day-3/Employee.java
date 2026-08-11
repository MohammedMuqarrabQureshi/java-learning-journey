// PRACTICAL 3 — Constructor Overloading

class Employee {
    String name;
    int age;
    double salary;

    Employee() {
        this.name = "Unknown";
        this.age = 0;
        this.salary = 0.0;
    }

    Employee(String name) {
        this.name = name;
    }

    Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    void display() {
        System.out.println(
                name + " | " +
                        age + " | " +
                        salary);
    }

    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee("Ahmed");
        Employee e3 = new Employee("Muqarrab", 25, 50000);

        e1.display();
        e2.display();
        e3.display();
    }
}