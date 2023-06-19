package src.test.java.Selenium;

/*Java try block is used to enclose the code that might throw an exception.
 It must be used within the method.

If an exception occurs at the particular statement in the try block, 
the rest of the block code will not execute. 
So, 
it is recommended not to keep the code in try block that will not throw an exception.
Java try block must be followed by either catch or finally block. */

public class Trycth {
    public static void main(String[] args) {
        try {
            int data = 50 / 0; // may throw exception
        }
        // handling the exception
        catch (ArithmeticException e) {
            System.out.println(e);
        }
        System.out.println("rest of the code");

        /* ...........Addition.................. */

        try {
            int a = 50;
            int b = 0;
            int c = (a / b);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }
        System.out.println("print rest of the code");

        /* .............Subtraction............. */

        int x = 0;
		try {
            int a = 7;
            int b = x;
            int sub = (a - b);

        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }
        System.out.println("print rest of the code");

        /* ...........Division.................. */

        try {
            int a = 7;
            int b = x;
            int sub = (a / b);

        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }
        System.out.println("print rest of the code");

    }
}
