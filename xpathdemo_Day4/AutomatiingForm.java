package xpathdemo_Day4;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;


public class AutomatiingForm {
	
	public void selectGender(String gender, WebDriver driver) {
		int genderIndex = switch (gender.toLowerCase()) {
		case "male" -> 1;
		case "female" -> 2;
		case "other" -> 3;
		default -> -1;
		};
		
		if(genderIndex != -1) {
			String xpath = String.format("//label[@for='gender-radio-%d' and @class='custom-control-label']", genderIndex);
			driver.findElement(By.xpath(xpath)).click();
		}else {
	        System.out.println("Invalid gender input. Please enter Male, Female, or Other.");
		}
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		
		Scanner sc = new Scanner(System.in);
		
		driver.manage().window().maximize();
		// JavascriptExecutor - execution of JavaScript code
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		
		WebElement input = driver.findElement(By.xpath("//input[@id='firstName']"));
		input.sendKeys("Swapneel");
			
		Thread.sleep(2000);
		driver.findElement(By.id("lastName")).sendKeys("Deshpande");
		Thread.sleep(2000);
		// driver.findElement(By.cssSelector("input[placeholder='name@example.com']")).sendKeys("swapneel@yahoo.com");
		driver.findElement(By.cssSelector("input[placeholder*='name@example.com']")).sendKeys("swapneel@yahoo.com");
		Thread.sleep(3000);
/*		
		// Select Gender
//		System.out.println("Enter Gender: ");
//		String gender = sc.nextLine();
		
		String gender = "Male";
		
		if(gender.equals("Male")) {
			driver.findElement(By.xpath("//label[@for='gender-radio-1' and @class='custom-control-label']")).click();
		}else if(gender.equals("Female")){
			driver.findElement(By.xpath("//label[@for='gender-radio-2' and @class='custom-control-label']")).click();
		}else if (gender.equalsIgnoreCase("Other")) {
            driver.findElement(By.xpath("//label[@for='gender-radio-3' and @class='custom-control-label']")).click();
        } else {
            System.out.println("Invalid gender input. Please enter Male, Female, or Other.");
        }
*/
		
/*
		String gender = "Male";
		// using map
		Map<String, String> genderMap = Map.of(
				"Male", "//label[@for='gender-radio-1' and @class='custom-control-label']",
				"Female", "//label[@for='gender-radio-2' and @class='custom-control-label']",
				"Other", "//label[@for='gender-radio-3' and @class='custom-control-label']"		
		);
		
		String genderKey = gender.substring(0, 1).toUpperCase() + gender.substring(1).toLowerCase();
		
		if(genderMap.containsKey(genderKey)) {
			driver.findElement(By.xpath(genderMap.get(genderKey))).click();
		}else {
		    System.out.println("Invalid gender input. Please enter Male, Female, or Other.");
		}
		
*/
		Thread.sleep(1000);
		AutomatiingForm form = new AutomatiingForm();
		form.selectGender("Male", driver);
		
		Thread.sleep(1000);
		// Mobile number
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='userNumber']")).sendKeys("7878983478");
		
		Thread.sleep(1000);
		// Date-of-birth - Month
		driver.findElement(By.id("dateOfBirthInput")).click();
		
		WebElement monthElement = driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']"));
		monthElement.click();
		Select monthSelect = new Select(monthElement);
		monthSelect.selectByValue("10");
		
		Thread.sleep(1000);
		// Date-of-birth - Year
		WebElement yearElement  = driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']"));
		yearElement.click();
		Select yearSelect = new Select(yearElement);
		yearSelect.selectByVisibleText("2022");
		
		// Date-of-birth - Day
		driver.findElement(By.xpath("//div[@class='react-datepicker__day react-datepicker__day--015']")).click();
		
		// subject
		Thread.sleep(2000);
		WebElement subjectText = driver.findElement(By.id("subjectsInput"));
		subjectText.sendKeys("English");
		subjectText.sendKeys(Keys.ENTER);
		// Hobbies
		// driver.findElement(By.xpath("//label[@for='hobbies-checkbox-1' and @class='custom-control-label']")).click();
	
/*
		String hobbies = "Reading";
		Map<String, String> hobbiesMap = Map.of(
				"Sport", "//label[@for='hobbies-checkbox-1' and @class='custom-control-label']",
				"Reading", "//label[@for='hobbies-checkbox-2' and @class='custom-control-label']",
				"Music", "//label[@for='hobbies-checkbox-3' and @class='custom-control-label']"
		);
		
		String hobbiesKey = hobbies.substring(0, 1).toUpperCase() + hobbies.substring(1).toLowerCase();
		
		if(hobbiesMap.containsKey(hobbiesKey)) {
			driver.findElement(By.xpath(hobbiesMap.get(hobbiesKey))).click();
		}else {
		    System.out.println("Invalid hobby input. Please enter Sport, Reading, or Music.");
		}
*/
		
		WebElement hobbyElement = driver.findElement(By.cssSelector("label[for='hobbies-checkbox-1']"));
		hobbyElement.click();
		
		// Select Picture
		driver.findElement(By.xpath("//input[@id='uploadPicture' and @class='form-control-file']")).sendKeys("D:\\Leo_Lane\\CuteCat.jpeg");
		
		// Address
		driver.findElement(By.id("currentAddress")).sendKeys("Pune");
		
		Thread.sleep(2000);
		// State
		WebElement stateElement = driver.findElement(By.xpath("//div[@class=' css-1wa3eu0-placeholder' and text()='Select State']"));
		stateElement.click();
		Thread.sleep(1000);
		driver.findElement(By.id("react-select-3-input")).sendKeys("Rajasthan");
		driver.findElement(By.id("react-select-3-input")).sendKeys(Keys.ENTER);
		
		// Select City
		WebElement cityDropdown = driver.findElement(By.xpath("//div[text()='Select City']"));
		cityDropdown.click();
		Thread.sleep(1000);

		// Enter city name and press Enter
		WebElement cityInput = driver.findElement(By.id("react-select-4-input"));
		cityInput.sendKeys("Jaipur");
		cityInput.sendKeys(Keys.ENTER);
		
		Thread.sleep(2000);
		WebElement button = driver.findElement(By.id("submit"));
		button.click();
		js.executeScript("arguments[0].scrollIntoView(true);", button);
		

		
		sc.close();    // Close scanner
				
	}

}
