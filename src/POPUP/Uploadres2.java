package POPUP;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Uploadres2 {
	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
		
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath(" //p[contains(text(),' I have work experience ')]")).click();
		driver.findElement(By.xpath(" //button[.='Upload Resume']")).click();
		
		File f = new File("./autoit/YAsh .pdf");
		
		WebElement file = driver.findElement(By.cssSelector("input[type='file']"));
		
		file.sendKeys(f.getAbsolutePath());
		
		file.sendKeys(Keys.ENTER);
		
//		driver.findElement(By.id("file-submit")).click();

	}
}
