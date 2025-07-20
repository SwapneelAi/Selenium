package seleniumdemo_Day1;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Understanding_Driver {

	public static void main(String[] args) {
		WebDriver driver = null;

		// Scanner
		Scanner sc = new Scanner(System.in);
		// Input from user
		System.out.print("Enter browser name (Chrome / Firefox / InternetExplorer): ");
		String webBrowser = sc.nextLine().trim().toLowerCase();		// all works chrome, CHROME, Chrome
		sc.close();

		try {
			switch (webBrowser) {
			case "chrome":
				driver = new ChromeDriver();
				break;
			case "firefox":
				driver = new FirefoxDriver();
				break;
			case "internetExplorer":
				driver = new InternetExplorerDriver();
				break;
			default:
				System.out.println("Unsupported browser: " + webBrowser);
				 return; // Stop execution if input is invalid or it will throw an exception
			}

			// Continue only if driver is initialized
			driver.get("https://github.com/");
			System.out.println("Title: " + driver.getTitle());
			System.out.println("Web Browser: " + driver.getCurrentUrl());
			Thread.sleep(5000);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (driver != null) {		// if I type safari then it remains null - nullPointerExceptino - prevents it
				driver.quit();
				System.out.println("🔒 Browser closed.");
			}
		}
	}
}