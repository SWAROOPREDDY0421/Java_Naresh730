package Selinium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SadBasicsExp30 {
	WebDriver driver;
	Actions actobj;
	public void LanchAUT() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selinium Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
	}
	public void mouse_over_action() {
		actobj=new Actions(driver);
		WebElement de=driver.findElement(By.xpath("//a[@class='nav-link dropdown-toggle']"));
		WebElement ma=driver.findElement(By.xpath("//a[text()='Mac (1)']"));
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		actobj.moveToElement(de).moveToElement(ma).click().perform();
		//driver.close();
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		SadBasicsExp30 obj=new SadBasicsExp30();
		obj.LanchAUT();
		obj.mouse_over_action();
	}

}
