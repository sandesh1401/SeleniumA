package waitingmechanismpack;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitDemo {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.get("https://omayo.blogspot.com/");
		
		driver.findElement(By.className("dropbtn")).click();
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(3));
		WebElement flipkartOption = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Flipkart")));
		
		flipkartOption.click();
		
	}

}
