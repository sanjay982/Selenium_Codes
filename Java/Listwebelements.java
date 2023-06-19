package src.test.java.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class Listwebelements {
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");

        List<WebElement> options = driver.findElements(By.xpath("//div[@id='capitals']"));
        for (WebElement items : options) {
            System.out.println(items.getText());
            System.out.println("*********************************************************************");

        }
    }
}