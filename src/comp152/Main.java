package comp152;

public class Main {
    public static void main(String[] args){
        var myAccount = new BankAccount();
        var yourAccount = new BankAccount(10000, .05f);
        myAccount.deposit(1000);
        myAccount.addInterest();
        yourAccount.addInterest();
        System.out.println("My account with account number "+ myAccount.getAccountID()+" has " + myAccount.checkBalance());
        System.out.println("Your account with account number "+yourAccount.getAccountID()+" has " + yourAccount.checkBalance());
        var succeeded = myAccount.withdraw(2000);
        if(succeeded)
            System.out.println("Manages to withdraw 2000");
        else
            System.out.println("Tough Luck buddy, you only have $" + myAccount.checkBalance()+"...dam penguins");
    }
}
