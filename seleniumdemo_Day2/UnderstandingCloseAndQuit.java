package seleniumdemo_Day2;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UnderstandingCloseAndQuit {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/popup.php");
		driver.manage().window().maximize();
		
		// Click link to open popup window
		driver.findElement(By.linkText("Click Here")).click();
		System.out.println(driver.getTitle());
		
		Thread.sleep(3000);
		// driver.close();		// java.util.NoSuchElementException
		
		/*
		 	Because this line closes the parent window immediately after the popup is opened, before:
		 	Collecting window handles.
		 	Switching to the child window.
		 	Interacting with either window.
		 */
		
		Set<String> handles = driver.getWindowHandles();
		System.out.println("Total windows: " + handles.size());
		
		Iterator<String> it = handles.iterator();
		String parentWindow = it.next();
		String childWindow = it.next();
		
		// Switch to child 
		driver.switchTo().window(childWindow);
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		driver.close();
		
		driver.switchTo().window(parentWindow);
		Thread.sleep(2000);

	}

}
