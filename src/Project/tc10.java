package Project;

import org.openqa.selenium.chrome.ChromeDriver;

public class tc10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ChromeDriver driver = new ChromeDriver();
		    
		   driver.manage().window().maximize();
		   
		   driver.get("https://automationexercise.com/");
		   
	}

}
