package PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddtoCartPage 
{
	@FindBy(id="add")// bcz + button is double click we are using getter method not normal click
	private WebElement addbtn;
	
	@FindBy(id="//button[text()=' Add to Cart']")
	private WebElement cartbtn;
	
	public AddtoCartPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}

	public WebElement getAddbtn() 
	{
		return addbtn;
	}
	
	public void carttocartbtn()
	{
		cartbtn.click();
	}
}
