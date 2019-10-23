package testscript;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import pages.HomePage;
import pages.LoginPage;
import pages.UserRegistrationPage;

public class UserRegistrationTestWithFakeData extends TestBase {

	HomePage Homeobject ;
	UserRegistrationPage RegistrationObject ;
	LoginPage LoginObject ;

	Faker FakeData = new Faker();

	String FirstName = FakeData.name().firstName();
	String LastName = FakeData.name().lastName();
	String Email = FakeData.internet().emailAddress();
	String Password = FakeData.number().digits(8).toString();



	@Test
	public void UserRegistrationSucessfully() {

		Homeobject = new HomePage(driver);
		Homeobject.OpenRegistrationPage();
		RegistrationObject = new UserRegistrationPage(driver);
		RegistrationObject.UserRegistrastion( FirstName , LastName , Email , Password);
		Assert.assertTrue(RegistrationObject.confirmmessage.getText().contains("Your registration completed"));

		RegistrationObject.UserLogOut();

		Homeobject.LoginPage();
		LoginObject = new LoginPage(driver);
		LoginObject.UserLogin(Email, Password);

	}



}
