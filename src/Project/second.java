package Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class second {

	public static void main(String[] args) {
		    ChromeDriver driver = new ChromeDriver();
		    
		   driver.manage().window().maximize();
		   
		   driver.get("https://automationexercise.com/");
		   driver.findElement(By.xpath("//a[contains(text(),' Signup / Login')]")).click();
		   WebElement emlfld = driver.findElement(By.xpath("(//input[@name='email'])[1]"));
		   emlfld.sendKeys("gargy8@gmail.com");
		   WebElement psswrdfld =  driver.findElement(By.name("password"));
		   psswrdfld.sendKeys("Yash@@1122");
		   driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
		   	
	}

}
