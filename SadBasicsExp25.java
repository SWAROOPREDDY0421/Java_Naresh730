package Selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class SadBasicsExp25 {
	WebDriver driver;
	Actions actobj;
	public void LanchAUT() throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "C:\\Selinium Drivers\\msedgedriver.exe");
		driver=new EdgeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		actobj=new Actions(driver);
		actobj=new Actions(driver);
		actobj.sendKeys(Keys.ESCAPE).perform();
	}
	public void Flipkart() throws InterruptedException {
	WebElement we=driver.findElement(By.name("q"));
	actobj=new Actions(driver);
	actobj.sendKeys(we, "i phone").perform();
	Thread.sleep(2000);
	actobj.sendKeys(Keys.ENTER).perform();;
	Thread.sleep(2000);
	String src=driver.getPageSource();
	if(src.contains("selinium")) {
		System.out.println("Test case is pass");
	}
	else {
		System.out.println("Test case is fail");
	}
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		SadBasicsExp25 obj=new SadBasicsExp25();
		obj.LanchAUT();
		obj.Flipkart();
		
	}

}
