package ScreenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ToCaptureTheScreenOfWholePage {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demos.jquerymobile.com/1.4.5/forms-disabled/");
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		
		 File source = ts.getScreenshotAs(OutputType.FILE);
		 
		 File dest = new File("./screenshot/FirstSS.png");
		 
		 Files.copy(source, dest);
		 
		 
		
	}

}
