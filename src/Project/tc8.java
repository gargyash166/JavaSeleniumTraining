package Project;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class tc8 {
	public static void main(String[] args) throws InterruptedException {
		 ChromeDriver driver = new ChromeDriver();
		    
		   driver.manage().window().maximize();
		   
		   driver.get("https://automationexercise.com/");

		   driver.findElement(By.xpath("//a[contains(text(),' Products')]")).click();
		   Thread.sleep(2000);
		   driver.findElement(By.xpath("//a[@href=\"/product_details/1\"]")).sendKeys(Keys.ENTER);


	
	}
	}
