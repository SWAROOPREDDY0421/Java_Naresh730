package Selinium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SadBasicsExp18 {
	WebDriver driver; 
	String Browser1="Chrome";
	String Browser2="Firefox";
	public void AUT() throws InterruptedException {


		if(Browser1.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Selinium Drivers\\chromedriver.exe");
			driver=new ChromeDriver();
			
		}
		else if(Browser2.equals("Firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Selinium Drivers\\geckodriver.exe");
			driver=new FirefoxDriver();
			
		}
		else {
			System.out.println("Browser not found");
		}
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.close();
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		SadBasicsExp18 obj=new SadBasicsExp18();
		obj.AUT();
	}

}
