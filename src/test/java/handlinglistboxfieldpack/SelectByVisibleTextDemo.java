package handlinglistboxfieldpack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectByVisibleTextDemo {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		WebElement listBoxField = driver.findElement(By.id("multiselect1"));
		
		Select select = new Select(listBoxField);
		
		List<WebElement> options = select.getOptions();
		
		for(int i=0;i<options.size();i++) {
			select.selectByIndex(i);
		}
		
//		select.selectByVisibleText("Volvo");
//		select.selectByVisibleText("Hyundai");
//		select.selectByVisibleText("Audi");
		
//		select.selectByIndex(0);
//		select.selectByIndex(3);
		
//		select.selectByValue("volvox");
//		select.selectByValue("Hyundaix");
		
//		select.selectByVisibleText("Volvo");
//		select.selectByIndex(3);
//		select.selectByValue("Hyundaix");
		
	}

}
