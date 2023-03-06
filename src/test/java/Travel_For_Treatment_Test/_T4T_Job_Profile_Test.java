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
import Travel_For_Treatment._3_T4T_Job_Profile1;
import Travel_For_Treatment._3_T4T_Job_Profile2;
import Utility.Page1;

public class _T4T_Job_Profile_Test extends Base{
	
	_1_NetMemTypeProfile1 nmtp1;
	_3_T4T_Job_Profile1 jp1;
	_3_T4T_Job_Profile2 jp2;
	@BeforeMethod
	public void setup() throws Exception
	{
		initilization();
		nmtp1=new _1_NetMemTypeProfile1();
		jp1=new _3_T4T_Job_Profile1();
		jp2=new _3_T4T_Job_Profile2();
		nmtp1.VerifyAppLogIn();
		Thread.sleep(2000);
		nmtp1.verifyHIMSBtn();
		jp1.verifyt4tBtn();
		jp1.verifyjobProfile();
		Thread.sleep(2000);
		jp2.verifyNewBtn();
		
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
	}
	
	@Test(priority=1,enabled=true)
	public void JBMLogoTest()
	{
		boolean status = jp2.verifyJBMLogo();
		Reporter.log("What is the status of JBM Logo= "+status);
	}
	
	@Test(priority=2,enabled=true)
	public void mainTextTest()
	{
		String text1 = jp2.verifyMainText();
		Reporter.log("What is the Main Title= "+text1);
		Assert.assertEquals(text1, "T4T Job Profile");
	}
	
	@Test(priority=3,enabled=true)
	public void fincYearTest()
	{
		String text2 = jp2.verifyFincYear();
		Reporter.log("Show the Current Finential Year= "+text2);
	}
	
	@Test(priority=4,enabled=true)
	public void screenTextTest()
	{
		String text3 = jp2.verifyScreenText();
		Reporter.log("Show the Title of Screen= "+text3);
		Assert.assertEquals(text3, "T4T Job Profile");
	}
	
	@Test(priority=5,enabled=true)
	public void bookingDateTest() throws Exception
	{
		jp2.verifyBookingDate();
	}
	@Test(priority=6,enabled=true)
	public void memberTest() throws Exception
	{
		jp2.verifyMember();
	}
	@Test(priority=7,enabled=true)
	public void jobTypeTest() throws Exception
	{
		jp2.verifyJobType();
	}
	@Test(priority=8,enabled=true)
	public void heightTest() throws Exception
	{
		jp2.verifyHeight();
	}
	@Test(priority=9,enabled=true)
	public void weightTest() throws Exception
	{
		jp2.verifyWeight();
	}
	@Test(priority=10,enabled=true)
	public void dignosisTest()
	{
		jp2.verifydignosis();
	}
	@Test(priority=11,enabled=true)
	public void practitionerNameTest() throws Exception
	{
		jp2.verifypractitionerName();
	}
	@Test(priority=12,enabled=true)
	public void historyTest() throws Exception
	{
		jp2.verifyhistory();
	}
	@Test(priority=13,enabled=true)
	public void TypeTest() throws Exception
	{
		jp2.verifyType();
	}
	@Test(priority=14,enabled=true)
	public void AddDignosisTest() throws Exception
	{
		jp2.verifyAddDignosis();
	}
	@AfterMethod
	public void exit(ITestResult e) throws Throwable
	{
		if(ITestResult.FAILURE == e.getStatus())
		{
			
			Page1.captureScreenshotFaildTC(driver,e.getName());
		}
		report.flush();
		Thread.sleep(2000);
		driver.quit();
	}
}
