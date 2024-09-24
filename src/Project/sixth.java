package Project;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class sixth {
	public static void main (String[] args) throws InterruptedException, IOException, AWTException
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
          
		driver.get("https://automationexercise.com/");
		Thread.sleep(500);
		
		WebElement file =  driver.findElement(By.xpath("//a[contains(text(),' Contact us')]"));
        file.click();
        
        
        WebElement namefld =  driver.findElement(By.name("name"));
        namefld.sendKeys("Yash");
        
        WebElement emlfld =  driver.findElement(By.name("email"));
        emlfld.sendKeys("Yash@gmail.com"); 
        WebElement subfld =  driver.findElement(By.name("subject"));
        subfld.sendKeys("XYZKKKKKKKKKKK"); 
        WebElement messfld =  driver.findElement(By.name("message"));
        messfld.sendKeys("Yash TETESD THE WEBSITE");
        
       //driver.findElement(By.name("upload_file"));
   
       Robot robo = new Robot();

        robo.keyPress(KeyEvent.VK_TAB);	
        Thread.sleep(500);
        
        robo.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(500);
		Runtime.getRuntime().exec("./autoit/demo558.exe");

//
//        File f = new File("./autoit/YAsh .pdf");
//		
	WebElement file2 = driver.findElement(By.cssSelector("input[type='file']"));

		file2.sendKeys(Keys.ENTER);
		Thread.sleep(500);
		
		
		driver.findElement(By.xpath("//input[@data-qa='submit-button']")).click();
         // driver.findEl

        
        
	}
}

			
