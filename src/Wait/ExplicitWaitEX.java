package Wait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitEX {
	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https:/github.com/signup");
	
	WebElement  textbox = driver.findElement(By.id("email"));
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	
	wait.until(ExpectedConditions.visibilityOf(textbox));
	textbox.sendKeys("zigzag@gmail.com");
	
	
	// WebElement btn = 	driver.findElement(By.xpath("//button[contains,'Continue']"));
      WebElement btn = 	driver.findElement(By.xpath("(//button[@type='button'])[2]"));
	wait.until(ExpectedConditions.elementToBeClickable(btn));
	btn.click();
	
	
	
	


}}
