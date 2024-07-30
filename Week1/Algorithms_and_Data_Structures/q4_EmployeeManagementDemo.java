public class q4_EmployeeManagementDemo {
    public static void main(String[] args) {
        q4_EmployeeManagementSystem ems = new q4_EmployeeManagementSystem();

        // Adding employees
        ems.addEmployee(new q4_Employee(1, "John Doe", "Developer", 75000.0));
        ems.addEmployee(new q4_Employee(2, "Jane Smith", "Manager", 85000.0));
        ems.addEmployee(new q4_Employee(3, "Bob Johnson", "Designer", 70000.0));

        System.out.println("Employees after adding:");
        ems.traverseEmployees();

        // Searching for an employee
        int searchId = 2;
        q4_Employee foundEmployee = ems.searchEmployee(searchId);
        if (foundEmployee != null) {
            System.out.println("\nFound employee with ID " + searchId + ": " + foundEmployee);
        } else {
            System.out.println("\nEmployee with ID " + searchId + " not found.");
        }

        // Deleting an employee
        int deleteId = 1;
        boolean deleted = ems.deleteEmployee(deleteId);
        if (deleted) {
            System.out.println("\nEmployee with ID " + deleteId + " deleted successfully.");
        } else {
            System.out.println("\nEmployee with ID " + deleteId + " not found for deletion.");
        }

        System.out.println("\nEmployees after deletion:");
        ems.traverseEmployees();

        // Adding more employees to demonstrate array expansion
        for (int i = 4; i <= 12; i++) {
            ems.addEmployee(new q4_Employee(i, "Employee " + i, "Role " + i, 50000.0 + i * 1000));
        }

        System.out.println("\nEmployees after adding more (demonstrating array expansion):");
        ems.traverseEmployees();

        System.out.println("\nTotal number of employees: " + ems.getSize());
    }
}