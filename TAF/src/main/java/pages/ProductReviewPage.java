package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductReviewPage extends PageBase {

	public ProductReviewPage(WebDriver driver) {
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
	
	@FindBy(linkText = "Add your review")
    WebElement BtnAddReview;
	
	@FindBy(id = "AddProductReview_Title")
	WebElement AddProductReviewTitle;
	
	@FindBy(id = "AddProductReview_ReviewText")
	WebElement AddProductReviewReviewText;
	
	@FindBy(id = "addproductrating_4")
	WebElement addproductrating;
	
	@FindBy(css = "input.button-1.write-product-review-button")
	WebElement BtnSubmitReview;
	
	@FindBy(id = "gender-male")
	WebElement gender;
	
	@FindBy(id = "FirstName")
	WebElement FirstNameTxt;
	
	@FindBy(id = "LastName")
	WebElement LastNameTxt;
	
	@FindBy(id = "Email")
	WebElement EmailTxt;
	
	@FindBy(id = "Password")
	WebElement PasswordTxt;
	
	@FindBy(id = "ConfirmPassword")
	WebElement ConfirmPasswordTxt;
	
	@FindBy(id = "register-button")
	WebElement Registerbutton;
	
	@FindBy(css = "div.result")
	public WebElement confirmmessage ;
	
	@FindBy(id = "Email")
	WebElement EmailText;
	
	@FindBy(id = "Password")
	WebElement PasswordText;
	
	@FindBy(css = "input.button-1.login-button")
	WebElement LoginBtn;
	
	
	
	public void UserRegistrastion(String firstname , String lastname , String email , String password )
	{
		ClickButton(gender);
		SendText(FirstNameTxt, firstname);
		SendText(LastNameTxt, lastname);
		SendText(EmailTxt, email);
		SendText(PasswordTxt, password);
		SendText(ConfirmPasswordTxt, password);
		ClickButton(Registerbutton);
	}
	
	public void UserLogin(String email , String password )
	{
		SendText(EmailText, email);
		SendText(PasswordText, password);
		ClickButton(LoginBtn);
	}
	
	public void ProductSearch (String ProductName , String ReviewTitle , String ReviewText )
	{
		SendText(SearchText, ProductName);
		ClickButton(BtnSearch);
		ClickButton(BtnLink);
		ClickButton(BtnAddReview);
		
		SendText(AddProductReviewTitle, ReviewTitle);
		SendText(AddProductReviewReviewText, ReviewText);
		ClickButton(addproductrating);
		ClickButton(BtnSubmitReview);
		
	}

}
