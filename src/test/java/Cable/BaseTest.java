package Cable;

import org.testng.annotations.AfterMethod;
import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import PageObject.CommonElements;
import PageObject.LoginPage;
import resources.BasePage;

public class BaseTest extends BasePage{
	
	@BeforeTest
	public void Intializebrowser() throws IOException
	{
		driver=intializeDriver();
		driver.get(prop.getProperty("url"));
		LoginPage page=new LoginPage(driver);
		page.validLogin("admin@gmail.com", "123456");
		
	}
	
	@AfterMethod
	@AfterTest
	public void tearDown()
	{
		CommonElements cm=new CommonElements(driver);
		cm.Logout();
		
		driver.close();
	}

}
