package src.test.java.Test;
import java.util.Scanner;
public class Calculatorinternet {

			private static Scanner s;

		// TODO Auto-generated method stub
		public static void main(String args[])
		{
			// declare here
			float a,b,res;
			char choice;
			s = new Scanner(System.in);
			
			do
			{
				// prepare menu for the user to see multiple operations.
				System.out.println("\n\nMain Menu : \n1.Addition\n2.Subtraction\n3.Division\n4.Multiplication\n5.Exit\n");
				
				// enter the choice
				System.out.print("Enter your choice : ");
				
				// read the input choice value.
				choice=s.next().charAt(0);
				
				// this loop will calculate different the operations value at different dofferent values.
				switch(choice)
				{ 
				    case '1':System.out.print("Enter two numbers : ");
				    a=s.nextFloat();
				    b=s.nextFloat();	
				    res=a+b;
				    System.out.print("Result : " +res);
				    break;
				     
				     case '2':System.out.print("Enter two numbers : ");
					 a=s.nextFloat();
					 b=s.nextFloat();	
					 res=a-b;
					 System.out.print("Result : " +res);
					 break;
					    
				     case '3':System.out.print("Enter two numbers : ");
					 a=s.nextFloat();
					 b=s.nextFloat();	
					 res=a/b;
					 System.out.print("Result : " +res);
					 break;
					    
				     case '4':System.out.print("Enter two numbers : ");
					 a=s.nextFloat();
					 b=s.nextFloat();	
					 res=a*b;
					 System.out.print("Result : " +res);
					 break;
					   
				     case '5':
					 System.exit(0);
					 break;
					 default : System.out.print("Wrong Choice.....\n");
					 break;
				}
		    }
			// loop works till the number 5 not selected.
		  while(choice!=5);
		}
	
	}


