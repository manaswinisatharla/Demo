package batchexecutions;

import org.testng.annotations.Test;
import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Browse.Base_class;

public class Tc3 extends Base_class{
	@Test (groups= {"b","a"})
	public void tc3() throws IOException {
		driver.findElement(By.id("container_tasks")).click();
		driver.findElement(By.xpath("//input[@placeholder='start type name..'][2]")).sendKeys(d.Excelfetching("Sheet1", 1, 1));
	}

}
