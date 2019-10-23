package testscript;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.ChangeCurrencyPage;

public class ChangeCurrencyTest extends TestBase {
	
	ChangeCurrencyPage CurrencyObject ;
	
	@Test
	public void ChangeCurrency() 
	{
		CurrencyObject = new ChangeCurrencyPage(driver);
		CurrencyObject.ChangeCurrency();
		Assert.assertTrue(CurrencyObject.CurrencyIcon.getText().contains("Ђ"));
		
		
	}

}
