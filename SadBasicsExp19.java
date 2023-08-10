package Selinium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SadBasicsExp19 {
	
	WebDriver driver;
	public void LanchAUT() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Selinium Drivers\\\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		}
	public void Navigate() throws InterruptedException {
		driver.navigate().to("https://www.amazon.in/");
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		SadBasicsExp19 obj=new SadBasicsExp19();
		obj.LanchAUT();
		obj.Navigate();
	}

}
