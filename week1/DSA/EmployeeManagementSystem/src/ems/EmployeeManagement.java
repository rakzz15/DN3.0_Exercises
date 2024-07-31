package ems;

import java.util.ArrayList;
import java.util.List;

public class EmployeeManagement {
    private List<Employee> employees;

    public EmployeeManagement() {
        employees = new ArrayList<>();
    }

    // Adding a new employee
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    // Searching for an employee by employeeId
    public Employee searchEmployee(int employeeId) {
        for (Employee employee : employees) {
            if (employee.getEmployeeId() == employeeId) {
                return employee;
            }
        }
        return null; // Not found
    }

    // Traversing and displaying all employees
    public void traverseEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    // Delete an employee by employeeId
    public boolean deleteEmployee(int employeeId) {
        for (Employee employee : employees) {
            if (employee.getEmployeeId() == employeeId) {
                employees.remove(employee);
                return true; // Deleted successfully
            }
        }
        return false; // Not found
    }

    public static void main(String[] args) {
        EmployeeManagement management = new EmployeeManagement();

        // Adding employees
        management.addEmployee(new Employee(1, "Alice", "Developer", 50000));
        management.addEmployee(new Employee(2, "Bob", "Manager", 75000));
        management.addEmployee(new Employee(3, "Charlie", "Analyst", 60000));

        // Traversing employees
        System.out.println("All Employees:");
        management.traverseEmployees();

        // Searching for an employee
        int searchId = 2;
        Employee foundEmployee = management.searchEmployee(searchId);
        if (foundEmployee != null) {
            System.out.println("\nFound Employee with ID " + searchId + ":");
            System.out.println(foundEmployee);
        } else {
            System.out.println("\nEmployee with ID " + searchId + " not found.");
        }

        // Deleting an employee
        int deleteId = 1;
        boolean deleted = management.deleteEmployee(deleteId);
        if (deleted) {
            System.out.println("\nDeleted Employee with ID " + deleteId);
        } else {
            System.out.println("\nEmployee with ID " + deleteId + " not found.");
        }

        // Traversing employees after deletion
        System.out.println("\nAll Employees After Deletion:");
        management.traverseEmployees();
    }
}
