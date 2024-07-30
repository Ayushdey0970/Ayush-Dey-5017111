public class q4_EmployeeManagementSystem {
    private q4_Employee[] employees;
    private int size;
    private static final int INITIAL_CAPACITY = 10;

    public q4_EmployeeManagementSystem() {
        employees = new q4_Employee[INITIAL_CAPACITY];
        size = 0;
    }

    // Add an employee
    public void addEmployee(q4_Employee employee) {
        if (size == employees.length) {
            expandArray();
        }
        employees[size++] = employee;
    }

    // Search for an employee by ID
    public q4_Employee searchEmployee(int employeeId) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getEmployeeId() == employeeId) {
                return employees[i];
            }
        }
        return null;
    }

    // Traverse and print all employees
    public void traverseEmployees() {
        for (int i = 0; i < size; i++) {
            System.out.println(employees[i]);
        }
    }

    // Delete an employee by ID
    public boolean deleteEmployee(int employeeId) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getEmployeeId() == employeeId) {
                // Shift elements to fill the gap
                for (int j = i; j < size - 1; j++) {
                    employees[j] = employees[j + 1];
                }
                employees[size - 1] = null;
                size--;
                return true;
            }
        }
        return false;
    }

    // Expand the array when it's full
    private void expandArray() {
        q4_Employee[] newEmployees = new q4_Employee[employees.length * 2];
        System.arraycopy(employees, 0, newEmployees, 0, employees.length);
        employees = newEmployees;
    }

    // Get the current number of employees
    public int getSize() {
        return size;
    }
}