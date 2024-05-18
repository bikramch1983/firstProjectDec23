package variousConcepts;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learnlocators {
   WebDriver driver;
	
@Before
	public void setup()	{
	
	//System.setProperty("webdriver.chrome.driver", "C:\\Users\\ch7bi\\Desktop\\Selenium_Dec23\\Session2\\driver\\chromedriver.exe");
	//System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
	//System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
	System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
	   driver = new ChromeDriver();
	   driver.manage().deleteAllCookies();
	   driver.get("https://objectspy.space/");
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		   
	
	}
@Test
	public void testLocators() {
	driver.findElement(By.name("firstname")).sendKeys("Selenium");
	driver.findElement(By.id("sex-1")).click();	
	//file upload
	driver.findElement(By.className("input-file")).sendKeys("");
		
	}
	
	
	
}
