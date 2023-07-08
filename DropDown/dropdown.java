package Webapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DropDown2 {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new FirefoxDriver();
	driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
	WebElement T=driver.findElement(By.xpath("//*[@id='menu-item-7128']/a"));
	Actions A =new Actions(driver);
	A.moveToElement(T).perform();
	WebElement d = driver.findElement(By.xpath("//*[@id='menu-item-7128']/div/ul"));
	Thread.sleep(3000);
	System.out.println(d.getText());
	driver.quit();
}
}
