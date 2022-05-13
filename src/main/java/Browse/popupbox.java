package Browse;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class popupbox {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		driver.findElement(By.id("container_tasks")).click();
		driver.findElement(By.xpath("//div[@class='checkbox inactive']")).click();
		driver.findElement(By.xpath("//div[@class='delete button']")).click();
		//driver.findElement(By.xpath("//div[@class='cancelBtn greyButton']")).click();
		driver.findElement(By.xpath("class=keepWeeksStatuses")).click();
		
	

		

		

		
	}

}
