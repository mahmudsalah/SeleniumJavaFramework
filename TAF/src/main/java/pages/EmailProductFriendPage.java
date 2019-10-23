package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EmailProductFriendPage extends PageBase{

	public EmailProductFriendPage(WebDriver driver) {
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
	
	@FindBy(css = "div.email-a-friend")
	public WebElement BtnemailAfriend;
	
	@FindBy(id = "FriendEmail")
	WebElement FriendEmailText;
	
	@FindBy(id = "YourEmailAddress")
	WebElement YourEmailAddressText;
	
	@FindBy(id = "PersonalMessage")
	WebElement PersonalMessageText;
	
	@FindBy(css = "input.button-1.send-email-a-friend-button")
	WebElement BtnSendEMail;
	
	public void ProductSearch (String ProductName )
	{
		SendText(SearchText, ProductName);
		ClickButton(BtnSearch);
		ClickButton(BtnLink);
		ClickButton(BtnemailAfriend);
	}
	
	public void SendEmailPage(String FriendEmail , String YourEmailAddress , String PersonalMessage)
	{
		SendText(FriendEmailText, FriendEmail);
		SendText(YourEmailAddressText, YourEmailAddress);
		SendText(PersonalMessageText, PersonalMessage);
		ClickButton(BtnSendEMail);
	}
	

}
