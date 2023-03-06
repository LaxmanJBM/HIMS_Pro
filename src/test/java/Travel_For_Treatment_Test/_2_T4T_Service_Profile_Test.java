package Travel_For_Treatment_Test;

import java.util.concurrent.TimeUnit;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import BrowserOpening.Base;
import Network_Development._1_NetMemTypeProfile1;
import Travel_For_Treatment._2_T4T_Service_Profile1;
import Travel_For_Treatment._2_T4T_Service_Profile2;
import Utility.Page1;

public class _2_T4T_Service_Profile_Test extends Base{
	_1_NetMemTypeProfile1 nmtp1;
	_2_T4T_Service_Profile1 sp1;
	_2_T4T_Service_Profile2 sp2;
	
	
	@BeforeMethod
	public void setup() throws Exception
	{
		initilization();
		nmtp1=new _1_NetMemTypeProfile1();
		sp1=new _2_T4T_Service_Profile1();
		sp2=new _2_T4T_Service_Profile2(); 
		nmtp1.VerifyAppLogIn();
		Thread.sleep(2000);
		nmtp1.verifyHIMSBtn();
		sp1.verifyTravelFTre();
		sp1.verifySerProfile();
		Thread.sleep(1500);
		sp2.verifyNewBtn();
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
	}

	@Test(priority=0,enabled=true)
	public void mainTextTest() throws Exception
	{
		String text1 = sp2.verifyMainText();
		Reporter.log("Show the Main Title of the Screen= "+text1);
		Assert.assertEquals(text1,"T4T Services Profile");
	}
	
	@Test(priority=1,enabled=true)
	public void screenTextTest() throws Exception
	{
		String text2 = sp2.verifyScreenText();
		Reporter.log("Show the text available on the Screen= "+text2);
		Assert.assertEquals(text2,"T4T Services Profile");
	}
	
	@Test(priority=2,enabled=true)
	public void finYearTextTest() throws Exception
	{
		String text3 = sp2.verifyFinYearText();
		Reporter.log("Show the Finantial Year on the Screen= "+text3);
		Assert.assertNotEquals(text3,"T4T Services Profile");
	}
	
	@Test(priority=3,enabled=true)
	public void JBMLogoTest() throws Exception
	{
		boolean status = sp2.verifyJBMLogo();
		Reporter.log("Show the Status of Logo on the Screen= "+status);
		Assert.assertTrue(status);
	}
	
	@Test(priority=4,enabled=true)
	public void serviceNameTest() throws Exception
	{
		sp2.verifyServiceName();
	}
	
	@Test(priority=5,enabled=true)
	public void shortNameTest() throws Exception
	{
		sp2.verifyShortName();
	}
	
	@Test(priority=6,enabled=true)
	public void commentsTest() throws Exception
	{
		sp2.verifyCommentText();
	}
	@Test(priority=7,enabled=true,dependsOnMethods= {"serviceNameTest","shortNameTest","commentsTest"})
	public void saveBtnTest() throws Exception
	{
		sp2.verifySaveBtn();
		
	}
	
	@Test(priority=8,enabled=true)
	public void footerTest() throws Exception
	{
		String text5 = sp2.verifyFooterText();
		Reporter.log("Show the text available on the Screen= "+text5);
		Assert.assertEquals(text5,"Copyright © 2018 Jupiter Business System");
	}
	
	@AfterMethod
	public void exit(ITestResult d) throws Throwable
	{
		if(ITestResult.FAILURE == d.getStatus())
		{
			
			Page1.captureScreenshotFaildTC(driver,d.getName());
		}
		report.flush();
		Thread.sleep(2000);
		driver.quit();
	}
}
