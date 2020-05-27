package main;
import java.awt.Robot;
import java.io.*;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.thoughtworks.selenium.webdriven.commands.KeyEvent;


public class allElements {
	private WebDriver driver;
	String number="7065900159";
	String Password="Facebook@2020";

	
	public allElements(WebDriver driver)
	{
		this.driver=driver;
		//driver.get("https://www.facebook.com");
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\vabma\\Desktop\\nancy\\chromeDriver\\chromedriver.exe");
		
	}
	@FindBy(how=How.XPATH,using="//*[@id=\"email\"]")
	private WebElement emailInput;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"pass\"]")
	private WebElement passwordInput;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"u_0_b\"]")
	private WebElement loginBtn;
	
	
	
	@FindBy(how=How.XPATH,using="//*[@id=\"js_6\"]")
	private WebElement writePost;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"js_1m\"]/div[2]/div[3]/div[2]/button")
	private WebElement PostBtn;
	
	
	@FindBy(how=How.XPATH,using="//*[@id=\"facebook\"]/body/div[18]/div[1]")
	private WebElement pressAnywhere;

	
	public void enterFacebookEmailandPassword()
	{
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		System.out.println(emailInput);
		emailInput.sendKeys(number);
		System.out.println("Entered number to login");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		passwordInput.sendKeys(Password);
		System.out.println("Entered password to login");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		loginBtn.click();
		System.out.println("Pressed login button");
	}
	//WebElement loginLink = driver.findElement(By.linkText("Login"));
	public void writePost() {
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		
		
		//driver.switchTo().alert().dismiss();
		  //driver.switchTo().parentFrame();
		   
		   
		writePost.sendKeys("Hello World");
		PostBtn.click();
		System.out.println("typed hello world as status");
	}
	
}