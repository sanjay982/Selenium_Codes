package src.test.java.Selenium;

/*In Java, a constructor is just like a method but without return type. It can also be overloaded like Java methods.

Constructor overloading in Java is a technique of having more than one constructor with different parameter lists. 
They are arranged in a way that each constructor performs a different task. 
They are differentiated by the compiler by the number of parameters in the list and their types.
*/

public class Constructovrlding {

    int id;
    String name;
    int age;

    Constructovrlding(int i, String n) {
        id = i;
        name = n;
    }

    Constructovrlding(int i, String n, int a) {
        id = i;
        name = n;
        age = a;

    }

    void display() {
        System.out.println(id + " " + name + " " + age);
    }

    public static void main(String arg[]) {
        Constructovrlding obj1 = new Constructovrlding(32, "suresh", 34);
        Constructovrlding obj2 = new Constructovrlding(23, "Ramesh", 25);

        obj1.display();
        obj2.display();
    }
}
