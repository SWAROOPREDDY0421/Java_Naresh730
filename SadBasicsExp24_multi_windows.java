package Selinium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SadBasicsExp24_multi_windows {
	WebDriver driver;
	
	public void LanchAUT() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selinium Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		Thread.sleep(2000);
		driver.manage().window().maximize();
	}
	public void multi_wind() throws InterruptedException {
		String parentwindowhandle=driver.getWindowHandle();
		Thread.sleep(2000);
		System.out.println("The parent handle is:"+parentwindowhandle + driver.getTitle());
		driver.findElement(By.xpath( "//button[@id='newWindowBtn']")).click();
		Thread.sleep(2000);
		Set<String> M_handle=driver.getWindowHandles();
		for(String M_handles:M_handle) {
			if(!M_handles.equals(parentwindowhandle)) {
			driver.switchTo().window(M_handles);
			driver.manage().window().maximize();
			driver.findElement(By.id("firstName")).sendKeys("SWAROOP");
			Thread.sleep(2000);
			driver.findElement(By.name("lName")).sendKeys("REDDY");
			Thread.sleep(2000);
			driver.findElement(By.className("bcRadioButton")).click();
			Thread.sleep(2000);
			System.out.println("The Multiple windows id id:"+M_handles + driver.getTitle());
			driver.close();
			}
			
		}
		
		driver.switchTo().window(parentwindowhandle);
		driver.findElement(By.id("name")).sendKeys("HYR");
		
		Thread.sleep(2000);
		driver.quit();
		
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		SadBasicsExp24_multi_windows obj=new SadBasicsExp24_multi_windows();
		obj.LanchAUT();
		obj.multi_wind();
	}

}
