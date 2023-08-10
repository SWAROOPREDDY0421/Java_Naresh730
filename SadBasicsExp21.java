package Selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SadBasicsExp21 {
	WebDriver driver;
	public void AUT() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selinium Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.indiehackers.com/sign-in");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
	}
	public void Click_ok() throws InterruptedException {
		driver.findElement(By.linkText("Reset")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
	}
	public void click_cancel() throws InterruptedException {
		driver.findElement(By.linkText("Reset")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
		Thread.sleep(2000);
		
	}
	public void senddata() throws InterruptedException  {
		driver.findElement(By.linkText("Reset")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().sendKeys("Raju");
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
		Thread.sleep(2000);
	}
	public void Get_Text() throws InterruptedException {
		driver.findElement(By.linkText("Reset")).click();
		Thread.sleep(2000);
		String Text=driver.switchTo().alert().getText();
		System.out.println("The data is:"+Text);
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
	}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		SadBasicsExp21 obj=new SadBasicsExp21();
		obj.AUT();
		obj.Click_ok();
		obj.click_cancel();
		obj.senddata();
		obj.Get_Text();
	}

}
