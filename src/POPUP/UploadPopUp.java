package POPUP;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

import org.openqa.selenium.By;


public class UploadPopUp {
	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
		driver.findElement(By.className("main-3")).click();
		
		driver.findElement(By.xpath("(//button[contains(text(),'Upload Resume')])")).click();

		Runtime.getRuntime().exec("./autoit/demo2.exe");

	}

}
