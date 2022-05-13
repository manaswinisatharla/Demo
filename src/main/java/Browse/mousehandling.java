package Browse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class mousehandling {
	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		WebElement ele=driver.findElement(By.className("gb_d"));
		Thread.sleep(2000);
		Actions act=new Actions(driver);
	//	act.moveToElement(ele).perform();
		act.contextClick(ele).perform();
		
		
	}

}
