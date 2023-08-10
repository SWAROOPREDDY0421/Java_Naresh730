package Selinium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class SadBasicsExp22_fb_screeenshot {
	WebDriver driver;
	
	public void LanchAUT() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selinium Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}
	public void Senddata() throws InterruptedException {
		driver.findElement(By.cssSelector("#email")).sendKeys("purnareddy");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#pass")).sendKeys("raju@123");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("[name=login]")).click();
		Thread.sleep(1000);
	}
	public void Screenshot() throws IOException {
		String SRC=driver.getPageSource();
		System.out.println(SRC);
		if(SRC.contains("The email address or mobile number ")){
		System.out.println("testcase is pass");	  
		}
		else {
			File Src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			File Des=new File("G:\\Desktop\\New folder\\fbscreen.jpg");
			FileHandler.copy(Src, Des);
		}
	}
	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		SadBasicsExp22_fb_screeenshot obj=new SadBasicsExp22_fb_screeenshot();
		obj.LanchAUT();
		obj.Senddata();
		obj.Screenshot();
		
	}

}
