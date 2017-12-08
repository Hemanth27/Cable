package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	
	@FindBy(xpath=".//*[@name='email']") WebElement email;
	@FindBy(xpath=".//*[@name='password']") WebElement password;
	@FindBy(xpath=".//*[@type='submit']") WebElement login;
	@FindBy(xpath=".//*[@class='card-body']/form/div[1]/span/strong") WebElement invalidtext;
	
	@FindBy(xpath=".//*[@type='checkbox']") WebElement checkbox;
	
	public LoginPage(WebDriver driver)
	
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	public void validLogin(String emailId,String pwd)
	{
		email.sendKeys(emailId);
		password.sendKeys(pwd);
		login.click();
		
		
	}
	
	/*public void inValidLogin(String emailwrong,String pwdwrong)
	{
		email.sendKeys(emailwrong);
		password.sendKeys(pwdwrong);
		login.click();
		
		if(invalidtext.isDisplayed())
		{
			System.out.println(invalidtext + " ==" +" Test Passed");
			
		}
		else
		{
			System.out.println("Test Failed");
		}
	}*/

}
