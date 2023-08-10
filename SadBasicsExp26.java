package Selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SadBasicsExp26 {
	WebDriver  driver;
	Actions actobj;
	public void lanchAUT() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selinium Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
	}
	public void countframe() {
	int count=driver.findElements(By.className("demo-frame")).size();
	System.out.println(count);
	}
	public void drag_drop() {
		actobj=new Actions(driver);
		driver.switchTo().frame(0);
		WebElement drag=driver.findElement(By.id("draggable"));
		WebElement drop=driver.findElement(By.id("droppable"));
		actobj.dragAndDrop(drag, drop).perform();;
	}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		SadBasicsExp26 obj=new SadBasicsExp26();
		obj.lanchAUT();
		obj.countframe();
		obj.drag_drop();
	}

}
