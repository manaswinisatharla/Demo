package Browse;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class zomoto {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.zomato.com/");
		Thread.sleep(3000);
		
		driver.get("https://www.amazon.com/");
		Thread.sleep(3000);
		String url=driver.getCurrentUrl();
		System.out.println(url);
		driver.get("https://www.zomato.com/");
		Thread.sleep(3000);
		String url1=driver.getCurrentUrl();
		System.out.println(url1);
		driver.get("https://www.amazon.com/");
		Options opt=driver.manage();
		Window win=opt.window();
		Point p=new Point(400, 500);
		win.setPosition(p);
		
	
		
	
		
		
	

	}

}
