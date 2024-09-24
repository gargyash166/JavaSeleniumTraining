package Project;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class tc12 {
	public static void main(String[] args) throws InterruptedException {
		 ChromeDriver driver = new ChromeDriver();
		    
		   driver.manage().window().maximize();
		   
		   driver.get("https://automationexercise.com/");

		   driver.findElement(By.xpath("//a[contains(text(),' Products')]")).click();
		   Thread.sleep(1000);
		   driver.findElement(By.xpath("(//a[@class=\"btn btn-default add-to-cart\"])[1]")).click();
		   Thread.sleep(1000);
		   driver.findElement(By.xpath("//button[contains(text(),'Continue Shopping')]")).click();
		   Thread.sleep(500);

		   driver.findElement(By.xpath("(//a[@class=\"btn btn-default add-to-cart\"])[3]")).click();
		   Thread.sleep(500);

driver.findElement(By.xpath("(//a[@href=\"/view_cart\"])[2]")).click();

	
	}}