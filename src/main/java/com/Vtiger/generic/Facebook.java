package com.Vtiger.generic;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {
	@Test
	public void Facebook() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://Facebook.com");
		Thread.sleep(3000);
		String title=driver.getTitle();
		System.out.println(title);
	
		
	}

}
