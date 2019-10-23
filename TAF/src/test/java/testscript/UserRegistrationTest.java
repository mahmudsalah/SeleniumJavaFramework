package testscript;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.UserRegistrationPage;

public class UserRegistrationTest extends TestBase {
	
	HomePage Homeobject ;
	UserRegistrationPage RegistrationObject ;
	
	@Test
	public void UserRegistrationSucessfully() {
		
		Homeobject = new HomePage(driver);
		Homeobject.OpenRegistrationPage();
		RegistrationObject = new UserRegistrationPage(driver);
		RegistrationObject.UserRegistrastion("Mahmoud", "Salah", "mhmudsalah0011@test.com", "123456789");
		Assert.assertTrue(RegistrationObject.confirmmessage.getText().contains("Your registration completed"));
		
	}
	
	

}
