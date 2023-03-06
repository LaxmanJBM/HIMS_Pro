package Travel_For_Treatment;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.Status;

import BrowserOpening.Base;


public class _1_T4T_Activity_Master1 extends Base {

	
	@FindBy(xpath="//a[text()='Travel For Treatment']")private WebElement T4TProfile;
	@FindBy(xpath="//a[text()='T4T Activity Master']")private WebElement actiMaster;
	
	@FindBy(xpath="//a[text()='Claims Management']")private WebElement scroll;
	
	public _1_T4T_Activity_Master1()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void verifyT4TProfile() throws Exception
	{
		logger=report.createTest("Test case on Travel For Treatment button verification");
		logger.log(Status.INFO, "Travel For Treatment button is clicked");
		logger.log(Status.PASS, "Travel For Treatment button verification successful done and dropdown open");
		JavascriptExecutor js = (JavascriptExecutor) driver;                            //Scrolling up to element
		Thread.sleep(1500);
		js.executeScript("arguments[0].scrollIntoView();", scroll);
		Thread.sleep(1500);
		T4TProfile.click();
		
	}
	public void verifyActiMaster() throws Exception
	{
		logger=report.createTest("Test case on T4T Activity Master screen verification");
		logger.log(Status.INFO, "T4T Activity Master button is clicked");
		logger.log(Status.PASS, "T4T Activity Master button verification successful done and new window open");
		Thread.sleep(1500);
		actiMaster.click();
	}

}
