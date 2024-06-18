public class Main {
    public static void main(String[] args) {
        try {
            Admin admin = new Admin("Adam", "Kozioł");

            Employee e1 = new Employee("Alicja", "Mazur");
            Employee e2 = new Employee("Karol", "Piotrkowski");

            Client c1 = new Client("Wojciech", "Świerk");
            Client c2 = new Client("Alekskandra", "Kociołek");
            Client c3 = new Client("Julia", "Wiśniewska");

            BankAccount account1 = new BankAccount();
            BankAccount account2 = new BankAccount();
            BankAccount account3 = new BankAccount();
            BankAccount account4 = new BankAccount();

            account1.deposit(120);
            System.out.println("Account1 Balance: " + account1.checkBalance());
            account2.deposit(200);
            account3.deposit(70);
            account4.deposit(55);

            account1.transfer(30, account2);
            account4.transfer(20, account1);
            account2.transfer(150, account3);
            account3.transfer(25, account1);
            account2.transfer(15, account4);
            account1.transfer(60, account2);
            account1.transfer(10, account3);
            account2.transfer(35, account4);
            account3.transfer(15, account2);
            account4.transfer(10, account1);

            System.out.println("Account1 Balance: " + account1.checkBalance());
            System.out.println("Account2 Balance: " + account2.checkBalance());
            System.out.println("Account3 Balance: " + account3.checkBalance());
            System.out.println("Account4 Balance: " + account4.checkBalance());

        } catch (AccountOperationException e) {
            System.out.println(e.getMessage());
        }
    }
}