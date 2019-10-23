package testscript;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.ContuctUsPage;
import pages.HomePage;

public class ContactUsTest extends TestBase {
	
	HomePage Homeobject ;
	ContuctUsPage ContuctUsObject ;
	
	@Test
	public void ContactUsTestPage()
	{
		Homeobject = new HomePage(driver);
		Homeobject.ContactUs();
		ContuctUsObject = new ContuctUsPage(driver);
		ContuctUsObject.ContactUsTest("Mahmoud Salah", "mhmudsalah@test.com", "Test");
		Assert.assertTrue(ContuctUsObject.SucessMessage.getText().contains("Your enquiry has been successfully sent to the store owner"));
	}

}
