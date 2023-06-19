package src.test.java.Selenium;

import java.util.Scanner;

public class multipleinputs {

    public static void main(String args[]) {

        try (Scanner dd = new Scanner(System.in)) {
            System.out.println("Enter number.");
            int a = dd.nextInt();
            System.out.println("Enter number.");
            int b = dd.nextInt();
            System.out.println("Enter number.");
            int c = dd.nextInt();
        }
    }
}
