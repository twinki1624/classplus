package mainc;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class functionperform {
	public WebDriver driver;
	
	By serachfiled=new By.ByXPath("//input[@id='searchbox']");
	By filterbyname =new By.ByCssSelector("input[class='btn primary']");
	By createcomp =new By.ByLinkText("Add a new computer");
	By firstelement = By.xpath("//a[@href='/computers/381']");
	By firstcellfromrow=new By.ByXPath("//a[@href='/computers/593']");
	By checkdel=new By.ByXPath("//a[@href='/computers/313']");
	By message=new By.ByCssSelector("div strong");
	
	public functionperform(WebDriver driver) {
		this.driver=driver;	
	}
	
	public WebElement searchcomputer()
	{
		return driver.findElement(serachfiled);
	}
	
	public WebElement eletodel()
	{
		return driver.findElement(checkdel);
	}
	
	
	
	public WebElement messagesuccess()
	{
		return driver.findElement(message);
	}

	
	public WebElement firstrowelement()
	{
		return driver.findElement(firstelement);
	}
	
	
	public WebElement filterbycomputername()
	{
		return driver.findElement(filterbyname);
	}
	public WebElement createcomputer()
	{
		return driver.findElement(createcomp);
	}
	public WebElement openforedit()
	{
		return driver.findElement(firstcellfromrow);
	}
	

}
