package Network_Development;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BrowserOpening.Base;

public class _3_NMContract1 extends Base{
	
	_1_NetMemTypeProfile1 nmtp1;
	
	@FindBy(xpath="//a[text()='Network Member Contract']")private WebElement NMContractBtn;
	
	
	public _3_NMContract1()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void verifyNMContract() throws Exception
	{
		nmtp1=new _1_NetMemTypeProfile1();
		nmtp1.VerifyAppLogIn();
		nmtp1.verifyHIMSBtn();
		Thread.sleep(2000);
		nmtp1.verifynetDevBtn();
		Thread.sleep(2000);
		NMContractBtn.click();
		
	}

}

