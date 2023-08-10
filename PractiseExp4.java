package Selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

	public class PractiseExp4 {WebDriver driver;
	public void LanchAUT() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Selinium Drivers\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://www.google.co.in/");
	Thread.sleep(1000);
	driver.manage().window().maximize();
	Thread.sleep(1000);
	}
	public void myntra_shop() throws InterruptedException {
		driver.findElement(By.name("q")).sendKeys("myntra");
		Thread.sleep(2000);
		driver.findElement(By.className("eIPGRd")).click();
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Myntra: Online Shopping for Women, Men, Kids Fashion ...")).click();
		Thread.sleep(2000);
	}
	public void Men_dress() throws InterruptedException {
		driver.findElement(By.className("desktop-main")).click();
		Thread.sleep(2000);
	}

	
	
	public static void main(String[] args) throws InterruptedException {
		PractiseExp4 obj=new PractiseExp4();
		obj.LanchAUT();
		obj.myntra_shop();
		obj.Men_dress();
	}

}
