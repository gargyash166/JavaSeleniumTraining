package com.yashfirst;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;


public class ToautomateDoubleClick {
	public static void main(String[] args) throws InterruptedException {

	
	WebDriver driver = new EdgeDriver();
	
	driver.manage().window().maximize();
	 
	driver.get("https://www.plus2net.com/javascript_tutorial/ondblclick-demo2.php");
	
	WebElement box = driver.findElement(By.id("box"));
	
   Actions act = new Actions(driver);
   
   act.doubleClick(box).perform();
   
   Thread.sleep(4000);
   
   box.click(); // for single click
	
}
	}
