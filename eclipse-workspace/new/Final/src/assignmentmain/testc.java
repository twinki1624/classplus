package assignmentmain;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import mainc.formpage;
import mainc.functionperform;
import mainc.Maincl;

public class testc extends Maincl {

	@BeforeTest
	public void initialize() throws IOException {

		driver = initializeDriver();
	}

	@Test(priority = 0)
	public void starttest() //search element
	{
		driver.get(prop.getProperty("url"));
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		functionperform f = new functionperform(driver);
		f.searchcomputer().sendKeys(prop.getProperty("searchword"));
		f.filterbycomputername().click();
		System.out.println("firstrowfirstelement is: " + f.firstrowelement().getText());
		if (f.firstrowelement().getText().toLowerCase().contains(prop.getProperty("searchword").toLowerCase())) {
			System.out.println("Search successfully implemented");
		} else {
			System.out.println("Search failed");
		}
	}

	@Test(priority = 1)
	public void secondtest() //create element
	{
		driver.get(prop.getProperty("url"));
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		formpage fp = new formpage(driver);
		fp.createcompform().click();
		fp.entercomputername().sendKeys(prop.getProperty("computername"));
		fp.introduceddate().sendKeys(prop.getProperty("introduceddatee"));
		fp.discontinueddate().sendKeys(prop.getProperty("discontinueddatee"));
		fp.selectcompdrop().click();
		Select s = new Select(fp.selectcompdrop());
		s.selectByIndex(5);
		fp.createcomputerbtn().click();
		functionperform gf = new functionperform(driver);
		if (gf.messagesuccess().getText().contains("Done!vvvv")) {
			System.out.println("Created Successfully");
		} else
			System.out.println("failed");
	}

	@Test(priority = 2)
	public void thirdtest() // edit element
	{
		driver.get(prop.getProperty("url"));
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		functionperform g = new functionperform(driver);
		formpage fpni = new formpage(driver);
		System.out.println(prop.getProperty("url") + " Successfully opened before click");
		g.firstrowelement().click();
		driver.getCurrentUrl();
		System.out.println(driver.getCurrentUrl() + " Successfully opened after click");
		fpni.discontinueddate().sendKeys(Keys.chord(Keys.CONTROL, "a"), prop.getProperty("introduceddatee"));
		fpni.editcompsavebtn().click();
		// System.out.println("Successfully edited");
	}

	@Test(priority = 3)
	public void fourthtest()//delete element 
	{
		driver.get(prop.getProperty("url"));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		functionperform g = new functionperform(driver);
		//formpage fpni = new formpage(driver);
		System.out.println(prop.getProperty("url") + " Successfully opened before click");		
			try{
				g.eletodel().click();
			driver.getCurrentUrl();
			System.out.println(driver.getCurrentUrl() + " Successfully opened after click");
			formpage fpni = new formpage(driver);
			fpni.deletecomputer().click();
			if (g.messagesuccess().getText().contains("Done!")) {
				System.out.println("Created Successfully");
			} 
		} 
		catch (Exception e){
			System.out.println("An exceptional case. Hence Failed");
		}
	}

	@AfterTest
	public void teardown() {

		driver.close();
		driver = null;

	}

}
