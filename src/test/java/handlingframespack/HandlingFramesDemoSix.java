package handlingframespack;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFramesDemoSix {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/nested_frames");
		
		driver.switchTo().frame("frame-top");
		driver.switchTo().frame("frame-left");
		String l = driver.findElement(By.xpath("//body")).getText();
		System.out.println(l);
		
		driver.switchTo().parentFrame();
		driver.switchTo().frame("frame-middle");
		String m = driver.findElement(By.id("content")).getText();
		System.out.println(m);
		
		driver.switchTo().parentFrame();
		driver.switchTo().frame("frame-right");
		String r = driver.findElement(By.xpath("//body")).getText();
		System.out.println(r);
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame("frame-bottom");
		String b = driver.findElement(By.xpath("//body")).getText();
		System.out.println(b);
		
		driver.quit();
		

	}

}
