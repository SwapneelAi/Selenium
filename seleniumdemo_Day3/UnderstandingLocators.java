package seleniumdemo_Day3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UnderstandingLocators {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		Thread.sleep(2000);
		driver.findElement(By.className("btn_action")).click();
		Thread.sleep(2000);
		driver.findElement(By.id(" Labs Backpack")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		List<WebElement> wl = driver.findElements(By.tagName("a"));
		System.out.println(wl.size());
		
		Thread.sleep(2000);
		driver.findElement(By.id("react-burger-menu-btn")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Logout")).click();
		
		// PartialLinkText
		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();
		driver.findElement(By.partialLinkText("Sign")).click();
		
		List<WebElement> wedriverElements= driver.findElements(By.tagName("a"));
		System.out.println(wedriverElements.size());
		driver.findElement(By.partialLinkText("Mobile Number")).sendKeys("9714526478");
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Mobile Number")).clear();
		
	}

}
