package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends PageBase {

	public MyAccountPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(linkText = "My account")
	WebElement MyAccountBtn;
	
	@FindBy(linkText = "Change password")
	WebElement ChangepasswordBtn;
	
	@FindBy(id = "OldPassword")
	WebElement OldPasswordTxt;
	
	@FindBy(id = "NewPassword")
	WebElement NewPasswordTxt;
	
	@FindBy(id = "ConfirmNewPassword")
	WebElement ConfirmNewPasswordTxt;
	
	@FindBy(css = "input.button-1.change-password-button")
	WebElement ChangePasswordbutton;
	
	public void OpenChangePasswordPage()
	{
		ClickButton(MyAccountBtn);
		ClickButton(ChangepasswordBtn);
	}
	
	public void ChangePassword(String NewPassword , String OldPassword)
	{
		SendText(OldPasswordTxt, OldPassword);
		SendText(NewPasswordTxt, NewPassword);
		SendText(ConfirmNewPasswordTxt, NewPassword);
		ClickButton(ChangePasswordbutton);
	}
}
