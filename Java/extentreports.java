package src.test.java.Selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class extentreports {
    public static void main(String[] args) {

        ExtentHtmlReporter htmlrporter = new ExtentHtmlReporter(
                "C:/Users/ADMIN/OneDrive/Desktop/Deks/maven3/demo/MvnReport.html");
        ExtentReports extent = new ExtentReports();
        extent.attachReporter(htmlrporter);
        ExtentTest Test1 = extent.createTest("Amazon", "Logintest");
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        Test1.log(Status.INFO, "Starting Test Case");
        driver.get("https://www.amazon.in/");
        Test1.pass("This test executed successfully");
        org.openqa.selenium.WebElement signin = driver.findElement(By.xpath(
                "//header/div[@id='navbar']/div[@id='nav-belt']/div[3]/div[1]/a[2]/span[1]"));
        signin.click();
        org.openqa.selenium.WebElement email = driver.findElement(By.id("ap_email"));
        email.click();
        email.sendKeys("sanju13july@gmail.com");
        Test1.pass("Successfully Entered the email id");

        driver.quit();
        extent.flush();

    }

    {

    }
}
