import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
public class EmployeeDAO {

    private Connection conn = DBConnection.getConnection();

    public void addEmployee(Employee employee) {

        String sql = "INSERT INTO employees (id, name, salary, department) VALUES (?, ?, ?, ?)";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setInt(1, employee.getId());
            ps.setString(2, employee.getName());
            ps.setDouble(3, employee.getSalary());
            ps.setString(4, employee.getDepartment());

            ps.executeUpdate();

            System.out.println("Employee added successfully");

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void updateSalary(int id, double newSalary){
        String sql = "UPDATE employees SET salary = ? WHERE id = ?";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setDouble(1, newSalary);
            ps.setInt(2, id);

            ps.executeUpdate();

            System.out.println("Salary updated successfully");

        } catch (Exception e){
            throw new RuntimeException(e);
        }
    }
            public void deleteEmployee ( int id){

                String sql = "DELETE FROM employees WHERE id = ?";

                try {
                    PreparedStatement ps = conn.prepareStatement(sql);

                    ps.setInt(1, id);

                    ps.executeUpdate();

                    System.out.println("Employee deleted successfully");

                } catch (Exception e){
                    throw new RuntimeException(e);
                }
            }
                public void viewEmployeesByDepartment(String department){

                    String sql = "SELECT * FROM employees WHERE department = ?";

                    try {
                        PreparedStatement ps = conn.prepareStatement(sql);

                        ps.setString(1, department);

                        ResultSet rs = ps.executeQuery();

                        while (rs.next()){
                            System.out.println(
                                    rs.getInt("id") + " " +
                                            rs.getString("name") + " " +
                                            rs.getDouble("salary") + " " +
                                            rs.getString("department")
                            );
                        }

                    } catch (Exception e){
                        throw new RuntimeException(e);
                    }
                }
            }


