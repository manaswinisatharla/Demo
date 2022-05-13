package batchexecutions;

import org.testng.annotations.Test;
import java.io.IOException;
import java.sql.Driver;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Browse.Base_class;

public class Tc2 extends Base_class {
	@Test (groups= {"b","c"})
	public void tc2() throws IOException {
		driver.findElement(By.id("container_tasks")).click();
		driver.findElement(By.cssSelector("input[placeholder='start typing name...']")).sendKeys(d.Excelfetching("Sheet1", 1, 1));
		
	}

}
