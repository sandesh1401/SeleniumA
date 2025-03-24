package handlingmouseandkeyboardpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickAndHoldDemo {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
		Actions actions = new Actions(driver);
		
		WebElement olsoOption = driver.findElement(By.id("box1"));
		WebElement norwayOption = driver.findElement(By.id("box101"));
		
		actions.clickAndHold(olsoOption).moveToElement(norwayOption).release().build().perform();

	}

}
