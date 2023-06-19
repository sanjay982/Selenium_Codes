package src.test.java.Selenium;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Hsmp4loop {

    public static void main(String[] args) {

        HashMap<String, Integer> names = new HashMap<String, Integer>();
        /*
         * Contains value based on key
         * contains only unique key
         * One null key and Multiple null values
         * Hasmap is nonsynchronized.
         * Hasmap maintains no order.
         */
        names.put("Amar", 0);
        names.put("Vijay", 350);
        names.put("Ravi", 230);
        names.put("Ajay", 983);

        for (String i : names.keySet()) {

            System.out.println("---------------------------");
            System.out.println("My name is " + i + " & my total marks is " + names.get(i));
        }

        LinkedHashMap<String, Integer> mark = new LinkedHashMap<String, Integer>();

        mark.put("Math", 300);
        mark.put("History", 320);
        mark.put("English", 380);
        mark.put("Physics", 360);
        mark.put("Biology", 380);

        for (

        String G : mark.keySet()) {

            System.out.println("-----------------------------");
            System.out.println("Marks Scored in " + G + " is " + mark.get(G));

        }

    }
}
