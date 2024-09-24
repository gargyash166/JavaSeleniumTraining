package Project;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class fifth {

	public static void main(String[] args) {
    ChromeDriver driver = new ChromeDriver();
    
   driver.manage().window().maximize();
   
   driver.get("https://automationexercise.com/");
   driver.findElement(By.xpath("//a[contains(text(),' Signup / Login')]")).click();
   
   WebElement namefld =  driver.findElement(By.name("name"));
   namefld.sendKeys("Yash G ");
   
   WebElement emlfld = driver.findElement(By.xpath("(//input[@name='email'])[2]"));
   emlfld.sendKeys("gargyash1888@gmail.com");
   	
   driver.findElement(By.xpath("//button[contains(text(),'Signup')]")).click();
	}

}
