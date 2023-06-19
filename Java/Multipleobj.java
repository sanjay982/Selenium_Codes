package src.test.java.Selenium;

public class Multipleobj {
    int lenght;
    int width;
    int breadth;

    void insert(int l, int w, int b) {
        lenght = l;
        width = w;
        breadth = b;
    }

    void calculatreArea() {
        System.out.println("Area of rectangle is: " + lenght * breadth);

    }

}
