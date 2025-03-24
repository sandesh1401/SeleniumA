package handlinglistboxfieldpack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetAllSelectedOptionsDemo {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		WebElement listBoxField = driver.findElement(By.id("multiselect1"));
		
		Select select = new Select(listBoxField);
		
		select.selectByIndex(0);
		select.selectByIndex(2);
		
		List<WebElement> selectedOptions = select.getAllSelectedOptions();
		
		for(WebElement option : selectedOptions) {
			System.out.println(option.getText());
		}
		
		driver.quit();

	}

}
