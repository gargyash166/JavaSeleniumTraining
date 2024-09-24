package Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class first {

	public static void main(String[] args) throws InterruptedException {
    ChromeDriver driver = new ChromeDriver();
    
   driver.manage().window().maximize();
   
   driver.get("https://automationexercise.com/");
   driver.findElement(By.xpath("//a[contains(text(),' Signup / Login')]")).click();
   
   WebElement namefld =  driver.findElement(By.name("name"));
   namefld.sendKeys("Yash G ");
   
   WebElement emlfld = driver.findElement(By.xpath("(//input[@name='email'])[2]"));
   emlfld.sendKeys("gargy8@gmail.com");
   	
   driver.findElement(By.xpath("//button[contains(text(),'Signup')]")).click();
   
   
   driver.findElement(By.xpath("//input[@type='radio' and @value='Mr']")).click();
   
   WebElement psswrdfld =  driver.findElement(By.name("password"));
   psswrdfld.sendKeys("Yash@@1122");
   
   driver.findElement(By.name("first_name")).sendKeys("Yash");
   driver.findElement(By.name("last_name")).sendKeys("G");
   driver.findElement(By.xpath("//select[@id='days']")).sendKeys("16");
   driver.findElement(By.xpath("//select[@id='months']")).sendKeys("June");
   driver.findElement(By.xpath("//select[@id='years']")).sendKeys("2000");
   driver.findElement(By.name("company")).sendKeys("N/");
   
   driver.findElement(By.name("address1")).sendKeys("Shikarpur");
   driver.findElement(By.name("address2")).sendKeys("BSR");
   driver.findElement(By.name("state")).sendKeys("Uttar Pardesh");
   Thread.sleep(1000);
   driver.findElement(By.name("city")).sendKeys("BSR");
   driver.findElement(By.name("zipcode")).sendKeys("203395");
   driver.findElement(By.name("mobile_number")).sendKeys("8266940988");
   driver.findElement(By.xpath("//button[contains(text(),'Create Account')]")).click();
   driver.findElement(By.xpath("//a[contains(text(),'Continue')]")).click();
   driver.findElement(By.xpath("//a[contains(text(),' Delete Account')]")).click();
   driver.findElement(By.xpath("//a[contains(text(),'Continue')]")).click();

   
		   
   


   
   
	}
}
