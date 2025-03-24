package handlingbootstrapmodaldialogpack;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlingBootstrapModelDialogDemo {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/howto/howto_css_modals.asp");
		
		driver.findElement(By.xpath("//button[@class='ws-btn w3-dark-grey']")).click();
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[text()='Modal Header']")));

		String textOne = driver.findElement(By.xpath("(//div[@class='w3-container']/p)[1]")).getText();
		System.out.println(textOne);
		
		driver.findElement(By.xpath("(//span[text()='×'])[10]")).click();
	
	}

}
