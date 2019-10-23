package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserRegistrationPage extends PageBase {

	public UserRegistrationPage(WebDriver driver) {
		super(driver);
	}
	
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
	
	@FindBy(linkText = "Log out")
	WebElement LogoutBtn;
	
	@FindBy(css = "div.result")
	public WebElement confirmmessage ;
	
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
	
	public void UserLogOut()
	{
		ClickButton(LogoutBtn);
	}

}
