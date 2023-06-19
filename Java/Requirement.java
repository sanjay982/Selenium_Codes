package src.test.java.Selenium;

import java.util.Scanner;

public class Requirement {
    int bal = 1000;

    public int debit() {
        System.out.println("enter amount that needs to be debited");
        Scanner s = new Scanner(System.in);
        int with = s.nextInt();
        try {
            if (with > bal) {

                throw new InsufficientException(with - bal); // created InsufficientException
            }

        } catch (InsufficientException e) {

            System.out.println(e);

        }
        return with - bal;
    }
}