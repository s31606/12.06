import java.util.ArrayList;

public class BankAccount implements AccountOperations {
    private double balance;
    private ArrayList<String> transactions = new ArrayList<>();

    public BankAccount() {
        this.balance = 0;
    }

    @Override
    public double checkBalance() {
        return balance;
    }

    @Override
    public void transfer(double amount, BankAccount targetAccount) throws AccountOperationException {
        if (amount <= 0) {
            throw new AccountOperationException("Kwota przelewu musi być większa od 0");
        }
        if (balance < amount) {
            throw new AccountOperationException("Na koncie nie ma wystarczającej ilości środków");
        }
        if (targetAccount == null) {
            throw new AccountOperationException("Konto docelowe jest niepoprawne");
        }

        balance -= amount;
        targetAccount.deposit(amount);
        transactions.add("Transferred " + amount + " to " + targetAccount);
        targetAccount.transactions.add("Received " + amount + " from " + this);
    }

    @Override
    public void deposit(double amount) throws AccountOperationException {
        if (amount <= 0) {
            throw new AccountOperationException("Kwota wpłaty musi być większa od 0");
        }

        balance += amount;
        transactions.add("Deposited " + amount);
    }
}