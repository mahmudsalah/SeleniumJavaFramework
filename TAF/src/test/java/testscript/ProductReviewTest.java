package testscript;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import pages.ProductReviewPage;
import pages.UserRegistrationPage;

public class ProductReviewTest extends TestBase{

	
	HomePage Homeobject ;
	UserRegistrationPage RegistrationObject ;
	ProductReviewPage ProductReviewObject ;
	LoginPage LoginObject ;
	String ProductName = "mac";
	
	
	
	@Test(priority = 1)
	public void UserRegistrationSucessfully() {
		
		Homeobject = new HomePage(driver);
		Homeobject.OpenRegistrationPage();
		RegistrationObject = new UserRegistrationPage(driver);
		RegistrationObject.UserRegistrastion("Mahmoud", "Salah", "mahmoudsalah000@Test.com", "123456789");
		Assert.assertTrue(RegistrationObject.confirmmessage.getText().contains("Your registration completed"));
		
	}
	
	
	/*@Test(priority = 2)
	public void UserloginSucessfully() {
		
		Homeobject = new HomePage(driver);
		Homeobject.LoginPage();
		LoginObject = new LoginPage(driver);
		LoginObject.UserLogin("mahmoudsalah111@Test.com", "123456789");
		
		
	}*/

	@Test(priority = 2)
	public void SearchForProduct()
	{

		ProductReviewObject = new ProductReviewPage(driver);
		ProductReviewObject.ProductSearch(ProductName, " Great Phone ", " this is a Great Phone ^_^ ");
	}

}
