package Scripts;

import org.testng.annotations.Test;
import PomPages.SkillraryLoginPage;
import PomPages.SkillraryDemoLoginPage;
import PomPages.AddtoCartPage;

import genericLibrary.BaseClass;

public class TestCase1 extends BaseClass
{
	@Test
	public void tc1()
	{
		SkillraryLoginPage s =new SkillraryLoginPage(driver);
		s.gearsbutton();
		s.skillrarydemoapplication();
		utilities.switchingTabs(driver);
		SkillraryDemoLoginPage sd = new SkillraryDemoLoginPage(driver);
		utilities.mouseHover(driver, sd.getCoursetab() );
		sd.seleniumtrainingtab();
		AddtoCartPage d= new AddtoCartPage(driver);
		utilities.doubleClick(driver,d.getAddbtn());
		d.carttocartbtn();
		utilities.alertPopUp(driver);
	}

}
