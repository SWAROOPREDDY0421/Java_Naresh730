package Selinium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SadBasicsExp3 {
	
	WebDriver driver;
	
	public void LanchAUT() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selinium Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}
	
	public void Get_tiile() {
		String url=driver.getCurrentUrl();
		System.out.println(url);
	}
	
	public void Page_srcode() {
		String SRC=driver.getPageSource();
		System.out.println(SRC);
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		SadBasicsExp3 obj=new SadBasicsExp3();
		obj.LanchAUT();
		obj.Page_srcode();
		obj.Get_tiile();

	}

}
