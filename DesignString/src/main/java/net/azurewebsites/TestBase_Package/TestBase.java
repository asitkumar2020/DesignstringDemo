package net.azurewebsites.TestBase_Package;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import net.azurewebsites.Util_Package.TestUtil;



public class TestBase {

	public static WebDriver driver;
	public static Properties prop;
	
	public TestBase() {
		
		try {
			prop = new Properties();
			
			FileInputStream fis = new FileInputStream("C:\\Users\\asit\\Downloads\\Five-master\\Five-master\\KENCentralBDDwithPOM\\src\\main\\java\\net\\azurewebsites\\Config_Package\\config.properties");
			
			
			prop.load(fis);
		} 
		catch (IOException e) 
		{
			e.printStackTrace(); 
		}
	}
		public static void initialization() {
			String browserName = prop.getProperty("browser");
			
			if(browserName.equals("chrome")) {
				
				
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\asit\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
				
				driver = new ChromeDriver();	
			}
			else if (browserName.equals("firefox")) {
				System.setProperty("webdriver.gecko.driver", "C:\\Users\\asit\\Desktop\\geckodriver-v0.23.0-win64\\geckodriver.exe");
				
				
				
				driver = new FirefoxDriver();
			}
			
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(TestUtil.page_Load_Timeout, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(TestUtil.implicit_Wait, TimeUnit.SECONDS);
			
			
			driver.get(prop.getProperty("url"));
			
		
			
			
		}
		
		
	}
	
	
	

