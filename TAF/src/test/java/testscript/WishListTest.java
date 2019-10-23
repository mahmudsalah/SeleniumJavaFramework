package testscript;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.WishListPage;

public class WishListTest extends TestBase{

	WishListPage WishListObject ;

	String ProductName = "Lenovo IdeaCentre";

	@Test
	public void SearchForProduct()
	{

		WishListObject = new WishListPage(driver);
		WishListObject.ProductSearch(ProductName);
		WishListObject.AddProductAtWishList();
		Assert.assertTrue(WishListObject.SkuNumber.getText().contains("LE_IC_600"));
		WishListObject.RemoveItem();
		Assert.assertTrue(WishListObject.ConfirmMessage.getText().contains("The wishlist is empty!"));
		
		
	}

}
