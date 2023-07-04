public class Checkout {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new FirefoxDriver();
	driver.get("https://www.saucedemo.com/v1/inventory.html");
	driver.findElement(By.xpath("//div[@class='inventory_list']//div[1]//div[3]//button[1]")).click();
	driver.findElement(By.xpath("//a[@class='shopping_cart_link fa-layers fa-fw']")).click();
	WebElement p = driver.findElement(By.xpath("//div[@class='cart_item_label']"));
	System.out.println("Product check validation: = " +p.getText());
	driver.findElement(By.xpath("//a[@class='btn_action checkout_button']")).click();
	driver.findElement(By.id("first-name")).sendKeys("Apna");
	driver.findElement(By.id("last-name")).sendKeys("Coding");
	driver.findElement(By.id("postal-code")).sendKeys("456321");
	driver.findElement(By.xpath("//input[@class='btn_primary cart_button']")).click();
	WebElement u= driver.findElement(By.xpath("//div[@class='summary_info']"));
	System.out.println("Checkout Summary info:=" + u.getText());
	driver.findElement(By.xpath("//a[@class='btn_action cart_button']")).click();
	System.out.println("Test case Executed Successfully");
	boolean i=driver.findElement(By.xpath("//img[@class='pony_express']")).isDisplayed();
	System.out.println("Checkout validation executed successfuly: "+i);
	Thread.sleep(1000);
	driver.quit();
	}
}
