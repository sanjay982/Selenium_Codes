package src.test.java.Selenium;

import java.util.ArrayList;

/*Final - final is fixed value it cannot be overridden 
 * Finally - finally is used in exception handling with try catch
 * Finalize - is used a garbage collector which will collect all the garbage
*/
public class CollectionvsCollections {

    private static char[] e;

	public static void main(String[] args) {
        ArrayList<Integer> marks = new ArrayList<Integer>();
        marks.add(100);
        marks.add(90);
        marks.add(30);
        marks.add(110);
        marks.add(70);

        for (int i = marks.size() - 1; i >= 0; i--) {
            System.out.println(marks.get(i));
        }

        Collection.reverse(marks);
        System.out.println("*******************");
        for (Integer e : marks);
        {

            System.out.println(e);
        }

    }
}
