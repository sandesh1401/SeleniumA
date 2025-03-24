package exceptionspack;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class NoSuchElementExceptionDemo {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		driver.findElement(By.id("ta123xyz")).sendKeys("Arun Motoori");

	}

}
