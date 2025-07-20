package seleniumdemo_Day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UnderstandingDriver {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		// Open a web site
		driver.get("https://www.google.com/");
		// driver.quit();		// It quits immediately after opening chrome
		

        // Print page title and URL
         System.out.println("Title: " + driver.getTitle());
         System.out.println("URL: " + driver.getCurrentUrl());
		
		try {
			// Wait for 5 seconds (just to keep browser open)
			Thread.sleep(5000);
		}catch(Exception e) {
			e.printStackTrace();
		}
		driver.quit();
         
         Thread.sleep(5000);
	}
}