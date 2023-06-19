package src.test.java.Selenium;

public class Encapsulation4ICIC {

    public void details() {

        Encapsulation3 icici = new Encapsulation3();
        icici.setAadharnum("83249323");
        icici.setPannum("1h1h1g2");
        icici.setAccountnum("1237473873");
        icici.setLoandetails("This account holder already have a Home loan");

        System.out.println(icici.getAadharnum());
        System.out.println(icici.getPannum());
        System.out.println(icici.getAccountnum());
        System.out.println(icici.getLoandetails());

    }

}
