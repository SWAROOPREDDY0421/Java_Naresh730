package Selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SadBasicsExp27 {
	WebDriver driver;
	Actions actobj;
	public void LanchAUT() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selinium Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick2");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
	}
	public void Double_click() throws InterruptedException {
		actobj=new Actions(driver);
		driver.switchTo().frame("iframeResult");
		WebElement DC=driver.findElement(By.id("demo"));
		Thread.sleep(2000);
		actobj.doubleClick(DC).build().perform();
	}
	public void Get_text() {
		String text=driver.findElement(By.id("demo")).getText();
		System.out.println(text);
	}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		SadBasicsExp27 obj=new SadBasicsExp27();
		obj.LanchAUT();
		obj.Double_click();
		obj.Get_text();

	}

}
