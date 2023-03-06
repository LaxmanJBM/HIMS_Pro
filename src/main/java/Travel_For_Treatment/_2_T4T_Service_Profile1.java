package Travel_For_Treatment;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.Status;

import BrowserOpening.Base;
import Network_Development._1_NetMemTypeProfile1;

public class _2_T4T_Service_Profile1 extends Base {
	
	_1_NetMemTypeProfile1 nmtp1;
	
	
	@FindBy(xpath="//a[text()='Travel For Treatment']")private WebElement travelFTre;
	@FindBy(xpath="//a[text()='T4T Services Profile']")private WebElement serProfile;
	
	@FindBy(xpath="//a[text()='Claims Management']")private WebElement scroll;
	
	public _2_T4T_Service_Profile1()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void verifyTravelFTre() throws Exception
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;                            //Scrolling up to element
		Thread.sleep(2000);
		js.executeScript("arguments[0].scrollIntoView();", scroll);
		Thread.sleep(2000);
		
		travelFTre.click();
		//Thread.sleep(2000);
		logger=report.createTest("Test case on Travel For Treatment button verification");
		logger.log(Status.INFO, "Travel For Treatment button is clicked");
		logger.log(Status.PASS, "Travel For Treatment button verification successful done");
		
	}
	
	public void verifySerProfile() throws Exception
	{
		Thread.sleep(1500);
		serProfile.click();
		logger=report.createTest("Test case on T4T Service Profile button verification");
		logger.log(Status.INFO, "T4T Service Profile button is clicked");
		logger.log(Status.PASS, "T4T Service Profile button verification successful done and Move to another page");
		
	}
	

}
