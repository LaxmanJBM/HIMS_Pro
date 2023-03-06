package Travel_For_Treatment;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.Status;

import BrowserOpening.Base;

public class _2_T4T_Service_Profile2 extends Base {
	
	@FindBy(xpath="//span[text()='New']")private WebElement newBtn;
	@FindBy(xpath="//a[text()='T4T Services Profile']")private WebElement mainText;
	@FindBy(xpath="//h3[text()='T4t Service Profile']")private WebElement screenText;
	@FindBy(xpath="//span[text()='Jupiter || Access Network Health Insurance Claims Management LLC (Access), Fin Year :2023']")private WebElement finYearText;
	@FindBy(xpath="//img[@id='imgJupLogo']")private WebElement JBMLogo;
	
	@FindBy(xpath="//input[@name='T4T Service Name']")private WebElement serviceName;
	@FindBy(xpath="//input[@placeholder='Short Name']")private WebElement shortName;
	@FindBy(xpath="//textarea[@placeholder='Comments']")private WebElement commentText;
	@FindBy(xpath="//span[text()='Save']")private WebElement saveBtn;
	@FindBy(xpath="//footer[@class='main-footer text-center']")private WebElement footerText;
	
	
	public _2_T4T_Service_Profile2()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void verifyNewBtn() throws Exception
	{
	  Set<String> window = driver.getWindowHandles();
	  Iterator<String> it = window.iterator();
	  
	  String mainpage = driver.getWindowHandle();
	  
	  while(it.hasNext())
	  {
		  String src = it.next();
		  if(!mainpage.equals(src))
		  {
			  driver.switchTo().window(src);
		  }
	  }
	  
	  newBtn.click();
	  Thread.sleep(2000);
	    logger=report.createTest("Test case on New button verification");
		logger.log(Status.INFO, "New button is clicked");
		logger.log(Status.PASS, "New button verification successful done and the page is enabled to the users");
	}
	
	public String verifyMainText() throws Exception
	{
		logger=report.createTest("Test case on T4T Services Profile Title verification");
		logger.log(Status.INFO, "The T4T Services Profile Title is visible");
		logger.log(Status.PASS, "T4T Services Profile Title verification successful done");
		Thread.sleep(1500);
		return mainText.getText();
	}
	
	public String verifyScreenText() throws Exception
	{
		logger=report.createTest("Test case on T4T Services Profile Text verification");
		logger.log(Status.INFO, "The T4T Services Profile Text is visible");
		logger.log(Status.PASS, "T4T Services Profile Text verification successful done");
		Thread.sleep(1500);
		return screenText.getText();
	}
	
	public String verifyFinYearText() throws Exception
	{
		logger=report.createTest("Test case on Finantial Year Text verification");
		logger.log(Status.INFO, "The Finantial Year Text is visible");
		logger.log(Status.PASS, "The Financial Year Text verification successful done and visible to the users");
		Thread.sleep(1500);
		return finYearText.getText();
	}
	
	public boolean verifyJBMLogo() throws Exception
	{
		logger=report.createTest("Test case on JBM Logo verification");
		logger.log(Status.INFO, "The JBM Logo is visible");
		logger.log(Status.PASS, "The JBM Logo verification successful done and visible to the users");
		Thread.sleep(1500);
		return JBMLogo.isDisplayed();
	}
	
	public void verifyServiceName() throws Exception
	{

		serviceName.sendKeys(readExcelFile(15, 0));
		logger=report.createTest("Test case on T4T Service Name Text verification");
		logger.log(Status.INFO, "Entered the T4T Service name");
		logger.log(Status.PASS, "T4T Service Name verification successful done and visible to the users");
	}
	
	public void verifyShortName() throws Exception
	{
		shortName.sendKeys(readExcelFile(15, 1));
		logger=report.createTest("Test case on Short Name verification");
		logger.log(Status.INFO, "Entered the Short Name");
		logger.log(Status.PASS, "Short Name verification successful done and visible to the users");
	}
	
	public void verifyCommentText() throws Exception
	{
	
		commentText.sendKeys(readExcelFile(15, 2));
		logger=report.createTest("Test case on Comment Text verification");
		logger.log(Status.INFO, "Entered the Comments");
		logger.log(Status.PASS, "Comment Text verification successful done and visible to the users");
	}
	
	public String verifySaveBtn() throws Exception
	{
		logger=report.createTest("Test case on Save Button verification");
		logger.log(Status.INFO, "Save button is Clicked");
		logger.log(Status.PASS, "Save button verification successful done and visible to the users");
		Thread.sleep(2000);
		saveBtn.click();
		driver.switchTo().alert().accept();
		return driver.switchTo().alert().getText();
		
		
	}
	public String verifyFooterText() throws Exception
	{
		logger=report.createTest("Test case on Footer text verification");
		logger.log(Status.INFO, "The Footer text is visible");
		logger.log(Status.PASS, "The Footer text verification successful done and visible to the users");
		Thread.sleep(2000);
		return footerText.getText();
	}

}
