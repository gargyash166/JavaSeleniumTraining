package Project;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class tc7 {

	public static void main(String[] args) {
		 ChromeDriver driver = new ChromeDriver();
		    
		   driver.manage().window().maximize();
		   
		   driver.get("https://automationexercise.com/");
		   driver.findElement(By.xpath("//button[contains(text(),'Test Cases')]")).click();
		   
		  }
	}

}
