package Selinium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SadBasicsExp23_Multiple_selects {
WebDriver driver;
	
	public void LanchAUT() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selinium Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}
	public void multliple() throws InterruptedException {
		driver.switchTo().frame("iframeResult");
		WebElement we=driver.findElement(By.id("cars"));
		Select selobj=new Select(we);
		selobj.selectByVisibleText("Audi");
		Thread.sleep(2000);
		selobj.selectByIndex(2);
		Thread.sleep(2000);
		selobj.deselectByValue("volvo");
		Thread.sleep(2000);
		//Multiple Selection
		List<WebElement>alloptions=selobj.getAllSelectedOptions();
		System.out.println(alloptions);
		selobj.deselectByVisibleText("Volvo");
		Thread.sleep(1000);
		selobj.deselectAll();
		driver.switchTo().defaultContent();
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		SadBasicsExp23_Multiple_selects obj=new SadBasicsExp23_Multiple_selects();
		obj.LanchAUT();
		obj.multliple();
	}

}
