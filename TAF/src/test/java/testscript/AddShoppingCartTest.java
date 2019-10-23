package testscript;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.AddToCardsPage;

public class AddShoppingCartTest extends TestBase{
	
	AddToCardsPage AddToCardsObject ;

	String ProductName = "Lenovo IdeaCentre";

	@Test
	public void SearchForProduct()
	{

		AddToCardsObject = new AddToCardsPage(driver);
		AddToCardsObject.ProductSearch(ProductName);
		AddToCardsObject.AddToCartList();
		AddToCardsObject.RemoveItem();
		Assert.assertTrue(AddToCardsObject.ConfirmMessage.getText().contains("Your Shopping Cart is empty!"));
		
		
	}

}
