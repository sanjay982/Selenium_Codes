package src.test.java.Selenium;

public class Officerules implements Rules {

    public void wearid() {
        System.out.println("Wear id durig the office working hrs");
    }

    public void breaks() {
        System.out.println("Break timing shouldn't extend more than 1hr");
    }

    public void workinghrs() {
        System.out.println("Working hrs must complete that is 8 hrs");
    }

    public void meetingtiming() {
        System.out.println("Meeting timing is 10 am every day");
    }

    public void offtimings() {
        System.out.println("Offtimings is 7 PM");

    }

}
