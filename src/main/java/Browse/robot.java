package Browse;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class robot {
	public static void main(String[] args) throws AWTException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("star");
		Robot r=new Robot();
		 r.keyPress(KeyEvent.VK_CONTROL);
		  r.keyPress(KeyEvent.VK_A);
		  r.keyRelease(KeyEvent.VK_CONTROL);
		  r.keyRelease(KeyEvent.VK_A);
		  r.keyPress(KeyEvent.VK_CONTROL);
		  r.keyPress(KeyEvent.VK_C);
		  r.keyRelease(KeyEvent.VK_CONTROL);
		  r.keyRelease(KeyEvent.VK_C);
		  r.keyPress(KeyEvent.VK_TAB);
		  r.keyRelease(KeyEvent.VK_TAB);
		  r.keyPress(KeyEvent.VK_CONTROL);
		  r.keyPress(KeyEvent.VK_V);
		  r.keyRelease(KeyEvent.VK_CONTROL);
		  r.keyRelease(KeyEvent.VK_V);
		 
	}

}
