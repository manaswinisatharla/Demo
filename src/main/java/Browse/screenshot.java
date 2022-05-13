package Browse;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

import io.github.bonigarcia.wdm.WebDriverManager;

public class screenshot {
	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		TakesScreenshot sh=(TakesScreenshot)driver;
		File src=sh.getScreenshotAs(OutputType.FILE);
		File dist=new File("C:\\Users\\DELL\\Desktop\\Javapgms//p1.jpg");
		Files.copy(src, dist);
		driver.findElement(By.xpath("smr"));
	}

}
