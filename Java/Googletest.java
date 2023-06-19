package src.test.java.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;




public class Googletest {
	public static void main(String[] args) {
		//	 System.setProperty("Mavenproject/src/main/resources/Driver/chromedriver.exe");	
		System.setProperty("webdriver.chrome.driver","C:/Users/ADMIN/OneDrive/Desktop/Deks/webdrivr/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("jurassic park");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		driver.getPageSource().contains("Jurassic Park (film)");
		driver.quit();
	}
}


