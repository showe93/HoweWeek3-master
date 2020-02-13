package comp152;

import java.util.ArrayList;
import java.util.Scanner;

public class Bank {
    private ArrayList<BankAccount> allAccounts;
    private ArrayList<Customer> allCustomers;

    public Bank(){
        allCustomers = new ArrayList<Customer>();
        allAccounts = new ArrayList<BankAccount>();
    }


    private void printMenu(){
        System.out.println("What do you want to do next... penguin:");
        System.out.println("(Select the number of the option...(penguin))");
        System.out.println("[1] Add Penguin...I mean Customer");
        System.out.println("[2]Select Penguin...I mean Customer");
        System.out.println("[3] Add account for current Penguin...I mean Customer");
        System.out.println("[4] To Quit");
    }

    public void doBanking(){
        var inputReader = new Scanner(System.in);
        while(true){
            printMenu();
            var input = inputReader.nextInt();

        }
    }
}
