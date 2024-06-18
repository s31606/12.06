import java.util.List;

public class Admin extends Employee {
    private List<Employee> employees;

    protected Admin(String fName, String lName) {
        super(fName, lName);
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void removeEmployee(Employee employee) {
        employees.remove(employee);
    }

    public List<Employee> getEmployees() {
        return employees;
    }
}
