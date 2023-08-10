package Selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathExp {
	private static WebDriver driver;
	
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
			
		}
		public void Highlight(WebElement element) {
			JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
			jsExecutor.executeScript("arguments[0].setAttribute('style', 'border:2px solid dot red; background:light yellow')", element);
		}
		public void Path_Register() throws InterruptedException {
			driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
			driver.findElement(By.xpath("//input[@name='name']")).sendKeys("SWAROOP");
			Thread.sleep(2000);
			//driver.findElement(by.)
		}
	}


