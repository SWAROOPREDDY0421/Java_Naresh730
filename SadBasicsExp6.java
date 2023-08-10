package Selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SadBasicsExp6 {
	
	WebDriver driver;
	
	public void LanchAUT() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selinium Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}
	public void sendData() throws InterruptedException {
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("I PHONE 14 PRO");
		Thread.sleep(500);
		driver.findElement(By.id("nav-search-submit-button")).click();
		Thread.sleep(500);

	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		SadBasicsExp6 obj=new SadBasicsExp6();
		obj.LanchAUT();
		obj.sendData();

	}

}
