package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CompareProductsPage extends PageBase{

	public CompareProductsPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id = "small-searchterms")
	WebElement SearchText;

	@FindBy(css = "input.button-1.search-box-button")
	WebElement BtnSearch;

	@FindBy(linkText = "Lenovo IdeaCentre 600 All-in-One PC")
	WebElement BtnLink;

	@FindBy(css = "input.button-2.add-to-compare-list-button")
	WebElement AddToCompareBtn;

	@FindBy(css = "input.button-2.remove-button")
	public WebElement RemoveButton;


	@FindBy(css = "div.no-data")
	public WebElement ConfirmMessage;

	public void ProductSearch (String ProductName )
	{
		SendText(SearchText, ProductName);
		ClickButton(BtnSearch);
		ClickButton(BtnLink);
	}

	public void AddToCompareList()
	{
		ClickButton(AddToCompareBtn);
	}

	public void RemoveItem()
	{
		ClickButton(RemoveButton);
	}

}
