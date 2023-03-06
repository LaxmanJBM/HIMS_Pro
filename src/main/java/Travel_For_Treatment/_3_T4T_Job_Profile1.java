package Travel_For_Treatment;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.Status;

import BrowserOpening.Base;

public class _3_T4T_Job_Profile1 extends Base {
	
	@FindBy (xpath="//a[text()='Travel For Treatment']")private WebElement t4tBtn;
	@FindBy (xpath="//a[text()='T4T Job Profile']")private WebElement jobProfile;
	
	@FindBy(xpath="//a[text()='Claims Management']")private WebElement scroll;
	
	public _3_T4T_Job_Profile1()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void verifyt4tBtn() throws Exception
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;                            //Scrolling up to element
		Thread.sleep(2000);
		js.executeScript("arguments[0].scrollIntoView();", scroll);
		Thread.sleep(2000);
		
		t4tBtn.click();
		Thread.sleep(1500);
		
		logger=report.createTest("Test case on Travel For Treatment button verification");
		logger.log(Status.INFO, "Travel For Treatment button is clicked");
		logger.log(Status.PASS, "Travel For Treatment button verification successful done");
	}
	
	public void verifyjobProfile() throws Exception
	{
		jobProfile.click();
		Thread.sleep(1500);
		logger=report.createTest("Test Cases on T4T Job Profile button vefification");
		logger.log(Status.INFO, "T4T job Profile button is clicked");
		logger.log(Status.PASS, "T4T job Profile button verification successful done");
	}
	
	

}
