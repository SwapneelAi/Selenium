package seleniumdemo_Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UnderstandingCssSelectors {

	public static void main(String[] args) throws InterruptedException {
		WebDriver cssDriver = new ChromeDriver();
		cssDriver.get("https://www.saucedemo.com/");
		// cssDriver.manage().window().maximize();
		
		cssDriver.findElement(By.cssSelector("#user-name")).sendKeys("standard_user");		// cssDriver
		Thread.sleep(2000);
		cssDriver.findElement(By.id("password")).sendKeys("secret_sauce");		// By.id
		Thread.sleep(2000);
		// by class name -> class="submit-button btn_action" -> Find an element that has both submit-button and btn_action as classes
		cssDriver.findElement(By.cssSelector(".submit-button.btn_action")).click();	
		Thread.sleep(3000);
		// cssDriver.findElement(By.cssSelector("div[data-test='inventory-item-name']")).click();
		cssDriver.findElement(By.linkText("Sauce Labs Backpack")).click();
		
		Thread.sleep(3000);
		// conatains - specified substring
		cssDriver.findElement(By.cssSelector("button[name*='back-to'][data-test*='to-products']")).click();
		
		Thread.sleep(4000);
		// starts with
		cssDriver.findElement(By.cssSelector("button[data-test^=add-to-cart-sauce-labs-bike-light]")).click();
		
		Thread.sleep(4000);
		// ends with
		cssDriver.findElement(By.cssSelector("a[class$='cart_link']")).click();
		
		
		Thread.sleep(2000);
		// menu-button - exact match
		cssDriver.findElement(By.cssSelector("button[id='react-burger-menu-btn']")).click();
		
		Thread.sleep(2000);
		cssDriver.findElement(By.cssSelector("a#logout_sidebar_link")).click();

	}

}
