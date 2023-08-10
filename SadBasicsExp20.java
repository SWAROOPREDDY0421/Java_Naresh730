package Selinium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SadBasicsExp20 {
	WebDriver driver;
	public void LanchAUT() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selinium Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=jumbo1-btn-ft");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
	}
	public void Sendata() throws InterruptedException {
		driver.findElement(By.name("UserFirstName")).sendKeys("SWAROOP REDDY");
		Thread.sleep(2000);
		driver.findElement(By.name("UserLastName")).sendKeys("BASIREDDY");
		Thread.sleep(2000);
		driver.findElement(By.name("UserEmail")).sendKeys("basreddy1@gmail.com");
		Thread.sleep(2000);
	}
	public void job_title() throws InterruptedException {
		WebElement job_title=driver.findElement(By.name("UserTitle"));
		Select selobj=new Select(job_title);
		selobj.selectByVisibleText("CxO / General Manager");
		Thread.sleep(2000);
		selobj.selectByIndex(2);
		Thread.sleep(2000);
		selobj.selectByValue("Operations_Manager_AP");
		Thread.sleep(2000);
	}
	public void company_name() throws InterruptedException {
		driver.findElement(By.name("CompanyName")).sendKeys("TCS");
		Thread.sleep(2000);
	}
	public void Employees() throws InterruptedException {
		WebElement employee=driver.findElement(By.name("CompanyEmployees"));
		Select selemp=new Select(employee);
		selemp.selectByVisibleText("501 - 1500 employees");
		Thread.sleep(1000);
		selemp.selectByIndex(3);
		Thread.sleep(1000);
		selemp.selectByValue("75");
		Thread.sleep(1000);
	}
	public void phone_num() throws InterruptedException {
		driver.findElement(By.name("UserPhone")).sendKeys("9458623125");
		Thread.sleep(1000);
	}
	public void Country() throws InterruptedException {
		WebElement countries=driver.findElement(By.name("CompanyCountry"));
		Select selcou=new Select(countries);
		selcou.selectByVisibleText("Algeria");
		Thread.sleep(1000);
		selcou.selectByIndex(10);
		Thread.sleep(1000);
		selcou.selectByValue("IN");
		Thread.sleep(1000);
	}
	public void state() throws InterruptedException {
		WebElement state=driver.findElement(By.name("CompanyState"));
		Select selsta=new Select(state);
		selsta.selectByVisibleText("Bihar");
		Thread.sleep(1000);
		selsta.selectByIndex(12);
		Thread.sleep(1000);
		selsta.selectByValue("Andhrapradesh");
		Thread.sleep(1000);
	}
	public void Check() throws InterruptedException {
		driver.findElement(By.className("checkbox-ui")).click();
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Main Services Agreement")).click();
		Thread.sleep(2000);
	}
	public void Fre_Trail() throws InterruptedException {
		driver.findElement(By.name("start my free trial")).click();
		Thread.sleep(2000);
	}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		SadBasicsExp20 obj=new SadBasicsExp20();
		obj.LanchAUT();
		obj.Sendata();
		obj.job_title();
		obj.company_name();
		obj.Employees();
		obj.phone_num();
		obj.Country();
		obj.Country();
		obj.state();
		obj.Check();
		obj.Fre_Trail();
	}

}
