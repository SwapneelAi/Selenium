package seleniumdemo_Day2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UnderstandingNavigation {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		// Maximize WebDriver
		driver.manage().window().maximize();
		
		// 1. Navigate to selenium == driver.get("https://www.selenium.dev/");
		driver.navigate().to("https://www.selenium.dev/");
		System.out.println("selenium opened");
		System.out.println(driver.getTitle());
		
		// 2. navigate to youtube
		driver.navigate().to("https://github.com/");
		System.out.println("Git opened");
		System.out.println(driver.getTitle());
		
		Thread.sleep(3000);
		// 3. navigate to back
		driver.navigate().back();
		System.out.println(driver.getTitle());
		
		Thread.sleep(3000);
		// 4. navigate to forword
		driver.navigate().forward();
		System.out.println(driver.getTitle());
		
		Thread.sleep(2000);
		// 5. Refresh 
		driver.navigate().refresh();
		System.out.println(driver.getTitle());
		
		Thread.sleep(2000);
		driver.quit();
	}
}