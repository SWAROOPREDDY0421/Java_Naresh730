package Selinium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SadBasicsExp1 {
	public void LanchAUT() {
		System.setProperty("webdriver.chrome.driver", "C:\\Selinium Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://retail.onlinesbi.sbi/retail/login.htm");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SadBasicsExp1 obj=new SadBasicsExp1();
		obj.LanchAUT();

	}

}
