package synechron123;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

public class TestScript extends Baseclass {
	
	@Test
	public void test() throws InterruptedException, EncryptedDocumentException, IOException
	{
		Pomclass pom=new Pomclass(driver);
		pom.click1();
		Thread.sleep(200);
		pom.use();
		pom.all();
		pom.all1();
		pom.all2();
		String gotvalue=excelclass.data();
		pom.all3(gotvalue);
		pom.title();
		 
	}

}
