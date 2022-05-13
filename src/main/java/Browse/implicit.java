package Browse;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class implicit {
	public static void main(String[] args) {
		Random r=new Random();
		int x=r.nextInt(1000);
		System.out.println(x);
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		driver.findElement(By.id("container_tasks")).click();
		driver.findElement(By.cssSelector("div[class='title ellipsis']")).click();
		driver.findElement(By.cssSelector("div[class='item createNewCustomer']")).click();
		driver.findElement(By.cssSelector("input.inputFieldWithPlaceholder.newNameField.inputNameField")).sendKeys("pushparaj2"+x);
		driver.findElement(By.cssSelector("textarea[placeholder='Enter Customer Description']")).sendKeys("movie");
		driver.findElement(By.cssSelector("div[class='components_button withPlusIcon']")).click();
		driver.findElement(By.id("logoutLink")).click();
		
	}

}
