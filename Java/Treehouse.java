package src.test.java.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Treehouse {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        System.out.println("Select Webelement for testing");
        driver.get("https://teamtreehouse.com/");
        driver.findElement(By.id("featurette-15")).click();
        driver.findElement(By.xpath(
                "//body/section[1]/div[2]/div[1]/section[1]/form[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/label[1]"))
                .click();
        WebElement signup = driver.findElement(By.id("account_signup_first_name"));
        WebElement lname = driver.findElement(By.id("account_signup_last_name"));
        WebElement email = driver.findElement(By.id("account_signup_email"));
        WebElement pass = driver.findElement(By.id("account_signup_password"));
        WebElement bill = driver.findElement(By.name("account_signup[billing_period]"));
        driver.findElement(By.id("submit-button")).click();
        // ccc
        signup.sendKeys("xxxxxxxxx");
        lname.sendKeys("xxxxxxxx");
        email.sendKeys("test@gmail.com");
        pass.sendKeys("xxxxxxx");

    }
}
