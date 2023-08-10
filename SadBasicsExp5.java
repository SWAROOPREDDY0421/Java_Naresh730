package Selinium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SadBasicsExp5 {
	
	WebDriver driver;
	
	public void LanchAUT() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selinium Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
//		driver.close();
	}
	
	public void Get_title() {
		String title=driver.getTitle();
		System.out.println(title);
		System.out.println("==========================================================");

	}
	
	public void Page_url() {
		String url=driver.getCurrentUrl();
		System.out.println(url);
		System.out.println("==========================================================");
	}
	
	public void Page_srcode() {
		String SRC=driver.getPageSource();
		System.out.println(SRC);
		System.out.println("==========================================================");

	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		SadBasicsExp5 obj=new SadBasicsExp5();
		obj.LanchAUT();
		obj.Page_srcode();
		obj.Page_url();
		
		obj.Get_title();

	}

}
