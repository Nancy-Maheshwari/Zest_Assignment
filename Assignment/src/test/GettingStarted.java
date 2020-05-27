package test;


import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;
import main.allElements;


public class GettingStarted {
	
WebDriver driver;
allElements all;
	   @BeforeTest
	   public void setup(){
	       
	       driver = new ChromeDriver();
	       
	       driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.get("https://www.facebook.com");
			driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			   

	 
	   }
	//@BeforeTest
//	public void setUp() {
//	  driver = new ChromeDriver();
//	}
//
//	@AfterTest
//	public void tearDown() {
//	  driver.quit();
//	}

	   
	   @Test
	   public void startTest()
	   {
		   allElements all =PageFactory.initElements(driver,allElements.class);
		   //all=new allElements(driver);
		   System.out.println("inside start test");
		   all.enterFacebookEmailandPassword();
		   all.writePost();
		   
	   }
	
	

	
	

} 

