package src.test.java.Selenium;

import java.util.LinkedList;

// we do use hashmap becuase of accessing key and value.

public class Hshmap {

    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<String>();
        names.add("Ravi");
        names.add("Vijay");
        names.add("Ravi");
        names.add("Ajay");
        LinkedList<Integer> number = new LinkedList<Integer>();
        number.add(302);
        number.add(303);
        number.add(304);
        number.add(305);

        for (int i = 0; i < names.size(); i++) {

            System.out.println("My name is " + names.get(i) + "and my Total marks is " + number.get(i));
        }

    }
}
