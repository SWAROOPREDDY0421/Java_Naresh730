package Selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SadBasicsExp14 {
	WebDriver driver;
	
	public void LanchAUT() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selinium Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		String Title=driver.getTitle();
		System.out.println(Title);
		String url=driver.getCurrentUrl();
		System.out.println(url);
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
	}
	public void Pagesrcode() {
		String SRC=driver.getPageSource();
		System.out.println(SRC);
		driver.manage().window().minimize();		
		driver.close();
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

	}
	
	public void Senddata() throws InterruptedException {
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Boat");
		Thread.sleep(2000);
		driver.findElement(By.id("nav-search-submit-button")).click();
		Thread.sleep(2000);
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		SadBasicsExp14 obj=new SadBasicsExp14() ;
		obj.LanchAUT();
		obj.Senddata();
		obj.Pagesrcode();
		
	}

}
