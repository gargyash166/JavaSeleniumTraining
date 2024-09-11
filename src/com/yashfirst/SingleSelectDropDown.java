package com.yashfirst;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;


public class SingleSelectDropDown {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		
		WebElement drop = driver.findElement(By.tagName("select"));
		
				Select sct = new Select(drop);
				
				System.out.println(sct.isMultiple());
				
				sct.selectByIndex(2);
				Thread.sleep(4000);
				sct.selectByValue("AZE");
				Thread.sleep(4000);
				sct.selectByVisibleText("Bhutan");
				
				List<WebElement> opt = sct.getOptions();
				
				System.out.println("total no of country is" +opt.size());
				
				
		
	}
	

}
