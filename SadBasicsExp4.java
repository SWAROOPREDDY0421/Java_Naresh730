package Selinium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SadBasicsExp4 {
	
	public void LanchAUT() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Selinium Drivers\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.close();
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		SadBasicsExp4 obj=new SadBasicsExp4();
		obj.LanchAUT();
	}

}
