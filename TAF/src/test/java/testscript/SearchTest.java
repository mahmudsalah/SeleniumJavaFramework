package testscript;

import org.testng.annotations.Test;

import pages.SearchPage;

public class SearchTest extends TestBase {
	
	
	SearchPage SearchObject ;
	
	String ProductName = "mac";
	
	@Test
	public void SearchForProduct()
	{
	
		SearchObject = new SearchPage(driver);
		SearchObject.ProductSearch(ProductName);
		//Assert.assertTrue(SearchObject.ConfirmationMassege.getText().contains("Apple MacBook Pro 13-inch"));
	}

}
