package handlinglightboxpackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlingLightboxDemo {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.justdial.com/");
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		WebElement mobileNumberField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("fmobile")));
		
		mobileNumberField.sendKeys("9123456789");
		
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("Maybe Later")).click();

	}

}
