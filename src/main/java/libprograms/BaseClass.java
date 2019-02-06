package libprograms;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {
	
	
	public static  WebDriver driver;
	public Properties prop;
	
	public void startBrowser() throws Throwable {
		FileInputStream fis= new FileInputStream("C:\\Users\\kullu\\Downloads\\maven Selenium\\ram\\src\\main\\java\\config\\prope.properties");
		
		prop= new Properties();
		prop.load(fis);
		String bName= prop.getProperty("browser");
		if (bName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
			driver= new ChromeDriver(); 
		}
		else if (bName.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
			driver= new FirefoxDriver(); 
		}
		
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
}
