// Q4 — Employee Salary

// Create:

// Employee

// Fields:

// id
// name
// salary

// Create:

// calculateAnnualSalary()

// If monthly salary is ₹50,000:

// Annual Salary = 600000

public class EmployeeSalary {
    int id;
    String name;
    double salary;

    EmployeeSalary(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    double calculateAnnualSalary() {
        return salary * 12;
    }

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Monthly Salary: " + salary);
        System.out.println("Annual Salary: " + calculateAnnualSalary());
    }

    public static void main(String[] args) {
        EmployeeSalary emp1 = new EmployeeSalary(1, "Muqarrab", 35000);
        EmployeeSalary emp2 = new EmployeeSalary(2, "Ali", 40000);

        emp1.display();
        System.out.println("");
        emp2.display();
    }
}
