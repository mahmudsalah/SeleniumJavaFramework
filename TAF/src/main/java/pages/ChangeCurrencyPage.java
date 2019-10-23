package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class ChangeCurrencyPage extends PageBase{

	public ChangeCurrencyPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id = "customerCurrency")
	WebElement customerCurrencyDropDownList;
	
	@FindBy(linkText = "Build your own computer")
	WebElement BtnLink;
	
	@FindBy(css = "span.price-value-1")
	public WebElement CurrencyIcon;
	
	public void ChangeCurrency()
	{
		select = new Select(customerCurrencyDropDownList) ;
		select.selectByVisibleText("Euro");
		ClickButton(BtnLink);
	}

}
