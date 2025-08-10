package alerts_day5;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UnderstandingAlerts {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		// driver.findElement(By.id("alertButton")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
//		Alert alert = driver.switchTo().alert();
//		System.out.println(alert.getText());
//		Thread.sleep(4000);
//		alert.accept();
//		Thread.sleep(4000);
		
		// confirmationButton
//		WebElement confirmationButton = driver.findElement(By.id("confirmButton"));
//		try {
//			confirmationButton.click();
//		}catch(Exception e) {
//			js.executeScript("arguments[0].scrollIntoView(true)", confirmationButton);
//			confirmationButton.click();
//		}
//		Thread.sleep(4000);
//		Alert confirmationAlert = driver.switchTo().alert();
//		confirmationAlert.dismiss();
//		System.out.println(driver.findElement(By.id("confirmButton")).getText());
//		Thread.sleep(4000);
		
		
		// alert after 5 sec after clicking
//		WebElement element1 = driver.findElement(By.id("timerAlertButton"));
//		try {
//			element1.click();
//		}catch(Exception e) {
//			js.executeScript("arguments[0].scrollIntoView(true)", element1);
//			element1.click();
//		}
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		wait.until(ExpectedConditions.alertIsPresent());
//		Alert alrt = driver.switchTo().alert();
//		System.out.println(alrt.getText());
//		Thread.sleep(3000);
//		alrt.accept();
		
		
		// Prompt Alert
		WebElement element2 = driver.findElement(By.id("promtButton"));
		try {
			element2.click();
		}catch(Exception e) {
			js.executeScript("arguments[0].scrollIntoView(true)", element2);
			element2.click();
		}
		Alert promptAlert = driver.switchTo().alert();
		promptAlert.sendKeys("ABC");
		System.out.println(promptAlert.getText());
		Thread.sleep(4000);
		promptAlert.accept();
		Thread.sleep(4000);
		
		// Validation
		WebElement validate = driver.findElement(By.id("promptResult"));
		String actualText = validate.getText();
		if(actualText.contains("ABC")) {
			 System.out.println("Validation passed!");
		}else {
			 System.out.println("Validation failed. Found: " + actualText);
		}
		
		
		driver.quit();

	}
}