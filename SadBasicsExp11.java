package Selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SadBasicsExp11 {
	WebDriver driver;
	
	public void LanchAUT() throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "C:\\Selinium Drivers\\msedgedriver.exe");
		driver=new EdgeDriver();
		driver.get("https://login.salesforce.com/?locale=in");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}
	
	public void Senddata() throws InterruptedException {
		driver.findElement(By.id("username")).sendKeys("swaroop0421@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("swaroop421");
		Thread.sleep(2000);
		driver.findElement(By.id("Login")).click();
	
	}
	public void closeAUT() {
		driver.close();
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		SadBasicsExp11 obj=new SadBasicsExp11();
		obj.LanchAUT();
		obj.Senddata();
		obj.closeAUT();
			
		}

	}

