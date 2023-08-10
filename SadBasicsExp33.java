package Selinium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SadBasicsExp33 {
	WebDriver driver;
	JavascriptExecutor jse;
	public void LanchAUT() {
		System.setProperty("jwebdriver.chrome.driver", "C:\\Selinium Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://login.salesforce.com/?locale=in");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	public void highlight() throws InterruptedException {
		jse=(JavascriptExecutor) driver;
		WebElement HIGH=driver.findElement(By.id("password"));
		jse.executeScript("arguments[0].style='border:5px solid red';", HIGH);
		Thread.sleep(2000);
	}
	
	public void click() throws InterruptedException {
		jse=(JavascriptExecutor) driver;
		WebElement login=driver.findElement(By.id("Login"));
		jse.executeScript("arguments[0].click();", login);
		Thread.sleep(2000);
		
	}

	public void senddata() throws InterruptedException {
		jse=(JavascriptExecutor) driver;
		WebElement uname=driver.findElement(By.id("username"));
		jse.executeScript("arguments[0].value='raju@123';", uname);
		Thread.sleep(2000);
		
		WebElement pawd=driver.findElement(By.id("password"));
		jse.executeScript("arguments[0].value='raji123';", pawd);
		Thread.sleep(2000);
	}
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		SadBasicsExp33 obj=new SadBasicsExp33();
		obj.LanchAUT();
		
		obj.senddata();
		obj.click();
		obj.highlight();

	}

}
