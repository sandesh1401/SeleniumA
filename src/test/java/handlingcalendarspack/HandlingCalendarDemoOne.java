package handlingcalendarspack;

import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlingCalendarDemoOne {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any day:");
		String expectedDay = scanner.nextLine();
		System.out.println("Enter any month:");
		String expectedMonth = scanner.nextLine();
		System.out.println("Enter any year:");
		String expectedYear = scanner.nextLine();
		scanner.close();
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		
		driver.findElement(By.id("datepicker")).click();
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ui-datepicker-div")));
		
		String currentMonth = driver.findElement(By.className("ui-datepicker-month")).getText();
		String currentYear = driver.findElement(By.className("ui-datepicker-year")).getText();
		
		while(!(currentMonth.equals(expectedMonth) && currentYear.equals(expectedYear))) {
			driver.findElement(By.xpath("//span[text()='Next']")).click();
			currentMonth = driver.findElement(By.className("ui-datepicker-month")).getText();
			currentYear = driver.findElement(By.className("ui-datepicker-year")).getText();
		}
		
		String dayXPath = "//td[@*='selectDay']/a[text()='"+expectedDay+"']";
		
		driver.findElement(By.xpath(dayXPath)).click();
		
	}

}
