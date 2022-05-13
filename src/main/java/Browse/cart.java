package Browse;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class cart {
public static void main(String[] args) throws InterruptedException {
	//System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Google\\Chrome\\Application\\chrome_proxy.exe");
	WebDriverManager.chromiumdriver().setup();
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	driver.findElement(By.xpath("//button[text()='✕']")).click();
	driver.findElement(By.name("q")).sendKeys("Iphone");
	
	driver.findElement(By.cssSelector("button[type='submit']")).click();
	Thread.sleep(3000);
	String str=driver.findElement(By.xpath("//div[text()='APPLE iPhone 12 Mini (Black, 64 GB)']")).getText();
	System.out.println(str);
	String str1=driver.findElement(By.xpath("//div[text()='APPLE iPhone 12 Mini (Black, 64 GB)']/../../div[2]/div/div/div")).getText();
	System.out.println(str1);
	
}
}
