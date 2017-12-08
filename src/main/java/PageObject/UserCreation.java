package PageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UserCreation {
	
	WebDriver driver;
	public static String title="Users List";
	
	@FindBy(xpath=".//*[@class='container-fluid']/h4") WebElement heading;
	
	@FindBy(xpath=".//*[contains(text(),'Create User')]") WebElement CreateUser;
	
	@FindBy(xpath=".//*[@id='email']") WebElement email;
	@FindBy(xpath=".//*[@id='password']") WebElement password;
	@FindBy(xpath=".//*[@id='name']") WebElement name;
	@FindBy(xpath=".//*[@id='user_mobile_number']") WebElement mobile;
	@FindBy(xpath=".//*[@id='user_belong_tenant_id']") WebElement owner;
	@FindBy(xpath=".//*[@id='role']") WebElement roleDrop;
	
	@FindBy(xpath=".//*[@type='submit']") WebElement ADD;
	
	@FindBy(xpath=".//*[contains(text(),'Hemanth')]/../td[5]/a[1]") WebElement view;
	
	
	public UserCreation(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		this.driver=driver;
	}
	
	/*public void createUser()
	{
		
			System.out.println("Test Passed" + heading.getText());
			
			CreateUser.click();
			email.sendKeys("hemanth.s@pacewisdom.com");
			password.sendKeys("test123");
			name.sendKeys("Hemanth");
			mobile.sendKeys("1234567890");
			Select operator=new Select(owner);
			operator.selectByVisibleText("Digital Cable Network");
			
			Select roles=new Select(roleDrop);
			roles.selectByVisibleText("agent");
			
			ADD.click();
			
			
			//view.click();
			
   }*/
	
	public void viewTable()
	{
	 view.click();
	 
	 List<WebElement> list=driver.findElements(By.xpath("//table[@class='table table-bordered table-striped']/tbody/tr"));
	 for(WebElement row:list)
	 {
		 List<WebElement> cell=row.findElements(By.xpath("//table[@class='table table-bordered table-striped']/tbody/tr/td[1]"));
		 for(WebElement cells:cell)
		 {
			 System.out.print(cells.getText() +" : ");
		 }
		 
		 List<WebElement> cell_id=row.findElements(By.xpath("//table[@class='table table-bordered table-striped']/tbody/tr/td[2]"));
		 {
			 for(WebElement cellid:cell_id)
			 {
				 System.out.println(cellid.getText());
			 }
		 }
	 }
	}

}
