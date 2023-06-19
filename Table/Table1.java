package src.test.java.Table;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public abstract class Table1 {

	public static void main(String[] args) {
		
			    ChromeOptions options = new ChromeOptions();
			    options.addArguments("--remote-allow-origins=*");
			    WebDriver driver = new ChromeDriver(options);

			    driver.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
			    
			    WebElement table = driver.findElement(By.xpath("//table[@id='customers']"));

			    List<WebElement> listRows = table.findElements(By.tagName("tr"));
			    List<WebElement> listHeaders = listRows.get(0).findElements(By.tagName("th"));

			    for(int header=0; header<listHeaders.size();header++){
			        System.out.println(listHeaders.get(header).getText());
			        for(int row=1; row<listRows.size(); row++){
			            System.out.println(listRows.get(row).findElements(By.xpath("td")).get(header).getText());
			        }
			        System.out.println("\n");
			    }

			    driver.quit();
			}

	}


