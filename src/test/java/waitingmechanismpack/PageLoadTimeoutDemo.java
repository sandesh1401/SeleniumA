package waitingmechanismpack;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

public class PageLoadTimeoutDemo {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(2));
		driver.get("https://selenium143.blogspot.com/");

	}

}
