public class Employee extends User {
    public static int counter = 0;
    private int employeeId;
    protected Employee(String fName, String lName) {
        super(fName, lName);
        this.employeeId = counter++;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public Client addClient(String firstName, String lastName) {
        return new Client(fName, lName);
    }
}
