package mainc;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Maincl {
	
	public static WebDriver driver;
	public Properties prop;

public WebDriver initializeDriver() throws IOException
{
	prop = new Properties();
	//WebDriver driver;
	//Properties prop;
	FileInputStream fis = new FileInputStream((System.getProperty("user.dir"))+"\\resources\\data.properties");
	System.out.println(((System.getProperty("user.dir"))+"\\resources\\data.properties"));
		prop.load(fis);
		String browserName = prop.getProperty("browser");
		System.out.println(browserName);

		if (browserName.equals("chrome")) {

			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+ "\\resources\\chromedriver.exe");
			driver = new ChromeDriver();
		} 
		else if (browserName.equals("firefox")) {
			System.setProperty("webdriver.firefox.driver",System.getProperty("user.dir") + "\\resources\\geckodriver.exe");
			driver = new FirefoxDriver();
		}

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	return driver;


	}

	
}
