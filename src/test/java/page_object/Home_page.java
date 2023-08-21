package page_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Home_page extends Base_page
{
	//constructor
	
	public Home_page(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//a[normalize-space()=\"Create new account\"]")WebElement ca;
	
	public void clkca()
	{
		ca.click();
	}
	
	
	

}
