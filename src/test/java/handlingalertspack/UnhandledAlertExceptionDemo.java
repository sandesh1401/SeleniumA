package handlingalertspack;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class UnhandledAlertExceptionDemo {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("Elemental Selenium")).click();
		
	}

}
