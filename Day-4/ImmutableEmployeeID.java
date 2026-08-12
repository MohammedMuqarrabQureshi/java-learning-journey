// Q5 — Immutable Employee ID

// Create:

// Employee

// with:

// private final int employeeId;
// private String name;
// private double salary;

// The ID should:

// be assigned in constructor
// have a getter
// have no setter

// Then explain why this is useful.

/**
 * ImmutableEmployeeID
 */
public class ImmutableEmployeeID {
    private final int employeeId;
    private String name;
    private double salary;

    // Constructor
    public ImmutableEmployeeID(int employeeId, String name, double salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.salary = salary;
    }

    // Getter for employeeId
    public int getEmployeeId() {
        return employeeId;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for salary
    public double getSalary() {
        return salary;
    }

    // Setter for salary
    public void setSalary(double salary) {
        this.salary = salary;
    }

    public static void main(String[] args) {
        ImmutableEmployeeID employee = new ImmutableEmployeeID(1, "John Doe", 50000);
        System.out.println("Employee ID: " + employee.getEmployeeId());
        System.out.println("Name: " + employee.getName());
        System.out.println("Salary: " + employee.getSalary());

        // Attempting to change the employeeId will result in a compilation error
        // employee.employeeId = 2; // This line would cause an error
        System.out.println("Updating the name and salary of the employee...");
        // However, we can change the name and salary
        employee.setName("Patrick Jane");
        employee.setSalary(60000);
        System.out.println("Updated Name: " + employee.getName());
        System.out.println("Updated Salary: " + employee.getSalary());
    }
}