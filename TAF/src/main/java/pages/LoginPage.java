package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageBase {

	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id = "Email")
	WebElement EmailText;
	
	@FindBy(id = "Password")
	WebElement PasswordText;
	
	@FindBy(css = "input.button-1.login-button")
	WebElement LoginBtn;
	
	
	public void UserLogin(String email , String password )
	{
		SendText(EmailText, email);
		SendText(PasswordText, password);
		ClickButton(LoginBtn);
	}
	

}
