package Selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PractiseExp3 {
	WebDriver driver;
	public void LanchAUT() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selinium Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
	}
	
	public void Buy_phone() throws InterruptedException {
		driver.findElement(By.name("q")).sendKeys("Amazon");
		Thread.sleep(2000);
		driver.findElement(By.className("pcTkSc")).click();
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Amazon.in")).click();
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Hello, sign in")).click();
		Thread.sleep(2000);
		
	}
	public void amazon_login() throws InterruptedException {
		driver.findElement(By.id("ap_email")).sendKeys("9901473024");
		Thread.sleep(1000);
		driver.findElement(By.className("a-button-input")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("ap_password")).sendKeys("narayana@421");
		Thread.sleep(2000);
		driver.findElement(By.id("signInSubmit")).click();
		Thread.sleep(2000);
		WebElement otp=driver.findElement(By.id("auth-mfa-otpcode"));
		Thread.sleep(2000);
		System.out.println(otp);
		driver.findElement(By.id("auth-signin-button")).click();
		Thread.sleep(2000);
	}
	public void phone() throws InterruptedException {
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("I Phone");
		Thread.sleep(2000);
		driver.findElement(By.id("nav-search-submit-button")).click();
		Thread.sleep(2000);
		
	}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		PractiseExp3 obj=new PractiseExp3();
		obj.LanchAUT();
		obj.Buy_phone();
		obj.amazon_login();
		obj.phone();
	}
}
