package Selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PractiseExp2 {
	WebDriver driver;
	public void LanchAUT() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selinium Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
	}
	public void Flip_kart() throws InterruptedException {
		driver.findElement(By.name("q")).sendKeys("flipkart");
		Thread.sleep(1000);
		driver.findElement(By.className("pcTkSc")).click();
		Thread.sleep(1000);
		driver.findElement(By.partialLinkText("Mobile Phones")).click();
		Thread.sleep(1000);
		driver.findElement(By.className("_1aPR5_")).click();
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("realme C33 (Sandy Gold, 32 GB)")).click();
		Thread.sleep(2000);
		driver.findElement(By.className("_2KpZ6l _2U9uOA ihZ75k _3AWRsL")).click();
		Thread.sleep(2000);
		driver.close();
		
	}
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		PractiseExp2 obj=new PractiseExp2();
		obj.LanchAUT();
		obj.Flip_kart();

	}

}
