package Selinium;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SadBasicsExp9 {
	WebDriver driver;
	
	public void LanchAUT() throws InterruptedException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter Application URl");
		String url=sc.nextLine();
		
		System.out.println("Please Enter Expected Title");
		String Exp_title=sc.nextLine();
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\Selinium Drivers\\\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		String act_title=driver.getTitle();
		System.out.println(act_title);
		if(act_title.equalsIgnoreCase(Exp_title)) {
			System.out.println("Testcase pass");
		}
		else {
			System.out.println("Testcase fail");
		}
		//

//		driver.close();
	}
	public void closeAUT() {
		driver.close();
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		SadBasicsExp9 obj=new SadBasicsExp9();
		obj.LanchAUT();
		obj.closeAUT();

	}

}
