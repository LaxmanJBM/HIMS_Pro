package Network_Development;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BrowserOpening.Base;

public class _5_MedicalSPT1 extends Base{
	
	@FindBy(xpath="//a[text()='Medical Service Price Table']")private WebElement MedicSerPTBtn;
	_1_NetMemTypeProfile1 nmtp1;
	public _5_MedicalSPT1()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void verifyMedicservicePT() throws Exception
	{
		nmtp1=new _1_NetMemTypeProfile1();
		nmtp1.VerifyAppLogIn();
		Thread.sleep(1000);
		nmtp1.verifyHIMSBtn();
		nmtp1.verifynetDevBtn();
		Thread.sleep(2000); 
		MedicSerPTBtn.click();
	}

}
