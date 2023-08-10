package Selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SadBasicsExp28 {
	WebDriver driver;
	Actions actobj;
	public void LanchAUT() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selinium Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
	}
	
	public void Right_click() {
		WebElement R_C=driver.findElement(By.xpath("//a[text()='Mobiles']"));
		actobj=new Actions(driver);
		actobj.contextClick(R_C).perform();
		
		
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		SadBasicsExp28 obj=new SadBasicsExp28();
		obj.LanchAUT();
		obj.Right_click();
	}

}
