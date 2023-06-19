package src.test.java.Selenium;

public class Construct {
    /*
     * A constructor is called "Default Constructor"
     * when it doesn't have any parameter.
     * 
     * In Java, a constructor is a block of codes similar to the method.
     * It is called when an instance of the class is created. At the time of calling
     * constructor,
     * memory for the object is allocated in the memory.
     */
    Construct() {
        System.out.println("Constructor Created");
    }

    // main method
    public static void main(String[] args) {
        Construct obj = new Construct();

    }

}
