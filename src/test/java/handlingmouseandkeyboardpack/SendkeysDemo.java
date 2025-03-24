package handlingmouseandkeyboardpack;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SendkeysDemo {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		
		Actions actions = new Actions(driver);
		
		for(int i=1;i<=23;i++) {
			actions.pause(Duration.ofSeconds(2)).sendKeys(Keys.TAB).build().perform();
		}
		
		actions.sendKeys("amotooricap1@gmail.com").pause(Duration.ofSeconds(2))
		.sendKeys(Keys.TAB).pause(Duration.ofSeconds(2)).sendKeys("12345")
		.pause(Duration.ofSeconds(2)).sendKeys(Keys.TAB).sendKeys(Keys.TAB)
		.pause(Duration.ofSeconds(2)).sendKeys(Keys.ENTER).build().perform();

	}

}
