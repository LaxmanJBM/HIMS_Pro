package Network_Development_Test;

import java.util.concurrent.TimeUnit;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import BrowserOpening.Base;
import Network_Development._4_NMDirectory1;
import Network_Development._4_NMDirectory2;
import Utility.Page1;

public class _4_NMDirectoryTest extends Base{
	
	_4_NMDirectory1 nmd1;
	_4_NMDirectory2 nmd2;
	
	@BeforeMethod
	public void setup() throws Exception
	{
		initilization();
		nmd1=new _4_NMDirectory1();
		nmd2=new _4_NMDirectory2();
		nmd1.verifyNMDerectory();
		Thread.sleep(2000);
		nmd2.verifyNavigate();
		Thread.sleep(2000);
		
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		
	}
	
	@Test(priority=2,enabled=true)
	public void subNetworDropTest() throws Exception
	{
		nmd2.verifysubNetworDrop();
	}
	
	@Test(priority=3,enabled=true)
	public void netTypeDropTest() throws Exception
	{
		nmd2.verifynetTypeDrop();
	}
	
	@Test(priority=3,enabled=true)
	public void providerWiseTest() throws Exception
	{
		nmd2.verifyproviderWise();
	}
	@Test(priority=4,enabled=true)
	public void NetMemberTest() throws Exception
	{
		nmd2.verifyNetMember();
	}
	@Test(priority=5,enabled=true)
	public void countryTest() throws Exception
	{
		nmd2.verifyCountry();
	}
	@Test(priority=5,enabled=true)
	public void cityTest() throws Exception
	{
		nmd2.verifyCity();
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
