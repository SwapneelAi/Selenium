package seleniumdemo_Day2;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class UnderstandingDriver2 {

	public static void main(String[] args) throws InterruptedException {
		// WebDriver driver = new ChromeDriver();
		
		// driver.get("https://www.audemarspiguet.com/com/en/home.html");
		// driver.quit();
		
		Scanner scanner = new Scanner(System.in);
		
		WebDriver driver = null;	// does not reference any object
		System.out.print("Choose driver: ");
		String browserName = scanner.nextLine();
		
		switch(browserName) {
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;
		default:
				System.out.println("Invalid Browser");
				System.exit(0);
		}
		
		driver.manage().window().maximize();		// to maximize the window
		driver.get("https://github.com/");
		System.out.println("Title: " + driver.getTitle());
		System.out.println("Url: " + driver.getCurrentUrl());
		System.out.println("Page Source: " + driver.getPageSource());	// Returns the entire HTML source code of the current page
		Thread.sleep(4000);
		driver.quit();
		
		scanner.close();
		
		
		
	}

}
