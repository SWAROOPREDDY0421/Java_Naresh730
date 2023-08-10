package Selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SadBasicsExp29 {
	WebDriver driver;
	Actions actobj;
	public void LanchAUT() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selinium Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
	}
	
	public void searchsixpositionitem() throws InterruptedException {
		actobj=new Actions(driver);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("I Phone");
		Thread.sleep(2000);
		for(int i=1;i<=6;i++) {
			actobj.sendKeys(Keys.DOWN).perform();
			Thread.sleep(2000);
		}
		actobj.sendKeys(Keys.ENTER).perform();
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		SadBasicsExp29 obj=new SadBasicsExp29();
		obj.LanchAUT();
		obj.searchsixpositionitem();
	}

}
