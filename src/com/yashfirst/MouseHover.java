package com.yashfirst;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebDriver;


public class MouseHover {
	public static void main(String [] args) throws InterruptedException {
		WebDriver  driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.howtocodeschool.com/2021/10/demo-of-simple-click-and-hold-effect.html");
		
		   Actions act = new Actions(driver);

		act.moveByOffset(174,295).clickAndHold().perform();
		
		Thread.sleep(4000);
		
		act.release().perform();
		
	}

}
