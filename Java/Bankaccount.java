package src.test.java.Selenium;
public class Bankaccount {
    // Java Program to demonstrate the working of a banking-system
    // where we deposit and withdraw amount from our account.
    // Creating an Account class which has deposit() and withdraw() methods
    int acc_no;
    String name;
    float amount;

    // Method to initialize object

    void insert(int a, String n, int amt) {
        acc_no = a;
        name = n;
        amount = amt;
    }
    // Deposit Method

    void deposit(float amt) {
        amount = amount + amt;
        System.out.println(amt + "  Depositied");

    }

    // Withdrawl Method
    void Withdrawl(float amt) {

        if (amount < amt) {
            System.out.println("Insufficient Balance");
        } else {
            amount = amount - amt;
            System.out.println(amt + "Withdrawl");
        }
    }

    // method to check the balance of the account
    void checkBalance() {
        System.out.println("Balance is: " + amount);
    }

    // method to display the values of an object
    void display() {
        System.out.println(acc_no + " " + name + " " + amount);
    }
}
