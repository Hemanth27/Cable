package Cable;


import org.testng.annotations.Test;
import org.testng.annotations.Test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import PageObject.CommonElements;

import PageObject.UserCreation;



public class UserCreationTest extends BaseTest{

	public static Logger log =LogManager.getLogger(BaseTest.class.getName());
	
	
	
	@Test
	public void LoginTestone()
	{
		CommonElements ele=new CommonElements(driver);
		ele.Rolespermission_User();
		
		UserCreation us=new UserCreation(driver);
		us.viewTable();
	}
	

	
	
}
