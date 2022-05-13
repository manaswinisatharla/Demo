package Browse;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.opentelemetry.sdk.metrics.data.Data;
import net.bytebuddy.agent.builder.AgentBuilder.FallbackStrategy.Simple;

public class calendar {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://jqueryui.com/datepicker");
Calendar cal=Calendar.getInstance();
Date  da=cal.getTime();
System.out.println(da);
SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/YYYY");
String str=sdf.format(da);
System.out.println(str);
	}

}
