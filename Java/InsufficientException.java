package src.test.java.Selenium;

public class InsufficientException extends Exception {
    int amt;

    public InsufficientException(int amount) {

        amount = amt;
        System.out.println("Enter Less Amount");
    }

}
