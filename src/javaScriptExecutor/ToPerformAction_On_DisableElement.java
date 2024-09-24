package javaScriptExecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class ToPerformAction_On_DisableElement {

	public static void main(String[] args) {


		
				
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://automationexercise.com/");
				driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
				JavascriptExecutor js =(JavascriptExecutor)driver;
				//js.executeScript("window.scrollTo (0,document.body.scrollHeight)");
				js.executeScript("window.scrollTo(0,800)");
				WebElement test6 = driver.findElement(By.xpath("//u[contains(.,'Test Case 6: Contact Us Form')]"));
				
				js.executeScript("argument[0].scrollIntoView(false)",test6);
				
			

				
				
			}
		}