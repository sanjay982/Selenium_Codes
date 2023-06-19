package src.test.java.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

    public static void main(String[] Args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");
        driver.manage().window().fullscreen();
        WebElement email = driver.findElement(By.id("email"));
        email.click();
        email.sendKeys("Test@gmail.com");
        WebElement pass = driver.findElement(By.id("pass"));
        pass.click();
        pass.sendKeys("xxxxxx");
        driver.findElement(By.name("login")).click();

    }
}

/*
 * System.setProperty("webdriver.chrome.driver",
 * "C:\\Users\\ADMIN\\OneDrive\\Desktop\\Deks\\webdrivr\\chromedriver.exe");
 */