package Browse;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class iphone {
	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("q")).sendKeys("Iphone");
		Thread.sleep(3000);
String str=driver.findElement(By.xpath("//div[text()='APPLE iPhone 12 Mini (Blue, 64 GB)']")).getText();
Thread.sleep(3000);
System.out.println(str);


	}

}
