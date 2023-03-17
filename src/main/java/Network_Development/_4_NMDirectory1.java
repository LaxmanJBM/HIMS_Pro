package Network_Development;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BrowserOpening.Base;

public class _4_NMDirectory1 extends Base{
	
	_1_NetMemTypeProfile1 nmtp1;
	
	@FindBy(xpath="//a[text()='Network Member Directory']")private WebElement nmDirectory;
	
	
	
	public _4_NMDirectory1()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void verifyNMDerectory() throws Exception
	{
		nmtp1=new _1_NetMemTypeProfile1();
		nmtp1.VerifyAppLogIn();
		Thread.sleep(1000);
		nmtp1.verifyHIMSBtn();
		nmtp1.verifynetDevBtn();
		Thread.sleep(2000);
		nmDirectory.click();
	}

}
