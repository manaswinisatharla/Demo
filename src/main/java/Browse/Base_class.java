package Browse;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import testcase.Data_fetching;

public class Base_class {
	public Data_fetching d=new Data_fetching();
	protected WebDriver driver;
	@BeforeClass
	public void open_url() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
	}
	@BeforeMethod
	public void login() {
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager",Keys.ENTER);
	}
	@Test
	public void tc1() throws Exception{
		driver.findElement(By.id("tasksearchcontrol.field")).sendKeys("data");
	}
	@AfterMethod
	public void logout() {
		
	}
	@AfterClass
	public void close() {
		driver.close();
	}

}
