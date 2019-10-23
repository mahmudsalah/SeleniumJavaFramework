package testscript;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.CompareProductsPage;

public class CompareProductTest extends TestBase{
	
	CompareProductsPage CompareProductsObject ;

	String ProductName = "Lenovo IdeaCentre";

	@Test
	public void SearchForProduct()
	{

		CompareProductsObject = new CompareProductsPage(driver);
		CompareProductsObject.ProductSearch(ProductName);
		CompareProductsObject.AddToCompareList();
		driver.navigate().to("https://demo.nopcommerce.com/compareproducts");
		CompareProductsObject.RemoveItem();
		Assert.assertTrue(CompareProductsObject.ConfirmMessage.getText().contains("You have no items to compare."));
		
		
	}

}
