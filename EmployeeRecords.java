class Employee {
    // Class attributes
    public int employeeID;
    protected String department;
    private double salary;

    // Parameterized Constructor
    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    // Method to get salary
    public double getSalary() {
        return salary;
    }

    // Method to set salary
    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Method to display employee details
    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: Rs." + salary);
    }
}

// Subclass
class Manager extends Employee {
    private String teamName;

    // Parameterized Constructor
    public Manager(int employeeID, String department, double salary, String teamName) {
        super(employeeID, department, salary);
        this.teamName = teamName;
    }

    // Method to display manager details
    public void displayManagerDetails() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: Rs." + getSalary());
        System.out.println("Team Name: " + teamName);
    }

    // Method to update department
    public void updateDepartment(String newDepartment) {
        this.department = newDepartment;
    }
}

public class EmployeeRecords {
    public static void main(String[] args) {
        System.out.println("Employee Details:");
        Employee employee = new Employee(101, "Sales", 50000.0);
        employee.displayEmployeeDetails();

        employee.setSalary(55000.0);
        System.out.println("Updated Salary: Rs." + employee.getSalary());

        System.out.println("Manager Details:");
        Manager manager = new Manager(201, "Marketing", 70000.0, "Digital Marketing Team");
        manager.displayManagerDetails();

        System.out.println("Updated Manager Details:");
        manager.updateDepartment("Advertising");
        manager.displayManagerDetails();

        System.out.println("Employee ID of employee: " + employee.employeeID);
        System.out.println("Employee ID of manager: " + manager.employeeID);
    }
}

/*
Output:
    Employee Details:
    Employee ID: 101
    Department: Sales
    Salary: Rs.50000.0
    Updated Salary: Rs.55000.0
    Manager Details:
    Employee ID: 201
    Department: Marketing
    Salary: Rs.70000.0
    Team Name: Digital Marketing Team
    Updated Manager Details:
    Employee ID: 201
    Department: Advertising
    Salary: Rs.70000.0
    Team Name: Digital Marketing Team
    Employee ID of employee: 101
    Employee ID of manager: 201
 */