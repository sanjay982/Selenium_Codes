package src.test.java.Selenium;

/* The ArrayList class implements the List interface. It uses a dynamic array
 to store the duplicate element of different data types. The ArrayList class 
 maintains the insertion order and is non-synchronized. 
 The elements stored in the ArrayList class can be randomly accessed. Consider the following example.*/

/* */

import java.util.*;

public class TestJavaCollection1 {

    public static void main(String args[]) {
        ArrayList<String> list = new ArrayList<String>();// Creating arraylist
        list.add("Ravi");// Adding object in earliest
        list.add("Vijay");
        list.add("Ravi");
        list.add("Ajay");
        // Traversing list through Iterator
        Iterator<String> itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());

        }
    }
}
