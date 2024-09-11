package com.yashfirst;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
public static void main(String[] args) {
	
	WebDriver driver = new EdgeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
	
	Actions act = new Actions(driver);
	
	WebElement frame11 = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
	
	driver.switchTo().frame(frame11);
	
	WebElement source = driver.findElement(By.xpath("//img[@alt='Planning the ascent']"));
	
	WebElement destination = driver.findElement(By.id("trash"));
	
	act.dragAndDrop(source, destination).perform();
	
}
}
