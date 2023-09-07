package PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestingPage 
{
	@FindBy(xpath="(//a[text()='Selenium Training'])[2]")
	private WebElement seleniumtraning;
	
	@FindBy(id="mycart")
	private WebElement mycartbox;
	
	@FindBy(xpath="(//i[@class='fa fa-facebook'])[2]")
	private WebElement facebook;
	
	public TestingPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		
	}

	public WebElement getSeleniumTraning() 
	{
		return seleniumtraning;
	}

	public WebElement getMycartbox() {
		return mycartbox;
	}

	public void facebookoptn()
	{
		facebook.click();
	}
	
	
	

}
