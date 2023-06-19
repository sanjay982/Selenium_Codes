package src.test.java.Selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import java.util.List;

public class DragDrop {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");

        WebElement from = driver.findElement(By.xpath("//div[@id='box3']"));
        WebElement to = driver.findElement(By.xpath("//div[@id='box106']"));
        Actions builder = new Actions(driver);
        builder.dragAndDrop(from, to).perform();
        Thread.sleep(2000);
        List<WebElement> options = driver.findElements(By.xpath("//div[@id='capitals']"));
        for (WebElement items : options) {
            System.out.println(items.getText());
            System.out.println("****************************************");
        }

        // Performing the drag and drop action
        driver.close();

    }
}
