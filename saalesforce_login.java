package Selinium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;


public class saalesforce_login {
WebDriver driver;
	
	public void LanchAUT() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selinium Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://login.salesforce.com/?locale=in");
		Thread.sleep(2000);
		driver.manage().window().maximize();
	}
	public void Senddata() throws InterruptedException {
		driver.findElement(By.id("username")).sendKeys("swaroopreddy123@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("reddy@123");
		Thread.sleep(2000);
		driver.findElement(By.id("Login")).click();
	}
	public void page_source() throws IOException {
		String SRC=driver.getPageSource();
		System.out.println("The Page_Source Code is:"+SRC);
		if(SRC.contains("please Enter username and Password!")) {
			System.out.println("The Test case is pass");
		}
		else {
			File Src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			File des= new File("G:\\Desktop\\New folder (2)\\salesforcescreenshot.jpg");
			FileHandler .copy(Src, des);
		}
	}
	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		saalesforce_login obj=new saalesforce_login();
		obj.LanchAUT();
		obj.Senddata();
		obj.page_source();
	
	}

}
