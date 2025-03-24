package tagnamepack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagNameDemo {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/");

		//List<WebElement> links = driver.findElements(By.xpath("//a"));
		List<WebElement> links = driver.findElements(By.tagName("a"));
		int i=1;
		for(WebElement link : links) {
			System.out.print(i+" - ");
			System.out.println(link.getAttribute("href"));
			i++;
		}
		
		driver.quit();
		
	}

}
