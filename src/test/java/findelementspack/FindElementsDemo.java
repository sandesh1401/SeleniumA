package findelementspack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsDemo {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		List<WebElement> elements = driver.findElements(By.xpath("//h2[text()='Ordered List']/following-sibling::div//li"));

		//System.out.println(elements.size());
		
//		for(int i=0;i<elements.size();i++) {
//			System.out.println(elements.get(i).getText());
//		}
		
		for(WebElement element : elements) {
			System.out.println(element.getText());
		}
		
		driver.quit();
		
	}

}
