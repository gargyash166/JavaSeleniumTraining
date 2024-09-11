package com.yashfirst;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
public class Carsdrop {
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/select-menu");
		
		WebElement drop = driver.findElement(By.id("cars"));
		
				Select sct = new Select(drop);
				
				System.out.println(sct.isMultiple());
				
				sct.selectByIndex(3);
				Thread.sleep(4000);
				sct.selectByValue("saab");
				Thread.sleep(4000);
				sct.selectByVisibleText("Opel");
				List<WebElement> opt = sct.getOptions();
				for(WebElement allopt:opt) {
					System.out.println(allopt.getText());
					
					// to get first selected option
					
					sct.deselectByIndex(3);
					sct.deselectByValue("saab");
					sct.deselectByVisibleText("Opel");
					
					//sct.deselectAll();
				}
				

	}

}