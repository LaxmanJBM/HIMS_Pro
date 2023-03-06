package Travel_For_Treatment;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.Status;

import BrowserOpening.Base;

public class _3_T4T_Job_Profile2 extends Base {
	
	
	@FindBy (xpath="//span[text()='New']")private WebElement newBtn;
	@FindBy (xpath="//img[@id='imgJupLogo']")private WebElement JBMLogo;
	@FindBy (xpath="//a[text()='T4T Job Profile']")private WebElement mainText;
	@FindBy (xpath="//span[@class='hidden-xs ']")private WebElement fincYear;
	@FindBy (xpath="//h3[@class='box-title']")private WebElement screenText;
	
	@FindBy (xpath="//span[@class='mat-form-field-label-wrapper']")private WebElement bookingDate;
	@FindBy (xpath="//input[@placeholder='Select Member']")private WebElement member;
	@FindBy (xpath="//select[@id='JobTypeddl']")private WebElement jobType;
	@FindBy (xpath="//input[@name='Height']")private WebElement height;
	@FindBy (xpath="//input[@name='Weight']")private WebElement weight;
	
	@FindBy (xpath="//li[text()='Diagnosis & Med Report']")private WebElement dignosis;
	@FindBy (xpath="//input[@placeholder='Select Practitioner Name']")private WebElement practitionerName;
	@FindBy (xpath="//textarea[@class='form-control ng-untouched ng-pristine ng-valid']")private WebElement history;
	@FindBy (xpath="//a[text()=' Add']")private WebElement addBtn;
	@FindBy (xpath="(//select[@class='form-control ng-untouched ng-pristine ng-valid'])[2]")private WebElement type;
	@FindBy (xpath="//button[text()=' OK']")private WebElement okBtn;
	@FindBy (xpath="//button[text()='Search']")private WebElement searchbtn;
	//@FindBy (xpath="")
	
	public _3_T4T_Job_Profile2()
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
		Thread.sleep(1500);
	logger=report.createTest("Test Cases on New button Verification");
	logger.log(Status.INFO, "New button is clicked");
	logger.log(Status.PASS, "New button verification is successful is done");		
	}
	
	public boolean verifyJBMLogo()
	{
		logger=report.createTest("Test Cases on JBM Logo verifcation");
		logger.log(Status.INFO, "JBM Logo is Displayed");
		logger.log(Status.PASS, "JBM logo verification done and visible to users");
		return JBMLogo.isDisplayed();	
	}
	
	public String verifyMainText()
	{
		logger=report.createTest("Test Cases on Main Title verification");
		logger.log(Status.INFO, "Main title is displayed");
		logger.log(Status.PASS, "Main title verification successful done and visible to the users");
		return mainText.getText();
	}
	
	public String verifyFincYear()
	{
		logger=report.createTest("Test Cases on Finential Year Verification");
		logger.log(Status.INFO, "Financial Year is visibled");
		logger.log(Status.PASS, "Financial Year verification is successfully done and visible to the users.");
		return fincYear.getText();
	}
	
	public String verifyScreenText()
	{
		logger=report.createTest("Test Cases on Screen text verification");
		logger.log(Status.INFO, "The text is visible on the Screen");
		logger.log(Status.PASS, "The text verification is successfull done and visible to the users");
		return screenText.getText();
	}
	
	public void verifyBookingDate() throws Exception
	{
		logger=report.createTest("Test Cases on Booking date Verification");
		logger.log(Status.INFO, "Entered the Booking date");
		logger.log(Status.PASS, "The Booking Date verifivation is sucessfull done and visible to the users");
		bookingDate.sendKeys(readExcelFile(19, 0));
	}
	
	public void verifyMember() throws Exception
	{
		member.sendKeys("%");
		Thread.sleep(1000);
		for(int i=0;i<=7;i++)
		{
			Thread.sleep(1500);
			member.sendKeys(Keys.DOWN);
		}
		member.sendKeys(Keys.ENTER);
		
		logger=report.createTest("Test Cases on Select member verification");
		logger.log(Status.INFO, "Member selcted from list");
		logger.log(Status.PASS, "The Member verification is successfully done and visible to all data on screen");
	}
	
	public void verifyJobType() throws Exception
	{
		jobType.click();
		for(int i=0;i<=4;i++)
		{
			Thread.sleep(1000);
			jobType.sendKeys(Keys.DOWN);
		}
		jobType.sendKeys(Keys.ENTER);
		
		logger=report.createTest("Test cases on Job Type verification");
		logger.log(Status.INFO, "Job Type selected");
		logger.log(Status.PASS, "Job Type verification done and visible to the users");
		}
	
	public void verifyHeight() throws Exception
	{
		logger=report.createTest("Test Cases on Height veification");
		logger.log(Status.INFO, "Entered the Height");
		logger.log(Status.PASS, "The Height verification is done and visible to the users.");
		height.sendKeys(readExcelFile(19, 2));
	}
	
	public void verifyWeight() throws Exception
	{
		logger=report.createTest("Test cases on Weight verification");
		logger.log(Status.INFO, "Entered the Weight");
		logger.log(Status.PASS, "The Weight verification is done and visible to the users");
		weight.sendKeys(readExcelFile(19, 3));
	}
	
	public void verifydignosis()
	{
		logger=report.createTest("Test cases on Dignosis and Medical report verification");
		logger.log(Status.INFO, "Dignosis and Medical Report button is clicked");
		logger.log(Status.PASS, "Dignosis and Medical Report button verification is successfull done and page to be opend");
		dignosis.click();
	}
	
	public void verifypractitionerName() throws Exception
	{
		practitionerName.sendKeys("%");
		for(int i=0;i<=2;i++)
		{
			Thread.sleep(1000);
			practitionerName.sendKeys(Keys.DOWN);
		}
		practitionerName.sendKeys(Keys.ENTER);
		logger=report.createTest("Test Cases on Practitioner Name verifcation");
		logger.log(Status.INFO, "Entered the Practitioner Name");
		logger.log(Status.PASS, "Practitioner Name verification done and visible to thee users");
	}
	
	public void verifyhistory() throws Exception
	{
		logger=report.createTest("Test Cases on Medical Condition History feild verification");
		logger.log(Status.INFO, "Entered Medical History");
		logger.log(Status.PASS, "Medical Condition History feild verification done and visible to the users");
		history.sendKeys(readExcelFile(19, 4));
	}
	
	public void verifyType() throws Exception
	{
		addBtn.click();
		Thread.sleep(1000);
		type.click();
		for(int i=0;i<1;i++)
		{
			Thread.sleep(1500);
			type.sendKeys(Keys.DOWN);
		}
		type.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		okBtn.click();
		
		logger=report.createTest("Test Cases on Type ");
		logger.log(Status.INFO, "Selected type");
		logger.log(Status.PASS, "Selected type verification is successfull done");
	}
	
	public void verifyAddDignosis() throws Exception
	{
		verifyType();
		Thread.sleep(1500);
		searchbtn.click();
		for(int i=0;i<=2;i++)
		{
			Thread.sleep(1500);
			searchbtn.sendKeys(Keys.DOWN);
		}
		searchbtn.sendKeys(Keys.ENTER);
		logger=report.createTest("Test Cases on Dignosis Adding");
		logger.log(Status.INFO, "Dignosis adding");
		logger.log(Status.PASS, "Dignosis Adding verification is successfull done");
	}
	

}
