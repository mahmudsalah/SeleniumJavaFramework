package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends PageBase {

	public SearchPage(WebDriver driver) {
		super(driver);
	}
	
	
	@FindBy(id = "small-searchterms")
	WebElement SearchText;
	
	@FindBy(css = "input.button-1.search-box-button")
	WebElement BtnSearch;
	
	@FindBy(linkText = "Apple MacBook Pro 13-inch")
	WebElement BtnLink;
	
	@FindBy(css = "div.product-name")
	public WebElement ConfirmationMassege;
	
	
	public void ProductSearch (String ProductName )
	{
		SendText(SearchText, ProductName);
		ClickButton(BtnSearch);
		ClickButton(BtnLink);
	}

}
