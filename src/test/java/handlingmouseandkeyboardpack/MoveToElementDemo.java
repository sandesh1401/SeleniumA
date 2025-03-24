package handlingmouseandkeyboardpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElementDemo {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		WebElement blogsElement = driver.findElement(By.id("blogsmenu"));
		
		Actions actions = new Actions(driver);
		
		actions.moveToElement(blogsElement).perform();
		
		WebElement option2 = driver.findElement(By.xpath("//span[text()='SeleniumByArun']"));
		
		actions.moveToElement(option2).click().build().perform();
		
		
	}

}
