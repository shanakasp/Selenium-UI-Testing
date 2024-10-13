package gettingStarted;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {

	public static void main(String[] args) {
		System.out.println("Hello world!");
		
		//1. Create a webdriver with ChromeDriver object
		//2. Launch the browser
		WebDriver driver = new ChromeDriver();
		
		//3. Navigate to specific URL
		driver.navigate().to("https://admin.wwwebdevelopment.com");
		
		//driver.manage().window().fullscreen();
		
		System.out.println("Current URL is" + driver.getCurrentUrl());
		
		Login(driver);
		
	    //get current page source
	/*	String pageSource = driver.getPageSource();
		
		if(pageSource.contains("shanaka")) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
		*/
		
	/*	// 1. Identify some thing by it's id or name
		By locator = By.linkText("Reviews");
		
		//2. Pass this locator to webdriver to do some operation
		WebElement element = driver.findElement(locator);
		
		//3. perform some operation ex, click
		element.click();		*/
		
		
	/*	By txtEmail = By.name("email");
		WebElement txtEmailElement = driver.findElement(txtEmail);
		txtEmailElement.sendKeys("admin");
		
		By txtPassword = By.name("password");
		WebElement txtPasswordElement = driver.findElement(txtPassword);
		txtPasswordElement.sendKeys("*!Www2681!*");*/
		
		//driver.close();
	}
	
	public static void Login(WebDriver driver) {
		driver.findElement(By.name("email")).sendKeys("pievphotography@gmail.com");
		driver.findElement(By.name("password")).sendKeys("*!Www2681!*");
		
		//Click on the login button
		 driver.findElement(By.cssSelector("button[type='submit']")).click();
		 
		 driver.findElement(By.cssSelector(".css-kwfsdv")).click();
	}
	
	
}
