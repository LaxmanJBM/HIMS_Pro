package Travel_For_Treatment_Test;

import java.util.concurrent.TimeUnit;

import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BrowserOpening.Base;
import Network_Development._1_NetMemTypeProfile1;
import Travel_For_Treatment._1_T4T_Activity_Master1;
import Travel_For_Treatment._1_T4T_Activity_Master2;
import Utility.Page1;

public class _1_T4T_Activity_Master_Test extends Base {
	_1_NetMemTypeProfile1 nmtp1;
	_1_T4T_Activity_Master1 am1;
	_1_T4T_Activity_Master2 am2;
	@BeforeMethod
	public void setup() throws Exception
	{
		initilization();
		Thread.sleep(1500);
		nmtp1=new _1_NetMemTypeProfile1();
		am1=new _1_T4T_Activity_Master1();
		am2=new _1_T4T_Activity_Master2();
		nmtp1.VerifyAppLogIn();
		nmtp1.verifyHIMSBtn();
		am1.verifyT4TProfile();
		am1.verifyActiMaster();
		Thread.sleep(1500);
		am2.verifyNewBtn();
		
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
	}
	@Test(priority=1,enabled=true)
	public void titleLebalTest() throws Exception
	{
		Thread.sleep(2000);
		String title = am2.verifyTitleLebal();
		Reporter.log("Show the Lebal Title ="+title);
	
	}
	@Test(priority=2,enabled=true)
	public void finYearTest() throws Exception
	{
		String year = am2.verifyFinYear();
		Reporter.log("Show the current Financial Year ="+year);
	}
	@Test(priority=3,enabled=true)
	public void logoTest() throws Exception
	{
		boolean status = am2.verifyLogo();
		Reporter.log("What is the status of Logo ="+status);
	}
	@Test(priority=4,enabled=true)
	public void footerTextTest() throws Exception
	{
		String text = am2.verifyFooterText();
		Reporter.log("Show the footer text= "+text);
	}
	@Test(priority=5,enabled=true)
	public void textTest() throws Exception
	{
		String tex = am2.verifyText();
		Reporter.log("show the title of page= "+tex);
	}
	@Test(priority=6,enabled=true)
	public void actiNameTest() throws Exception
	{
		am2.verifyActiName();
	}
	@Test(priority=7,enabled=true)
	public void shortNameTest() throws Exception
	{
		am2.verifyShortName();
	}
	@Test(priority=8,enabled=true)
	public void scopeTest() throws Exception
	{
		am2.verifyScope();
	}
	@Test(dependsOnMethods= {"actiNameTest","shortNameTest","scopeTest"},priority=9,enabled=true)
	public void saveBtnTest()
	{
		am2.verifysaveBtn();
	}
	
	@AfterMethod
	public void exit(ITestResult c) throws Throwable
	{
		if(ITestResult.FAILURE == c.getStatus())
		{
			
			Page1.captureScreenshotFaildTC(driver,c.getName());
		}
		report.flush();
		Thread.sleep(2000);
		driver.quit();
	}
	

}
