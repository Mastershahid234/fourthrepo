package synechron123;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Baseclass implements url {
	
	public static WebDriver driver;
	
	@BeforeMethod()
	public void first()
	{
		System.setProperty(key, value);
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(1000,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(url);
		
}
	
	
	@AfterMethod()
	public void close(ITestResult result) throws IOException
	{
		if(ITestResult.FAILURE==result.getStatus())
		{
			Screenshotclass.shot();
		}
	}

}
