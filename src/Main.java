public class Main {

    public static void main(String[] args) {

        EmployeeDAO service = new EmployeeDAO();

        // Create Employees
        Employee employee1 = new Employee(1, "Amira", 5000, "IT");
        Employee employee2 = new Employee(2, "Mustafa", 20000, "HR");

        // ==========================
        // INSERT OPERATIONS
        // ==========================
        // service.addEmployee(employee1);
        // service.addEmployee(employee2);

        // ==========================
        // UPDATE OPERATION
        // ==========================
        // service.updateSalary(2, 25000);

        // ==========================
        // DELETE OPERATION
        // ==========================
        // service.deleteEmployee(1);

        // ==========================
        // SELECT OPERATION
        // ==========================
        // service.viewEmployeesByDepartment("IT");
    }
}