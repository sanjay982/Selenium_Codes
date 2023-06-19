package src.test.java.Selenium;

public class Testaccont {
    public static void main(String[] args) {
        Bankaccount a1 = new Bankaccount();
        a1.insert(832345, "Ankit", 1000);
        a1.display();
        a1.checkBalance();
        a1.deposit(40000);
        a1.checkBalance();
        a1.Withdrawl(15000);
        a1.checkBalance();
    }
}
