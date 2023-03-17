package Network_Development;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BrowserOpening.Base;

public class _5_MedicalSPT2 extends Base{
	
	@FindBy(xpath="//span[text()='New']")private WebElement newBtn;
	
	@FindBy(xpath="//h3[text()='Medical Service Price Table']")private WebElement MedicalPTText;
	
	@FindBy(xpath="//input[@placeholder='Price Table Name']")private WebElement ptName;
	@FindBy(xpath="//input[@id='mat-input-0']")private WebElement effecDate;
	@FindBy(xpath="(//select[@class='form-control ng-untouched ng-pristine ng-valid'])[1]")private WebElement currenecy;
	@FindBy(xpath="(//select[@class='form-control ng-untouched ng-pristine ng-valid'])[2]")private WebElement type;
	@FindBy(xpath="//input[@type='checkbox']")private WebElement checkBox;
	@FindBy(xpath="//input[@id='CoptionsRadios1']")private WebElement IPRadio;
	@FindBy(xpath="//input[@id='IoptionsRadios2']")private WebElement OPRadio;
	@FindBy(xpath="//textarea[@placeholder='Remarks']")private WebElement remarks;
	
	@FindBy(xpath="//label[text()='select file']")private WebElement selectFile;
	@FindBy(xpath="//button[text()=' Upload ']")private WebElement uploadBtn;
	@FindBy(xpath="//button[text()='Validate']")private WebElement validateBtn;
	@FindBy(xpath="//button[text()=' Export ']")private WebElement exportBtn;
	
	
	public _5_MedicalSPT2()
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
		Thread.sleep(1500);
	}
	public void verifyptName() throws Exception
	{
		ptName.sendKeys(readExcelFile(11, 5));
	}
	public void verifyEffecDate() throws Exception
	{
		effecDate.sendKeys(readExcelFile(11, 6));
	}
	
	public void verifycurrenecy() throws Exception
	{
		currenecy.click();
		Thread.sleep(1500);
		for(int i=0;i<2;i++)
		{
			Thread.sleep(1500);
			currenecy.sendKeys(Keys.DOWN);
		}
		currenecy.sendKeys(Keys.ENTER);
	}
	
	public void verifyType() throws Exception
	{
		type.click();
		for(int i=0;i<=2;i++)
		{
			Thread.sleep(1500);
			type.sendKeys(Keys.DOWN);
		}
		type.sendKeys(Keys.ENTER);
	}
	
	public void verifyCheckBox()
	{
		checkBox.click();
	}
	
	public void verifyIPRadio() throws Exception
	{
		verifyCheckBox();
		Thread.sleep(1500);
		IPRadio.click();
	}
	
	public void verifyRemarks() throws Exception
	{
		remarks.sendKeys(readExcelFile(11, 7));
	}
	
	public void verifyFileUpload() throws Exception
	{
		selectFile.sendKeys("C:\\Users\\Admin\\Downloads");                        //Pending
		Thread.sleep(1500);
		uploadBtn.click();
		Thread.sleep(1500);
		validateBtn.click();
		Thread.sleep(2000);
		
		
	}

}
