package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageBase {

	public HomePage(WebDriver driver) {
		super(driver);
		action = new Actions(driver);
	}

	@FindBy(linkText = "Register")
	WebElement RegisterBtn ;

	@FindBy(linkText = "Log in")
	WebElement LoginBtn ;
	
	@FindBy(linkText = "My account")
	WebElement MyaccountBtn ;
	
	@FindBy(linkText = "Log out")
	WebElement LogoutBtn ;
	
	@FindBy(linkText = "Contact us")
	WebElement ContactUsBtn ;
	
	@FindBy(linkText = "Computers")
	WebElement ComputersBtn ;
	
	@FindBy(linkText = "Notebooks")
	WebElement NotebooksBtn ;

	public void OpenRegistrationPage() {

		ClickButton(RegisterBtn);
	}

	public void LoginPage() {

		ClickButton(LoginBtn);
	}
	
	public void LogoutPage() {

		ClickButton(LogoutBtn);
	}
	
	public void MyAccount() {

		ClickButton(MyaccountBtn);
	}
	
	public void ContactUs() {

		ClickButton(ContactUsBtn);
	}
	
	public void HoverMenu() {

		action.moveToElement(ComputersBtn).moveToElement(NotebooksBtn).click().build().perform();
	}

}
