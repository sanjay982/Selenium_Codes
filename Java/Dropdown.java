package src.test.java.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import java.util.concurrent.TimeUnit;
import java.util.List;

public class Dropdown {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.flipkart.com");
        driver.findElement(By.cssSelector("body > div._2Sn47c > div > div > button")).click();
        WebElement target = driver
                .findElement(By.xpath("//div[text()='Fashion']"));

        // // WebElement target2 = driver.findElement(By.cssSelector(
        // "#container > div > div._331-kn._2tvxW > div > div > div:nth-child(3) > a >
        // div._1psGvi.SLyWEo > div.ZEl_b_._3joddx._3K5Rma._23xUYh._3pAV4E > div._3_Fivj
        // > div > div > div:nth-child(2) > a:nth-child(3)"));

        Actions A = new Actions(driver);
        A.moveToElement(target).perform();
        // List<WebElement> p = driver.findElements(By.linkText("Men's Top Wear"));
        List<WebElement> p = driver.findElements(By.xpath("//div[@class='_3XS_gI']"));

        for (WebElement i : p) {
            System.out.println(i.getText());
            driver.quit();
        }
        // WebElement target1 = driver.findElement(By.linkText("Men's Top Wear"));
        // A.moveToElement(target1).click().perform();

    }
}//// div[@class='_3XS_gI']