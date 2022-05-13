package batchexecutions;

import org.testng.annotations.Test;
import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Browse.Base_class;

public class Tc1 extends Base_class {
	@Test (groups= {"c","a"})
	public void tc1() throws Exception {
	//	Driver.findelement(By.id("task searchControl_Field")).sendKeys(d.Excelfetching("Book1",1,1));
		driver.findElement(By.id("task searchControl_Field")).sendKeys(d.Excelfetching("Book1",1,1));
}

}

