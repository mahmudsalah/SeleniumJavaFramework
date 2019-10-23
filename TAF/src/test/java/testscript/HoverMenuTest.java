package testscript;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;

public class HoverMenuTest extends TestBase {
	
	HomePage Homeobject ;
	
	
	@Test
	public void HoverMenu()
	{
		Homeobject = new HomePage(driver);
		Homeobject.HoverMenu();
		Assert.assertTrue(driver.getCurrentUrl().contains("notebooks"));
	}

}
