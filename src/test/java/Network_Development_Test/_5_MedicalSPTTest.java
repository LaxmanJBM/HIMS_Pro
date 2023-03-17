package Network_Development_Test;

import java.util.concurrent.TimeUnit;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BrowserOpening.Base;
import Network_Development._5_MedicalSPT1;
import Network_Development._5_MedicalSPT2;
import Utility.Page1;

public class _5_MedicalSPTTest extends Base{
	_5_MedicalSPT1 mspt1;
	_5_MedicalSPT2 mspt2;
	
	@BeforeMethod
	public void setup() throws Exception
	{
		initilization();
		mspt1=new _5_MedicalSPT1();
		mspt2=new _5_MedicalSPT2();
		mspt1.verifyMedicservicePT();
		Thread.sleep(2000);
		mspt2.verifyNewBtn();
		
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);	
	}
	
	@Test(priority=0,enabled=false)
	public void PTNameTest() throws Exception
	{
		mspt2.verifyptName();
	}
	
	@Test(priority=1,enabled=true)
	public void effectiveDateTest() throws Exception
	{
		mspt2.verifyEffecDate();
	}
	
	@Test(priority=2,enabled=false)
	public void currencyTest() throws Exception
	{
		mspt2.verifycurrenecy();
	}
	
	@Test(priority=3,enabled=false)
	public void typeTest() throws Exception
	{
		mspt2.verifyType();
	}
	
	@Test(priority=4,enabled=false)
	public void IPRadioTest() throws Exception
	{
		mspt2.verifyIPRadio();
	}
	
	@Test(priority=5,enabled=false)
	public void RemarksTest() throws Exception
	{
		mspt2.verifyRemarks();
	}
	
	@Test(priority=6,enabled=false)
	public void fileUploadTest() throws Exception
	{
		mspt2.verifyFileUpload();
	}
	
	@AfterMethod
	public void exit(ITestResult b) throws Throwable
	{
		if(ITestResult.FAILURE == b.getStatus())
		{
			Page1.captureScreenshotFaildTC(driver,b.getName());
		}
		
		
		Thread.sleep(2000);
		driver.quit();
	}
}
