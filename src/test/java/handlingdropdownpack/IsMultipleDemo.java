package handlingdropdownpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IsMultipleDemo {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		WebElement dropdownField = driver.findElement(By.id("drop1"));
		
		Select select = new Select(dropdownField);
		
		System.out.println(select.isMultiple());
		
		driver.quit();

	}

}
