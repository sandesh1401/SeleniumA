package handlingframespack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFramesDemoFive {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://letcode.in/frame");
		//First, we have to switch to parent frame
		driver.switchTo().frame("firstFr");
		WebElement innerFrame = driver.findElement(By.xpath("//iframe[@src='innerFrame']"));
		//Then we have to switch to child frame
		driver.switchTo().frame(innerFrame);
		driver.findElement(By.name("email")).sendKeys("arunmotoori@gmail.com");
		
	
	}

}
