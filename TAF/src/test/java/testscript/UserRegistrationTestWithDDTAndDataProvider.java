package testscript;

import org.apache.poi.ss.usermodel.Cell;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import data.ExcelSheetTestData;
import pages.HomePage;
import pages.LoginPage;
import pages.UserRegistrationPage;

public class UserRegistrationTestWithDDTAndDataProvider extends TestBase {
	
	HomePage Homeobject ;
	UserRegistrationPage RegistrationObject ;
	LoginPage LoginObject ;
	
	
	@DataProvider(name = "TestData")
	public Object[][] GetData ()
	{
		String ExcelSheetPath = System.getProperty("user.dir") + "\\ExcelSheet\\TestData.xlsx";
		Object Data[][] = TestData (ExcelSheetPath, "sheet1");
		return Data ;
	}

	public static Object[][] TestData (String ExcelPath, String SheetName)
	{
		ExcelSheetTestData excel = new ExcelSheetTestData(ExcelPath, SheetName);
		Cell cell = null ;

		int RowCount = excel.GetRowCount();
		int ColCount = excel.GetColCount();

		Object Data[][] = new Object [RowCount-1][ColCount];


		for(int i=1 ; i<RowCount ; i++)
		{
			for(int j=0 ; j<ColCount ; j++)
			{

				String CellData = excel.GetCellDataString(i, j);
				Data[i-1][j] = CellData ;
			}
		}

		return Data ;
	}
	
	@Test(dataProvider = "TestData")
	public void UserRegistrationSucessfully(String Fname , String Lname , String Email , String Password) {
		
		Homeobject = new HomePage(driver);
		Homeobject.OpenRegistrationPage();
		RegistrationObject = new UserRegistrationPage(driver);
		RegistrationObject.UserRegistrastion(Fname , Lname , Email , Password);
		
		RegistrationObject.UserLogOut();
		
		Homeobject.LoginPage();
		LoginObject = new LoginPage(driver);
		LoginObject.UserLogin(Email, Password);
		RegistrationObject.UserLogOut();
	}
	
	

}
