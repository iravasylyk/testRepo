package TestFramework.TestAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.lang.Math;
/**
 * Unit test for simple App.
 */
public class AppTest {
	
	  public WebDriver driver = new FirefoxDriver();
      
	  @BeforeTest
	  public void beforeTest(){
      // Go to the Google Suggest home page
      driver.navigate().to("http://www.google.com/");
      
	  }
	  
	  @Test
	  public void test1(){
      // Enter the query string "Cheese"
      WebElement query = driver.findElement(By.name("q"));
      query.sendKeys("Cheese");
      Math.abs(-3);

	  }
	  @AfterTest
	  public void afterTest(){
      driver.quit();
	  }
}
