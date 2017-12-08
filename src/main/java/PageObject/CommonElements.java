package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CommonElements {
	WebDriver driver;
	
	@FindBy(xpath=".//*[@class='navbar-nav ml-auto']/li/a") WebElement logout;
	@FindBy(xpath="(.//*[contains(text(),'Logout')])[1]") WebElement logouttext;
	@FindBy(xpath="(.//*[contains(text(),'Logout')])[2]") WebElement logout2;
	
	@FindBy(xpath=".//*[@id='exampleAccordion']/li[2]/a") WebElement roles_permission;
	@FindBy(xpath=".//*[@id='exampleAccordion']/li[2]/ul/li[1]") WebElement roles;
	@FindBy(xpath=".//*[@id='exampleAccordion']/li[2]/ul/li[2]") WebElement permission;
	@FindBy(xpath=".//*[@id='exampleAccordion']/li[2]/ul/li[3]") WebElement user;
	
	
	@FindBy(xpath=".//*[@id='exampleAccordion']/li[4]/a") WebElement managaeuser;
	
	
	public CommonElements(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	public void Logout()
	{
		logout.click();
		System.out.println(logouttext.getText());
		
		logout2.click();
		
	}
	
	public void Rolespermission_Roles()
	{
		roles_permission.click();
		roles.click();
	}
	
	public void Rolespermission_Permission()
	{
		roles_permission.click();
		permission.click();
	}
	
	public void Rolespermission_User()
	{
		roles_permission.click();
		user.click();
	}
	
	public void ManageOwners()
	{
		managaeuser.click();
	}
	

}
