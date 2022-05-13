package Browse;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class javascript {
	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		Thread.sleep(3000);
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		Thread.sleep(3000);
		jse.executeScript("window.scrollBy(200,300);");
		
	}

}
