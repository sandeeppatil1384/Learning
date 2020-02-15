import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {
	
	WebDriver driver;
	String baseUrl="http://newtours.demoaut.com/";
	
	@Test
	public void loginTest() {
		WebDriverManager.chromedriver().setup();
		 
        //Create driver object for Chrome
         driver = new ChromeDriver();
 
        //Navigate to a URL
        driver.get(baseUrl);
        
        driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("mercury");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("mercury");
        driver.findElement(By.xpath("//input[@name='login']")).click();
	}
	
	
	

}
