package handlingjquerydropdownpack;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class JQueryDropdownDemo {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		
		driver.findElement(By.id("justAnInputBox1")).click();
		
		driver.findElement(By.xpath("(//*[@class='multiplesFilter'])[2]")).sendKeys("choice 2");
		
		String choice21 = "//h3[text()='Multi Selection With Cascade Option Select']/following-sibling::div//span[contains(text(),'choice 2 1')]";
		String choice22 = "//h3[text()='Multi Selection With Cascade Option Select']/following-sibling::div//span[contains(text(),'choice 2 2')]";
		String choice23 = "//h3[text()='Multi Selection With Cascade Option Select']/following-sibling::div//span[contains(text(),'choice 2 3')]";
		
		driver.findElement(By.xpath(choice21)).click();
		driver.findElement(By.xpath(choice22)).click();
		driver.findElement(By.xpath(choice23)).click();
	}

}
