package POPUP;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class alertpopup {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new EdgeDriver();
	
	 driver.manage().window().maximize();
	 
	 driver.get("https://demo.automationtesting.in/Alerts.html");
	
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("(//button[contains(text(),'click the button to d')])[1]")).click();
		Alert al = driver.switchTo().alert();
		Thread.sleep(2000);
		al.accept();
		
		driver.findElement(By.linkText("Alert with OK & Cancel")).click();
	
		driver.findElement(By.xpath("(//button[contains(text(),'click the button to display a conf')])")).click();
		Alert al2 = driver.switchTo().alert();

		Thread.sleep(2000);
		al2.accept();
		
		driver.findElement(By.linkText("Alert with Textbox")).click();
		
		driver.findElement(By.xpath("(//button[contains(text(),'click the button to dem')])")).click();
		
		Alert al3 = driver.switchTo().alert();
		
		al3.sendKeys("yash");

		Thread.sleep(2000);
		al3.accept();
		
		
}
}

