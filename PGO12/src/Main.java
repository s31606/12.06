public class Main {
    public static void main(String[] args) {
        try {
            BankAccount account1 = new BankAccount();
            BankAccount account2 = new BankAccount();

            account1.deposit(120);
            System.out.println("Account1 Balance: " + account1.checkBalance());

            account1.transfer(30, account2);
            System.out.println("Account1 Balance: " + account1.checkBalance());
            System.out.println("Account2 Balance: " + account2.checkBalance());

        } catch (AccountOperationException e) {
            System.out.println(e.getMessage());
        }
    }
}