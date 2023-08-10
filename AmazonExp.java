package Selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AmazonExp {
	WebDriver driver;
	
	public void LanchAUT() throws InterruptedException {
		System.setProperty("weddriver.chrome.driver", "C:\\Selinium Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}
	public void Amazon_search() throws InterruptedException {
		driver.findElement(By.name("q")).sendKeys("amazon");
		Thread.sleep(2000);
		driver.findElement(By.className("pcTkSc")).click();
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Amazon.in")).click();
		Thread.sleep(2000);
	}
	public void amazon_AllButton() throws InterruptedException {
		WebElement All=driver.findElement(By.name("url"));
		Select Allobj=new Select(All);
		Allobj.selectByVisibleText("Electronics");
		Thread.sleep(2000);
		driver.findElement(By.id("nav-search-submit-button")).click();
		Thread.sleep(2000);
		
	}
	public void Electronics() throws InterruptedException {
		driver.findElement(By.className("a-dynamic-image sl-sobe-carousel-sub-card-img")).click();
		Thread.sleep(2000);
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		AmazonExp obj=new AmazonExp();
		obj.LanchAUT();
		obj.Amazon_search();
		obj.amazon_AllButton();
		obj.Electronics();
	}

}
