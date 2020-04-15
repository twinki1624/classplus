package mainc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.By.ByXPath;

public class formpage {

	public WebDriver driver;
	
	By addcompbtn=new By.ByLinkText("Add a new computer");
	By compname=new By.ByCssSelector("input[id='name']");
	By introdate=new By.ByXPath("//input[@id='introduced']");
	By discdate=new By.ById("discontinued");
	By selcomp=new By.ByName("company");
	By createcomp=new By.ByXPath("//input[@class='btn primary']");
	By cancel=new By.ByLinkText("Cancel");
	By delitem=new By.ByCssSelector("input[class='btn danger']");
	By edititem=new By.ByXPath("//input[@value='Save this computer']");
	
	public formpage(WebDriver driver) {
		this.driver=driver;
		
	}
	
	public WebElement createcompform()
	{
		return driver.findElement(addcompbtn);
	}
	
	public WebElement entercomputername()
	{
		return driver.findElement(compname);
	}
	public WebElement introduceddate()
	{
		return driver.findElement(introdate);
	}
	public WebElement discontinueddate()
	{
		return driver.findElement(discdate);
	}
	public WebElement selectcompdrop()
	{
		return driver.findElement(selcomp);
	}
	public WebElement createcomputerbtn()
	{
		return driver.findElement(createcomp);
	}
	public WebElement cancelcreation()
	{
		return driver.findElement(cancel);
	}
	public WebElement deletecomputer()
	{
		return driver.findElement(delitem);
	}
	public WebElement editcompsavebtn()
	{
		return driver.findElement(edititem);
	}
	
}
