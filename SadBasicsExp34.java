package Selinium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SadBasicsExp34 {
	WebDriver driver;
	JavascriptExecutor jse;
	public void LanchAUT() {
		System.setProperty("jwebdriver.chrome.driver", "C:\\Selinium Drivers\\chromedriver_win32 (1)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	public void Scroll_T_to_B() throws InterruptedException {
		jse=(JavascriptExecutor) driver;
		jse.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		Thread.sleep(2000);
		}
	public void Scroll_B_to_T() throws InterruptedException {
		jse=(JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(document.body.scrollHeight,0)");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		Thread.sleep(2000);
		}
	public void Execepted_Element() throws InterruptedException {
		jse=(JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(2000);
		WebElement sham=driver.findElement(By.xpath("//img[@alt='Nivea, Vaseline, Mamaearth  Skincare Deals']"));
		sham.click();
	}
	public void get_title() {
		jse=(JavascriptExecutor) driver;
		String Title=jse.executeScript("return document.title").toString();
		System.out.println("The title is:"+Title);
	}
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		SadBasicsExp34 obj=new SadBasicsExp34();
		obj.LanchAUT();
		obj.Scroll_T_to_B();
		obj.Scroll_B_to_T();
		obj.Execepted_Element();
		obj.get_title();
		
	}

}
