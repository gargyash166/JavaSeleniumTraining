package TestNg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

   public class DemoLogin {
     WebDriver driver;
          
      @BeforeClass
        public  void setup() {
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://automationexercise.com/login");
	    driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
	}
	       @Test(priority=1)
           public  void Fullname() {
       	    driver.findElement(By.name("name")).sendKeys("Yash");

	
       }       @Test(priority=2)
              public  void  Email() {
          	    driver.findElement(By.xpath("(//input[@name='email'])[2]")).sendKeys("Yash77@gmail.com");
          	    //"(//input[@name='email'])[1]"

          }
                  @Test(priority=3)
                  public  void Click_SignUp() {
	         //   driver.findElement(By.xpath("//button[.='signup']")).click();
	            driver.findElement(By.xpath("//button[contains(text(),'Signup')]")).click();

               }
                  
                  @AfterClass
                 public void teardown() {
                	driver.close();  
                	 
                 }

	
}