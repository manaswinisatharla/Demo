package Browse;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class listbox {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin",Keys.TAB,"admin123",Keys.ENTER);
		driver.findElement(By.className("quickLinkText")).click();
		WebElement ele=driver.findElement(By.id("assignleave_txtLeaveType"));
		Select s=new Select(ele);
		//s.selectByIndex(4);
		//s.selectByValue("10");
		s.selectByVisibleText("CAN - Bereavement");
		
		
	
	}

}
