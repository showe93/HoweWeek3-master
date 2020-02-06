package comp152;

public class BankAccount {
    private double balance;
    private float interestRate;

    public double addInterest(){
        balance = (balance*interestRate) + balance;
        return balance;
    }
    public void deposit(double amount) {
        balance = balance + amount;
    }
    public boolean withdraw(double amount) {
        if(amount<=balance) {
            balance = balance - amount;
            return true;
        }
        return false;
    }
    public double checkBalance(){
        return balance;
    }

}

