package src.test.java.Selenium;
public class Constructparam {

    int id;
    String Name;
    // creating parameterize Constructor

    Constructparam(int i, String n) {

        id = i;
        Name = n;

    }

    void display() {
        System.out.println(id + "  " + Name);
    }

    public static void main(String args[]) {

        Constructparam obj1 = new Constructparam(111, "Ramesh");
        Constructparam obj2 = new Constructparam(123, "Suresh");
        obj1.display();
        obj2.display();
    }

}
