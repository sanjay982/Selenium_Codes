package src.test.java.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonTest {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        {
            driver.get("https://www.amazon.in");
            WebElement schbox = driver.findElement(By.id("twotabsearchtextbox"));
            schbox.click();
            schbox.sendKeys("Iphone");
            driver.findElement(By.id("nav-search-submit-button")).click();

        }

    }
}