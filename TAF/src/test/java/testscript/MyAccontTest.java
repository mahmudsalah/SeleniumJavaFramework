package testscript;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import pages.MyAccountPage;
import pages.UserRegistrationPage;

public class MyAccontTest extends TestBase {

	HomePage Homeobject ;
	UserRegistrationPage RegistrationObject ;
	MyAccountPage MyAccount ; 
	LoginPage LoginObject ;
	
	String FirstName = "Mahmoud";
	String LastName = "Salah";
	String Email = "mahmoudsalah1355@gmail.com";
	String OldPassword = "123456789";
	String NewPassword = "12345678";


	@Test(priority = 1)
	public void UserRegistrationSucessfully() {

		Homeobject = new HomePage(driver);
		Homeobject.OpenRegistrationPage();
		RegistrationObject = new UserRegistrationPage(driver);
		RegistrationObject.UserRegistrastion(FirstName, LastName ,Email , OldPassword);
		Assert.assertTrue(RegistrationObject.confirmmessage.getText().contains("Your registration completed"));

	}

	@Test(priority = 2)
	public void ChangePasswordPage() throws InterruptedException
	{
		MyAccount = new MyAccountPage(driver);
		MyAccount.OpenChangePasswordPage();
		MyAccount.ChangePassword(NewPassword, OldPassword);
	}

	@Test(priority = 3)
	public void LogoutPage() 
	{

		Homeobject.LogoutPage();
	}

	@Test(priority = 4)
	public void UserloginSucessfully() {

		Homeobject.LoginPage();
		LoginObject = new LoginPage(driver);
		LoginObject.UserLogin(Email, NewPassword);


	}


}
