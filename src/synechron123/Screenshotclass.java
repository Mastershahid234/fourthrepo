package synechron123;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Screenshotclass extends Baseclass{
	
	public static void shot() throws IOException
	{
		TakesScreenshot shot = (TakesScreenshot) driver;
		 File src=shot.getScreenshotAs(OutputType.FILE);
		 File dst=new File("./screenshot/a.png");
		 FileUtils.copyFile(src, dst);
	}

}
