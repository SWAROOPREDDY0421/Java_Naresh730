package Selinium;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SadBasicsExp7 {
	
	public void LanchAUT() throws InterruptedException {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Mr Anil Please enter Your URL");
		String url=sc.nextLine();
		System.setProperty("webdriver.chrome.driver", "C:\\\\Selinium Drivers\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		SadBasicsExp7 obj=new SadBasicsExp7();
		obj.LanchAUT();

	}

}
