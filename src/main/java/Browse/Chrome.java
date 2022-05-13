package Browse;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.opera.OperaDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Chrome {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("India");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='eIPGRd'][last()]")).click();
		


	}

}
