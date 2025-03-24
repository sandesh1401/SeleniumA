package handlingmouseandkeyboardpack;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyUpKeyDownDemo {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		Actions actions = new Actions(driver);
		
		WebElement jqueryUILink = driver.findElement(By.linkText("jqueryui"));
		
		actions.keyDown(Keys.CONTROL).moveToElement(jqueryUILink).click().keyUp(Keys.CONTROL).build().perform();

	}

}
