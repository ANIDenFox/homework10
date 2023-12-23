import java.util.ArrayList;
import java.util.List;

class Account {
    private String accountNumber;
    private double balance;
    private List<Operation> operations;

    public Account(String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0;
        this.operations = new ArrayList<>();
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public List<Operation> getOperations() {
        return operations;
    }

    public void deposit(double amount) {
        balance += amount;
        operations.add(new Operation("Депозит", amount));
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            operations.add(new Operation("Вилучення", amount));
        } else {
            System.out.println("Недостатньо коштів");
        }
    }

    public void transfer(Account recipient, double amount) {
        if (amount <= balance) {
            balance -= amount;
            recipient.deposit(amount);
            operations.add(new Operation("Передача в " + recipient.getAccountNumber(), amount));
        } else {
            System.out.println("Недостатньо коштів");
        }
    }
}