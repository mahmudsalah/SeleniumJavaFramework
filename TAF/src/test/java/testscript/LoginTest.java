package testscript;

import org.junit.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import utilities.RetryFaildTests;

public class LoginTest extends TestBase {
	
	HomePage Homeobject ;
	LoginPage LoginObject ;
	
	@Test(retryAnalyzer = RetryFaildTests.class)
	public void UserloginSucessfully() {
		
		Homeobject = new HomePage(driver);
		Homeobject.LoginPage();
		LoginObject = new LoginPage(driver);
		LoginObject.UserLogin("mahmoudsalah@test.com", "123489");
		Assert.assertTrue(false);
		
	}

}
