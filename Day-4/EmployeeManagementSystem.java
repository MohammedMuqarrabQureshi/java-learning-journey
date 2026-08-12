// DAY 4 MINI PROJECT — Employee Management System
// Create:
// EmployeeManagementSystem

// Your Employee class should have:
// private final int id;
// private String name;
// private String department;
// private double salary;

// Constructor:
// Employee(
//     int id,
//     String name,
//     String department,
//     double salary
// )

// Validation
// ID <= 0
//     → Invalid ID

// name empty
//     → Invalid name

// department empty
//     → Invalid department

// salary <= 0
//     → Invalid salary

// Methods
// getId()
// getName()
// getDepartment()
// getSalary()

// setName()
// setDepartment()
// setSalary()

// displayEmployee()
// calculateAnnualSalary()

// Important
// There should be no:
// setId()
// because employee ID shouldn't arbitrarily change.

// 🎯 Example
// Your program should eventually be able to do:
// Employee employee =
//         new Employee(
//                 101,
//                 "Muqarrab",
//                 "Engineering",
//                 45000
//         );

// employee.displayEmployee();
// employee.setSalary(50000);
// System.out.println("Updated Salary: " + employee.getSalary());

// But:
// employee.setSalary(-10000);
// should be rejected.
// And:
// employee.setId(999);
// shouldn't even exist.
// That's proper encapsulation.

// class Employee {
//     private final int id;
//     private String name;
//     private String department;
//     private double salary;

//     // Constructor
//     public Employee(int id, String name, String department, double salary) {

//         if (id <= 0) {
//             throw new IllegalArgumentException("Invalid ID");
//         }

//         if (name == null || name.isEmpty()) {
//             throw new IllegalArgumentException("Invalid name");
//         }

//         if (department == null || department.isEmpty()) {
//             throw new IllegalArgumentException("Invalid department");
//         }

//         if (salary <= 0) {
//             throw new IllegalArgumentException("Invalid salary");
//         }

//         this.id = id;
//         this.name = name;
//         this.department = department;
//         this.salary = salary;
//     }

//     // Getters
//     public int getId() {
//         return id;
//     }

//     public String getName() {
//         return name;
//     }

//     public String getDepartment() {
//         return department;
//     }

//     public double getSalary() {
//         return salary;
//     }

//     // Setters
//     public void setName(String name) {
//         if (name == null || name.isEmpty()) {
//             System.out.println("Invalid name");
//         } else {
//             this.name = name;
//         }
//     }

//     public void setDepartment(String department) {
//         if (department == null || department.isEmpty()) {
//             System.out.println("Invalid department");
//         } else {
//             this.department = department;
//         }
//     }

//     public void setSalary(double salary) {
//         if (salary <= 0) {
//             System.out.println("Invalid salary");
//         } else {
//             this.salary = salary;
//         }
//     }

//     // Display employee details
//     public void displayEmployee() {
//         System.out.println("ID: " + id);
//         System.out.println("Name: " + name);
//         System.out.println("Department: " + department);
//         System.out.println("Salary: " + salary);
//     }

//     // Calculate annual salary
//     public double calculateAnnualSalary() {
//         return salary * 12;
//     }
// }

public class EmployeeManagementSystem {
    public static void main(String[] args) {

        Employee employee = new Employee(
                101,
                "Muqarrab",
                "Engineering",
                45000
        );

        employee.displayEmployee();

        employee.setSalary(50000);
        System.out.println("Updated Salary: " + employee.getSalary());

        // Invalid salary - rejected
        employee.setSalary(-10000);

        // Invalid name - rejected
        employee.setName("");

        // Invalid department - rejected
        employee.setDepartment("");

        System.out.println("Annual Salary: " +
                employee.calculateAnnualSalary());

        employee.displayEmployee();

        // This does NOT exist:
        // employee.setId(999);
    }
}