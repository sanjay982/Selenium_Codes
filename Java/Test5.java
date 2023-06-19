package src.test.java.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test5 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com");
        WebElement schbox = driver.findElement(By.id("twotabsearchtextbox"));
        schbox.click();
        schbox.sendKeys("iphone");
        driver.findElement(By.id("nav-search-submit-button")).click();

    }
}
