package Selinium;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SadBasicsExp16 {
	WebDriver driver;
	public void LanchAUT() throws InterruptedException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Ennter Browser");
		String Broswer=sc.nextLine();
		if(Broswer.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Selinium Drivers\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(Broswer.equals("Edge")) {
			System.setProperty("webdriver.Edge.driver", "C:\\Selinium Drivers\\msedgedriver.exe");
			driver=new EdgeDriver();
		}
		else {
			System.out.println("The Browser is Not Found");
		}
		driver.get("https://login.salesforce.com/?locale=in");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.close();
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		SadBasicsExp16 obj=new SadBasicsExp16();
		obj.LanchAUT();

	}

}
