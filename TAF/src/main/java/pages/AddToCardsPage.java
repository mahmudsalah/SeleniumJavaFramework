package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddToCardsPage extends PageBase{

	public AddToCardsPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(id = "small-searchterms")
	WebElement SearchText;

	@FindBy(css = "input.button-1.search-box-button")
	WebElement BtnSearch;

	@FindBy(linkText = "Lenovo IdeaCentre 600 All-in-One PC")
	WebElement BtnLink;

	@FindBy(css = "input.button-1.add-to-cart-button")
	WebElement AddToCart;

	@FindBy(css = "span.cart-label")
	WebElement ShoppingCart;
	
	@FindBy(name = "removefromcart")
	WebElement CheckBoxRemoveFromCart;
	
	@FindBy(name = "updatecart")
	WebElement updatecartBtn;
	
	@FindBy(name = "continueshopping")
	WebElement continueshoppingBtn;


	@FindBy(css = "div.no-data")
	public WebElement ConfirmMessage;

	public void ProductSearch (String ProductName )
	{
		SendText(SearchText, ProductName);
		ClickButton(BtnSearch);
		ClickButton(BtnLink);
	}

	public void AddToCartList()
	{
		ClickButton(AddToCart);
		ClickButton(ShoppingCart);
	}

	public void RemoveItem()
	{
		ClickButton(CheckBoxRemoveFromCart);
		ClickButton(updatecartBtn);
	}
	
	public void clickContinueShopping()
	{
		ClickButton(continueshoppingBtn);
	}

}
