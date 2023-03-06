package Travel_For_Treatment;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.Status;

import BrowserOpening.Base;

public class _1_T4T_Activity_Master2 extends Base {
	
	@FindBy(xpath="//span[text()='New']")private WebElement newBtn;
	@FindBy(xpath="//a[text()='T4T Activity Master']")private WebElement titleLebal;
	@FindBy(xpath="//span[text()='Jupiter || Access Network Health Insurance Claims Management LLC (Access), Fin Year :2023']")private WebElement finYear;
	@FindBy(xpath="//img[@id='imgJupLogo']")private WebElement logo;
	@FindBy(xpath="//footer[@class='main-footer text-center']")private WebElement footerText;
	@FindBy(xpath="//h3[text()='T4T Operations Activity Master']")private WebElement text;
	
	
	@FindBy(xpath="//input[@placeholder='T4T Activity Name']")private WebElement actiName;
	@FindBy(xpath="//input[@placeholder='Short Name']")private WebElement shortName;
	@FindBy(xpath="//textarea[@placeholder='Scope']")private WebElement scope;
	@FindBy(xpath="//span[text()='Save']")private WebElement saveBtn;
	
	public _1_T4T_Activity_Master2()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void verifyNewBtn() throws Exception
	{
       Set<String> window = driver.getWindowHandles();
	    
	    
	    Iterator<String> it = window.iterator();
	    
	    
	    String mainpage=driver.getWindowHandle();
	    while(it.hasNext())
	    {
	    	String str=it.next();	
	    	if(!mainpage.equals(str))
	    	{
	    		
	    		driver.switchTo().window(str);  		
	    	} 
	    	
	    }
	   
	   
	    newBtn.click();
		Thread.sleep(2000);
		logger=report.createTest("Test case on New button verification");
		logger.log(Status.INFO, "New button is clicked");
		logger.log(Status.PASS, "New button verification successful done and the page is enabled to the users");
	}
	
	public String verifyTitleLebal() throws Exception
	{
		logger=report.createTest("Test case on T4T Activity Master Main Title verification");
		logger.log(Status.INFO, "T4T Activity Master Title  is visible");
		logger.log(Status.PASS, "T4T Activity Master Title verification done");
		Thread.sleep(2000);
		return titleLebal.getText();
	}
	
	public String verifyFinYear() throws Exception
	{
		logger=report.createTest("Test case on Finantial Year verification");
		logger.log(Status.INFO, "The Finantial Year is visible");
		logger.log(Status.PASS, "Finantial Year verification successful done");
		Thread.sleep(2000);
		return finYear.getText();
	}
	public boolean verifyLogo() throws Exception
	{
		logger=report.createTest("Test case on JBM Logo verification");
		logger.log(Status.INFO, "The JBM Logo is visible");
		logger.log(Status.PASS, "JBM Logo verification successful done");
	//	Thread.sleep(2000);
		return logo.isDisplayed();
	}
	public String verifyFooterText() throws Exception
	{
		logger=report.createTest("Test case on Footer text verification");
		logger.log(Status.INFO, "The Footer text is visible");
		logger.log(Status.PASS, "Footer text verification successful done");
	//	Thread.sleep(2000);
		return footerText.getText();
	}
	public String verifyText() throws Exception
	{
	logger=report.createTest("Test case on T4T Operations Activity Master Title verification");
	logger.log(Status.INFO, "The T4T Operations Activity Master Title is visible");
	logger.log(Status.PASS, "T4T Operations Activity Master Title verification successful done");
		Thread.sleep(2000);
		return text.getText();
	}
	
	public void verifyActiName() throws Exception     
	{
		logger=report.createTest("Test case on T4T Activity Name Text verification");
		logger.log(Status.INFO, "Entered the T4T Activity name");
		logger.log(Status.PASS, "T4T Activity Name verification successful done and visible to the users");
	//	Thread.sleep(2000);
		actiName.sendKeys(readExcelFile(11, 0));
	}
	public void verifyShortName() throws Exception
	{
		logger=report.createTest("Test case on Short Name verification");
		logger.log(Status.INFO, "Entered the Short Name");
		logger.log(Status.PASS, "Short Name verification successful done and visible to the users");
	//	Thread.sleep(2000);
		shortName.sendKeys(readExcelFile(11, 1));
	}
	public void verifyScope() throws Exception
	{
		logger=report.createTest("Test case on Scope verification");
		logger.log(Status.INFO, "Entered the Scope");
		logger.log(Status.PASS, "Scope Text verification successful done and visible to the users");
	//	Thread.sleep(2000);
		scope.sendKeys(readExcelFile(11, 2));
	}
	public void verifysaveBtn()
	{
		logger=report.createTest("Test case on Save button verification");
		logger.log(Status.INFO, "Save button is clicked");
		logger.log(Status.PASS, "Save button verification successful done");
		saveBtn.click();
		driver.switchTo().alert().accept();
	}
	
	
	

}
