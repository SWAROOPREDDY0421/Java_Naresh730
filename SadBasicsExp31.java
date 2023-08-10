package Selinium;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SadBasicsExp31 {
	WebDriver driver;
	Actions actobj;
	public void LanchAUT() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selinium Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();	
	}
	public void Explict_wait() {
	WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(50));
	WebElement we=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@alt='Nivea, Vaseline, Mamaearth  Skincare Deals']")));
	we.click();
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		SadBasicsExp31 obj=new SadBasicsExp31();
		obj.LanchAUT();
		obj.Explict_wait();
	}

}
