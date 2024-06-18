public class Client extends User {
    public static int counter = 0;
    private BankAccount account;
    private int clientId;

    protected Client(String fName, String lName) {
        super(fName, lName);
        this.account = new BankAccount();
        this.clientId = counter++;
    }

    public BankAccount getAccount() {
        return account;
    }

    public int getClientId() {
        return clientId;
    }
}
