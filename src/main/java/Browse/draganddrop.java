package Browse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class draganddrop {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		WebElement Src=driver.findElement(By.id("draggable"));
		WebElement dist=driver.findElement(By.id("droppable"));
		Actions act=new Actions(driver);
		act.dragAndDrop(Src, dist).perform();
	
	}

}
