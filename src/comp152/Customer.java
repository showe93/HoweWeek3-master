package comp152;
import java.util.ArrayList;

public class Customer {
    private int customerID;
    private String name;
    private ArrayList<BankAccount> accounts;

    public Customer(String name, int taxID) {
        this.name = name;
        customerID=taxID;
        accounts = new ArrayList<BankAccount>();
    }

    public boolean openAccount(double initialDeposit) {
        var newAccount = new BankAccount(initialDeposit, 0.04f);
        var success = accounts.add(newAccount);
        return success;
    }

    public BankAccount closeAccount(int accountID) {
        BankAccount accountToClose = null;
        for (var account: accounts) {
            if (account.getAccountID() == accountID) {
                accountToClose = account;
            }
        }
        accounts.remove(accountToClose);
        return accountToClose;
    }
    public String getName(){
        return name;
    }
    public int getID(){
        return customerID;
    }
}


