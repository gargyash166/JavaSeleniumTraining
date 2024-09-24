package Project;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class tc9 {

	public static void main(String[] args) throws InterruptedException {

		 ChromeDriver driver = new ChromeDriver();
		    
		   driver.manage().window().maximize();
		   
		   driver.get("https://automationexercise.com/");

		   driver.findElement(By.xpath("//a[contains(text(),' Products')]")).click();

		   driver.findElement(By.xpath("//input[@class=\"form-control input-lg\"]")).sendKeys("Shirt");
		   Thread.sleep(1000);
		
		   driver.findElement(By.xpath("//button[@class=\"btn btn-default btn-lg\"]")).click();

	}

}
