package src.test.java.Selenium;
import java.util.Scanner; // Import the Scanner class

class controlstatement {

    public static void main(String[] args) {

        try (Scanner dd = new Scanner(System.in)) {
            System.out.println("Enter marks obtained in Maths.");
            int Maths = dd.nextInt();
            System.out.println("Enter marks obtained Physics.");
            int Physics = dd.nextInt();
            System.out.println("Enter marks obtained in Computer.");
            int Computer = dd.nextInt();
            System.out.println("Enter marks obtained in English.");
            int English = dd.nextInt();
            System.out.println("Enter marks obtained in chemistry.");
            int chemistry = dd.nextInt();

            if (Maths > 200) {
                System.out.println("Enterd marks is Invalid - Pls enter correct marks");
            } else {

                System.out.println("You enterd maths marks:" + Maths);

            }

            if (Physics > 200) {
                System.out.println("Enterd marks is Invalid - Pls enter correct marks");
            } else {

                System.out.println("You entered physics marks:" + Physics);

            }

            if (Computer > 200) {
                System.out.println("Enterd marks is Invalid - Pls enter correct marks");
            } else {

                System.out.println("You entered computer marks:" + Computer);

            }

            if (English > 200) {
                System.out.println("Enterd marks is Invalid - Pls enter correct marks");
            } else {

                System.out.println("You entered english:" + English);

            }

            if (chemistry > 200) {
                System.out.println("Enterd marks is Invalid - Pls enter correct marks");
            } else {

                System.out.println("You enterd chemistry:" + chemistry);

            }

            int Marks = (Maths + chemistry + English + Physics + Computer);
            int Totalmarks = Marks;
            System.out.println("Total marks obtain in Examination:" + Totalmarks);
            if (Marks >= 450 && Marks <= 650) {

                System.out.println("You are selected for BE Course");

            } else if (Totalmarks >= 850) {
                System.out.println("You are Selected for MBBS");

            }

            else {
                System.out.println("Best of luck for your upcoming Exam");
            }

        }
    }
}
