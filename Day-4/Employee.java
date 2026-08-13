// PRACTICAL 3 
// — Employee1

// Create:

// Employee1

// Fields:

// private int id;
// private String name;
// private double salary;

// Create:

// getId()
// getName()
// getSalary()

// setName()
// setSalary()

// Do not create:

// setId()

// Make the ID immutable after construction.

// Constructor:

// Employee1(int id, String name, double salary)

// Rules:

// id <= 0
//     → invalid

// name empty
//     → invalid

// salary < 0
//     → invalid

public class Employee {
    private final int id;
    private String name;
    private String department;
    private double salary;

    public Employee(int id, String name, String department, double salary) {

        if (id <= 0) {
            throw new IllegalArgumentException("Invalid ID");
        }

        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Invalid name");
        }

        if (department == null || department.isBlank()) {
            throw new IllegalArgumentException("Invalid department");
        }

        if (salary <= 0) {
            throw new IllegalArgumentException("Invalid salary");
        }

        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public void setName(String name) {
        if (name == null || name.isBlank()) {
            System.out.println("Invalid name");
        } else {
            this.name = name;
        }
    }

    public void setDepartment(String department) {
        if (department == null || department.isBlank()) {
            System.out.println("Invalid department");
        } else {
            this.department = department;
        }
    }

    public void setSalary(double salary) {
        if (salary <= 0) {
            System.out.println("Invalid salary");
        } else {
            this.salary = salary;
        }
    }

    public void displayEmployee() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
    }

    public double calculateAnnualSalary() {
        return salary * 12;
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee(1, "John Doe", "Engineering", 50000);
        emp1.displayEmployee();
        System.out.println("Annual Salary: " + emp1.calculateAnnualSalary());

        // Testing invalid cases
        try {
            Employee emp2 = new Employee(-1, "", "", -1000);
            emp2.displayEmployee();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}