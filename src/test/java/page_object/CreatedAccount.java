package page_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreatedAccount extends Base_page 
{
	public CreatedAccount(WebDriver driver)
	{
		super(driver);
	}
	
	//WebElement
	
	@FindBy(name="firstname")WebElement firstname;
	@FindBy(name="lastname")WebElement surname;
	@FindBy(name="reg_email__")WebElement email;
	@FindBy(id="password_step_input")WebElement password;
	@FindBy(xpath="//label[normalize-space()='Male']")WebElement male_rd;
	@FindBy(name="websubmit")WebElement signup;
	
	//Action Methods
    public void setfnm(String fnm) {firstname.sendKeys(fnm);}
    public void setsurname(String sn) {surname.sendKeys(sn);}
    public void setemail(String eml) {email.sendKeys(eml);}
    public void setpw(String pw) {password.sendKeys(pw);}
    public void clkmale() {male_rd.click();}
    public void clksignup() {signup.click();}

}
