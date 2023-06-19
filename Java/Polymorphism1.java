package src.test.java.Selenium;

public class Polymorphism1 {
    public void add() {
        int a = 80;
        int b = 30;
        int c = a + b;
        System.out.println(c);

    }

    // Overload method
    public int sub(int a, int b) {

        int E = b - a;
        System.out.println(E);
        return E;

    }

    public void add2(int a, int b, int c) {
        int D = a + b + c;
        System.out.println(D);

    }

    public static void main(String[] args) {
        Polymorphism1 p = new Polymorphism1();
        p.add();
        p.sub(13, 5);
        p.add2(12, 34, 23);
    }

}
