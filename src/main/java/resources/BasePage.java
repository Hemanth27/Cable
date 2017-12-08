package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasePage {
	
	public static WebDriver driver;
	public Properties prop;
	
	public WebDriver intializeDriver() throws IOException 
	{
		prop=new Properties();
		FileInputStream fis=new FileInputStream("/home/pace/Music/ReSelenium-Webdriver/CableProject/src/main/java/resources/data.properties");
		prop.load(fis);
		String browserName=prop.getProperty("browser");
		System.out.println(browserName);
		
		if(browserName.equals("firefox"))
		{
			driver=new FirefoxDriver();
		}
		
		else if(browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "/home/pace/Downloads/chromedriver.exe");
			driver=new ChromeDriver();
		}
		
		else
		{
			System.out.println("No Browser match Found");
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		return driver;
		
	}
	
	public void getScreenShoot(String result) throws IOException
	{
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,new File("/home/pace/Desktop" +result +"screenshot.png"));
	}
	

}
