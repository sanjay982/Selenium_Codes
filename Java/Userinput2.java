package src.test.java.Test;
import java.util.Scanner;
public class Userinput2 {


	private static Scanner S;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declaring variables
		
		float a, b, result;
		char choice;
		S = new Scanner(System.in);
		do
		{
			System.out.println("\n\nMain Menu : \n1.Addition\n2.Subtraction\n3.Division\n4.Multiplication\n5.Exit\n");
			System.out.println("Enter your choice:");
			//Reading user input
			choice= S.next().charAt(0);
			
			switch (choice)
			{
			case '1':System.out.println("Your choice is addition");
			System.out.println("Enter two numbers :");
			a=S.nextFloat();
			b=S.nextFloat();
			result=a+b;
			System.out.println("result=" +result);
			break;
			
			case '2':System.out.println("Your choice is Subtraction");
			System.out.println("Enter two numbers :");
			a=S.nextFloat();
			b=S.nextFloat();
			result=a-b;
			System.out.println("result=" +result);
			break;
			
			case '3':System.out.println("Your choice is Division");
			System.out.println("Enter two numbers :");
			a=S.nextFloat();
			b=S.nextFloat();
			result=a/b;
			System.out.println("result=" +result);
			break;
			
			case '4':System.out.println("Your choice is multiplication");
			System.out.println("Enter two numbers :");
			a=S.nextFloat();
			b=S.nextFloat();
			result=a*b;
			System.out.println("result=" +result);
			break;
			
			case '5':
			System.exit(0);
			default : System.out.print("Wrong Choice.....\n");
			break;
			
			}
			
		
		}
		while(choice!=5);	
		
	}
	
}

	
	


