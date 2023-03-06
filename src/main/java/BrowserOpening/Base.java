package BrowserOpening;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import Utility.ExtentReportManager;
import Utility.Page1;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Base extends Page1 {
	
	public ExtentReports report=ExtentReportManager.getReportInstance();
	public ExtentTest logger;

protected static WebDriver driver;
	
	public void initilization() throws Exception
	{	
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();                        
		driver.get(readExcelFile(0, 0));
		driver.manage().window().maximize();
	}
}
