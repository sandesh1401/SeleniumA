package handingbootstropdropdownpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootstrapDropdownDemo {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hdfcbank.com/");
		
		WebElement bootstrapDropdownField = driver.findElement(By.linkText("Select Product Type"));
		
		bootstrapDropdownField.click();
		
		driver.findElement(By.xpath("//li[text()='Accounts']")).click();

	}

}
