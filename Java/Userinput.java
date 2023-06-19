package src.test.java.Test;
import java.util.Scanner;  
public class Userinput {
		
private static Scanner myObj;

	// Import the Scanner class
	public static void main(String[] args) {

			myObj = new Scanner(System.in);
		    System.out.println("Enter username");

		    String userName = myObj.nextLine();  // Read user input
		    System.out.println("Username is: " + userName);  // Output user input
		  }
		

	}


