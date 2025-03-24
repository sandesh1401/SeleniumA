package handlingframespack;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFramesDemoFour {

	public static void main(String[] args) {
		
	    ChromeDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://jqueryui.com/checkboxradio/");
	    
	    driver.switchTo().frame(0);
	    
	    driver.findElement(By.xpath("//label[contains(text(),'New York')]")).click();

	}

}
