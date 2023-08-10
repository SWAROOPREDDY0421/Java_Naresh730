package Selinium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SadBasicsExp17 {
	WebDriver driver;
	
	public void LanchAUT() throws InterruptedException   {
		
		String[] Browser= {"Chrome","Firefox"};
		
		for(String Browsers:Browser) {
			if(Browsers.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", "C:\\Selinium Drivers\\chromedriver.exe");
				driver=new ChromeDriver();
				driver.get("https://www.amazon.in/");
				Thread.sleep(2000);
				driver.manage().window().maximize();
				Thread.sleep(2000);
				driver.close();
			}
			else if(Browsers.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver", "C:\\Selinium Drivers\\geckodriver.exe");
				driver=new FirefoxDriver();
				driver.get("https://www.amazon.in/");
				Thread.sleep(2000);
				driver.manage().window().maximize();
				Thread.sleep(2000);
				driver.close();
			}
		}
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		SadBasicsExp17 obj=new SadBasicsExp17();
		obj.LanchAUT();

	}

}
