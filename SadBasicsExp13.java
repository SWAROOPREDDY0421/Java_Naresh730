package Selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SadBasicsExp13 {
	WebDriver driver;
	
	public void LanchAUT() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selinium Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://login.salesforce.com/?locale=in");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}
	public void Senddata(String uname,String pwd) throws InterruptedException {
		driver.findElement(By.id("username")).sendKeys(uname);
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys(pwd);
		Thread.sleep(2000);
		driver.findElement(By.id("Login")).click();
		Thread.sleep(2000);
	}

	public void closeAUT() {
		driver.close();
	}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		SadBasicsExp13 obj=new SadBasicsExp13();
		obj.LanchAUT();
		obj.Senddata("swaroop0421@gmail.com", "swaroop421");
		obj.closeAUT();
	}

}
