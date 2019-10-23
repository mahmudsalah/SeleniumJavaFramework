package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContuctUsPage extends PageBase {

	public ContuctUsPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id = "FullName")
	WebElement FullNameText;
	
	@FindBy(id = "Email")
	WebElement EmailText;
	
	@FindBy(id = "Enquiry")
	WebElement EnquiryText;
	
	@FindBy(css = "input.button-1.contact-us-button")
	WebElement BtnSupmit;
	
	@FindBy(css = "div.result")
	public WebElement SucessMessage;
	
	
	public void ContactUsTest(String FullNamevalue , String Emailvalue , String Enquiryvalue)
	{
		SendText(FullNameText,FullNamevalue);
		SendText(EmailText, Emailvalue);
		SendText(EnquiryText, Enquiryvalue);
		ClickButton(BtnSupmit);
	}

}
