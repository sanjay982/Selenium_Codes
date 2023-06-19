package src.test.java.Selenium;
public class MethodAdd {
    public static void main(String[] args) {
        int a = 19;
        int b = 5;
        int c = add(a, b);
        System.out.println("The sum of two number is : " + c);

    }

    public static int add(int n1, int n2) {

        int s = n1 + n2;
        return s;

    }

}
/*
 * public static void main (Static[] args)
 * int a= 15;
 * int b= 5;
 * c= add(a,b);
 * system.out.println("The sum of two number is :" +c)
 * 
 * public static int add(int n1, int n2);
 * int s= n1+n2;
 * 
 */