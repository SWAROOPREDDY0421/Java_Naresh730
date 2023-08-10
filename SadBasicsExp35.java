package Selinium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SadBasicsExp35 {
	WebDriver driver;
	JavascriptExecutor jse;
	public void LanchAUT() {
		System.setProperty("webdriver.chrome.driver", "C:\\Selinium Drivers\\chromedriver_win32 (1)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	public void Refresh() throws InterruptedException {
		jse=(JavascriptExecutor) driver;
		jse.executeScript("history.go()");
		Thread.sleep(2000);
	}
	public void SRC() throws InterruptedException {
		jse=(JavascriptExecutor) driver;
		jse.executeScript("return document.documentElemnt.innertext;");
		Thread.sleep(2000);
	}
	public void alert() throws InterruptedException {
		jse=(JavascriptExecutor) driver;
		jse.executeScript("alert('wELCOME TO Amazon Mr Swaroop');");
		Thread.sleep(2000);
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		SadBasicsExp35 obj=new SadBasicsExp35();
		obj.LanchAUT();
		obj.Refresh();
		obj.SRC();
		obj.alert();
	}

}
