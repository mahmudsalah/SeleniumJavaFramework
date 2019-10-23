package testscript;

import org.testng.annotations.Test;

import pages.EmailProductFriendPage;

public class EmailFriendTest extends TestBase{

	EmailProductFriendPage SendEmailObject ;

	String ProductName = "mac";

	@Test
	public void SearchForProduct() throws InterruptedException
	{

		SendEmailObject = new EmailProductFriendPage(driver);
		SendEmailObject.ProductSearch(ProductName);
		SendEmailObject.SendEmailPage("Mahmoud@test.com", "mhmudsalah@test.com", "this phone is Great for you my friend ^_^ ");
		//Assert.assertTrue(SearchObject.ConfirmationMassege.getText().contains("Apple MacBook Pro 13-inch"));
	}


}
