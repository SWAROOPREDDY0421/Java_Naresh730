package Selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class PractiseExp1 {
	WebDriver driver;
	public void LanchAUT() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selinium Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}
	public void Senddata() throws InterruptedException  {
		driver.findElement(By.name("q")).sendKeys("amazon");
		Thread.sleep(2000);
		driver.findElement(By.className("pcTkSc")).click();
		Thread.sleep(2000);
	}
	/**
	 * @throws InterruptedException
	 */
	public void Amazon_click() throws InterruptedException {
		driver.findElement(By.partialLinkText("Amazon.in")).click();
		Thread.sleep(1000);
		driver.findElement(By.partialLinkText("Mobiles")).click();
		Thread.sleep(1000); 
		driver.findElement(By.className("a-dynamic-image sl-sobe-dynamic-image")).click();
		Thread.sleep(1000);

		driver.close();
	}


	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		PractiseExp1 obj=new PractiseExp1();
		obj.LanchAUT();
		obj.Senddata();
		obj.Amazon_click();
		
		
	}

}
