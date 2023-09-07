package Scripts;

import org.testng.annotations.Test;
import PomPages.SkillraryLoginPage;
import PomPages.TestingPage;
import PomPages.SkillraryDemoLoginPage;
import genericLibrary.BaseClass;
public class TestCase2 extends BaseClass
{
	@Test
	public void tc2() throws Throwable
	{
		SkillraryLoginPage s = new SkillraryLoginPage(driver);
		s.gearsbutton();
		s.skillrarydemoapplication();
		
		SkillraryDemoLoginPage sd=new SkillraryDemoLoginPage(driver);
		utilities.switchingTabs(driver);
		
		utilities.dropDown(sd.getCoursedd(),pdata.getPropertydata("coursedd") );
		TestingPage tp = new TestingPage(driver);
		utilities.dragDrop(driver, tp.getSeleniumTraning(), tp.getMycartbox());
			
	}

}
