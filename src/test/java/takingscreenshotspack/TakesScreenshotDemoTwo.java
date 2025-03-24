package takingscreenshotspack;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TakesScreenshotDemoTwo {

	public static void main(String[] args) throws IOException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		
		File srcFile1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(srcFile1,new File(System.getProperty("user.dir")+"\\Screenshots\\One.png"));
		
		driver.findElement(By.linkText("jqueryui")).click();
		
		File srcFile2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(srcFile2,new File(System.getProperty("user.dir")+"\\Screenshots\\Two.png"));
		
		driver.quit();

	}

}
