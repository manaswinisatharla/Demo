package Browse;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebElement;

import io.github.bonigarcia.wdm.WebDriverManager;

public class rrr {
	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		Thread.sleep(3000);
		driver.findElement(By.name("q")).sendKeys("RRR");
		Thread.sleep(3000);
		List<WebElement>i=(List<WebElement>) driver.findElement(By.xpath("//div[@class='0BMEnb']/ul/li"));
	
	}

}
