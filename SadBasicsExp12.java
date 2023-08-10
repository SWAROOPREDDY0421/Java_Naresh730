package Selinium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SadBasicsExp12 {
	
	WebDriver driver;
	
	public void LanchAUT() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","C:\\Selinium Drivers\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
	}
	public void pagesource() {
		String SRC=driver.getPageSource();
		System.out.println(SRC);
	}
	public void Get_title() {
		String Title= driver.getTitle();
		System.out.println(Title);
	}
	public void Get_url() {
		String url=driver.getCurrentUrl();
		System.out.println(url);
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		SadBasicsExp12 obj=new SadBasicsExp12();
		obj.LanchAUT();
		obj.pagesource();
		obj.Get_title();
		obj.Get_url();
	}

}
