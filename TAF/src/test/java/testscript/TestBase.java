package testscript;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class TestBase {
	
	public static WebDriver driver;

	@BeforeSuite
	@Parameters({"browser"})
	public void OpenBrowser(@Optional("chrome") String BrowserName) {
		
		if(BrowserName.equalsIgnoreCase("chrome"))
		{
			String ChromePath = System.getProperty("user.dir") + "\\Drivers\\chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", ChromePath);
			driver = new ChromeDriver();
		}
		
		else if (BrowserName.equalsIgnoreCase("firefox"))
		{
			String ChromePath = System.getProperty("user.dir") + "\\Drivers\\geckodriver.exe";
			System.setProperty("webdriver.gecko.driver", ChromePath);
			driver = new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		driver.navigate().to("https://demo.nopcommerce.com/");
		 

	}
	
	@AfterMethod
	public void TakeScreenShotTest(ITestResult Result) throws IOException {
		
		if(ITestResult.FAILURE == Result.getStatus())
		{
			System.out.println(" Failed !!! ");
			System.out.println(" Taking Screenshot ... ");
			TakesScreenshot TS = (TakesScreenshot) driver;
			File Source = TS.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(Source, new File ("./ScreenShot/" + Result.getName() + ".png"));
		}
	}

	@AfterSuite
	public void CloseBrowser() {
		driver.quit();
	}

}
