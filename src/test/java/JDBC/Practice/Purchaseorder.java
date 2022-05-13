package JDBC.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Purchaseorder {
	@Test
	public void purchaseorder()
	{
		
		WebDriver d=new ChromeDriver();
		
		d.get("http://localhost:8888");
		//driver.findElement(By.xpath("//a[text()='Purchase Order']")).click();
		//driver.findElement(By.xpath("//a[text()='Create a Purchase Order']")).click();
		
		
	}

}
