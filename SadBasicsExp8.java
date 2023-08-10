package Selinium;


import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SadBasicsExp8 {
	
	public void LanchAUT() throws InterruptedException {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter Hom many times to open brower");
		int count=sc.nextInt();
		for(int i=0;i<=count;i++) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selinium Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.manage().window().minimize();
		Thread.sleep(2000);
		driver.close();
		}
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		SadBasicsExp8 obj=new SadBasicsExp8();
		obj.LanchAUT();

	}

}
