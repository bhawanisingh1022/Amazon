package test_case;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import page_object.CreatedAccount;
import page_object.Home_page;

public class CreatedAc 
{
	WebDriver driver;
	@BeforeClass
	public void setup()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
	}
	@Test(priority=1)
	public void testca()
	{
		Home_page hp=new Home_page(driver);
		hp.clkca();
		
		CreatedAccount ca=new CreatedAccount(driver);
		ca.setfnm("bhawani");
		ca.setsurname("singh");
		ca.setemail("bhani123@gmail.com");
		ca.setpw("@1nothing");
		ca.clkmale();
		ca.clksignup();
		
	}
	@Test(priority=2)
	public void title()
	{
		String act_title=driver.getTitle();
		String exp_title="Facebook – log in or sign up";
		Assert.assertEquals(act_title, exp_title);
	}
	
	
	@AfterClass
	public void teardown() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.quit();
	}

}
