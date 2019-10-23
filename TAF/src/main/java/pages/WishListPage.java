package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WishListPage extends PageBase{

	public WishListPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(id = "small-searchterms")
	WebElement SearchText;

	@FindBy(css = "input.button-1.search-box-button")
	WebElement BtnSearch;

	@FindBy(linkText = "Lenovo IdeaCentre 600 All-in-One PC")
	WebElement BtnLink;

	@FindBy(id = "add-to-wishlist-button-3")
	WebElement AddwishlistBtn;

	@FindBy(css = "span.sku-number")
	public WebElement SkuNumber;

	@FindBy(css = "span.wishlist-label")
	WebElement wishlistBtn;

	@FindBy(name = "removefromcart")
	WebElement removeBtn;

	@FindBy(css = "input.button-2.update-wishlist-button")
	WebElement UpdateWishlist;

	@FindBy(css = "div.no-data")
	public WebElement ConfirmMessage;

	public void ProductSearch (String ProductName )
	{
		SendText(SearchText, ProductName);
		ClickButton(BtnSearch);
		ClickButton(BtnLink);
	}

	public void AddProductAtWishList()
	{
		ClickButton(AddwishlistBtn);
		ClickButton(wishlistBtn);
	}

	public void RemoveItem()
	{
		ClickButton(removeBtn);
		ClickButton(UpdateWishlist);
	}




}
