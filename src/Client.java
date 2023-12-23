import java.util.ArrayList;
import java.util.List;
class Client {
    private String name;
    private String address;
    private List<Account> accounts;

    public Client(String name, String address) {
        this.name = name;
        this.address = address;
        this.accounts = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public void printAccountHistory() {
        for (Account account : accounts) {
            System.out.println("Номер акаунта: " + account.getAccountNumber());
            System.out.println("Баланс: " + account.getBalance());
            System.out.println("Операції:");
            for (Operation operation : account.getOperations()) {
                System.out.println(operation);
            }
            System.out.println("----------------------");
        }
    }
}