package Practice;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PopUps {

	public static void main(String[] args) throws Throwable 
	{
		WebDriverManager.edgedriver().setup();
		WebDriver driver= new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.irissoftware.com/");
		WebElement ele=driver.findElement(By.xpath("//a[text()='Services']"));
		Actions as=new Actions(driver);
		as.moveToElement(ele).perform();
		driver.findElement(By.xpath("(//a[text()='Automation'])[1]")).click();
		driver.findElement(By.xpath("//a[text()='Cancel']")).click();
		WebElement ia=driver.findElement(By.xpath("//img[@title='Intelligent Automation']"));
		Point cordinate=ia.getLocation();
		int x=cordinate.getX();
		int y=cordinate.getY();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(" + x + "," + y + ")");
		Thread.sleep(2000);
		js.executeScript("arguments[0].click();", ia);
		

		
		Thread.sleep(2000);
		//driver.close();
		
		
	}

}
