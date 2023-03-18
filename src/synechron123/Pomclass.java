package synechron123;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Pomclass extends  Baseclass {
	
	
	//public WebDriver driver;
	
	
	@FindBy(xpath="//button[text()='✕']")
	private WebElement btn;
	
	
	@FindBy(xpath="//div[text()='Fashion']")
	private WebElement btn1;
	
	
	@FindBy(xpath="//a[text()='All']")
	private WebElement btn2;
	
	
	@FindBy(xpath="//span[text()='Clear all']")
	private WebElement btn3;
	
	 
	
	@FindBy(xpath="//div[text()='Price -- Low to High']")
	private WebElement btn4;
	
	
	@FindBy(xpath="//input[@title='Search for products, brands and more']")
	private WebElement btn5;
	
	
	
	
	Pomclass(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	
	public void click1()
	{
		btn.click();
	}
	
	public void use()
	{
		Actions action=new Actions(driver); 
		action.moveToElement(btn1).perform();
	}
	
	public void all()
	{
		btn2.click();
	}
	
	public void all1()
	{
		btn3.click();
	}
	
	public void all2()
	{
		btn4.click();
	}
	
	public void all3(String gotvalue)
	{
		 
		btn5.sendKeys(gotvalue);
		
	}
	
	public void title()
	{
	String title=driver.getTitle();
	System.out.println("title is"+" "+title);
	Assert.assertEquals( title, "Topwear -  Topwear For Men, Women & Kids Online at Best Prices In India | Flipkart.com");

}
	
	
}
