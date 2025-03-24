package handlingmouseandkeyboardpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClickDemo {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		
		Actions actions = new Actions(driver);
		
		WebElement searchBoxField = driver.findElement(By.name("search"));
		
		actions.contextClick(searchBoxField).perform();
		

	}

}
