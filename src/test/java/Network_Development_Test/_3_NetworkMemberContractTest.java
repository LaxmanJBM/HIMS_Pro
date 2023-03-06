package Network_Development_Test;

import java.util.concurrent.TimeUnit;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BrowserOpening.Base;
import Network_Development._3_NMContract1;
import Network_Development._3_NMContract2;
import Utility.Page1;

public class _3_NetworkMemberContractTest extends Base {
	_3_NMContract1 nmc1;
	_3_NMContract2 nmc2;
	
	@BeforeMethod
	public void setup() throws Exception
	{
		initilization();
		nmc1=new _3_NMContract1();
		nmc2=new _3_NMContract2();
		nmc1.verifyNMContract();
		Thread.sleep(2000);
		nmc2.verifyNewBtn();
		Thread.sleep(2000);
		
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		
	}
	
	@Test(priority=1,enabled=false)
	public void hedLineTest() throws Exception
	{
		Thread.sleep(2000);
		String text = nmc2.verifyHedLine();
		Reporter.log("The name of Text= "+text);
	}
	
	@Test(priority=2,enabled=false)
	public void companyTextTest() throws Exception
	{
		nmc2.verifyCompanyText();
	}
	
	@Test(priority=3,enabled=false)
	public void contractDateTest() throws Exception
	{
		nmc2.verifyContractDate();
	}
	
	@Test(priority=4,enabled=false)
	public void contractRefTest() throws Exception
	{
		nmc2.verifyContractRef();
	}
	
	@Test(priority=5,enabled=false)
	public void contractValidDateTest()
	{
		nmc2.verifyContractValidDate();
	}
	
	@Test(priority=6,enabled=false)
	public void NMReptNameTest() throws Exception
	{
		nmc2.verifyNMReptNameText();
	}
	@Test(priority=7,enabled=false)
	public void designationTest() throws Exception
	{
		nmc2.verifyDesignationText();
	}
	@Test(priority=8,enabled=false)
	public void contactNoTest() throws Exception
	{
		nmc2.verifyContactNoText();
	}
	
	
	
	@Test(priority=9,enabled=false)
	public void signNameTest() throws Exception
	{
		nmc2.verifysignNameText();
	}
	@Test(priority=10,enabled=false)
	public void sigDedignTest() throws Exception
	{
		nmc2.verifySigDedignText();
	}
	@Test(priority=11,enabled=false)
	public void aggrementTest() throws Exception
	{
		nmc2.verifyAggrementText();
	}
	@Test(priority=12,enabled=false)
	public void currencyTest() throws Exception
	{
		nmc2.verifyCurrency();
	}
	@Test(priority=13,enabled=false)
	public void preAprrLimitTest() throws Exception
	{
		nmc2.verifyPreAprrLimitText();
	}
	@Test(priority=14,enabled=false) 
	public void processPeriodTest() throws Exception
	{
		nmc2.verifyProcessPeriod();
	}
	@Test(priority=15,enabled=false)
	public void contactStatusTest()
	{
		nmc2.verifyContactStatusText();
	}
	
	
	@Test(priority=16,enabled=false)
	public void fileTest() throws Exception
	{
		nmc2.verifySelectFile();
	}

	@AfterMethod
	public void exit(ITestResult b) throws Throwable
	{
		if(ITestResult.FAILURE == b.getStatus())
		{
			
			Page1.captureScreenshotFaildTC(driver,b.getName());
		}
		Thread.sleep(2500);
		driver.quit();
	}
}
