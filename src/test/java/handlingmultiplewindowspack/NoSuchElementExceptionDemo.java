package handlingmultiplewindowspack;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class NoSuchElementExceptionDemo {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		driver.findElement(By.linkText("Open a popup window")).click();
		
		String childWindowHeading = driver.findElement(By.xpath("//div[@class='example']/h3")).getText();
		
		System.out.println(childWindowHeading);
		
		driver.quit();

	}

}
