package src.test.java.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
import java.util.List;

public class Table1 {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        String u = "https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html";
        driver.get(u);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        // identify table
        WebElement t = driver.findElement(By.xpath("//table[@id='customers']"));
        // count rows with size() method
        List<WebElement> rws = t.findElements(By.tagName("tr"));
        int rws_cnt = rws.size();
        // iterate rows of table
        for (int i = 0; i < rws_cnt; i++) {
            // count columns with size() method
            List<WebElement> cols = rws.get(i).findElements(By.tagName("td"));
            int cols_cnt = cols.size();
            // iterate cols of table
            for (int j = 0; j < cols_cnt; j++) {
                // get cell text with getText()
                String c = cols.get(j).getText();
                System.out.println("The cell value is: " + c);
            }
        }
        driver.quit();
    }
}