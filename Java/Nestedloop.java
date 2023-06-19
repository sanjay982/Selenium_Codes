package src.test.java.Selenium;
/*Java Nested for Loop
If we have a for loop inside the another loop, it is known as nested for loop. The inner loop executes completely whenever outer loop executes.

Example:

NestedForExample.java*/

public class Nestedloop {
    public static void main(String[] args) {
        // loop of i
        for (int i = 1; i <= 3; i++) {
            // loop of j
            for (int j = 1; j <= 3; j++) {
                System.out.println(i + " " + j);
            } // end of i
        } // end of j
    }
}

/*
 * out put =>
 * 1 1
 * 1 2
 * 1 3
 * 2 1
 * 2 2
 * 2 3
 * 3 1
 * 3 2
 * 3 3
 */