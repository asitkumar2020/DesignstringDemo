package net.azurewebsites.Pages_Package;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import net.azurewebsites.TestBase_Package.TestBase;

public class Home extends TestBase{
	@FindBy(linkText = "Menu")
	WebElement menuLink;
	
	@FindBy(xpath = "//section[@class='menuWrapper']//li[5]//a[1]//span[1]")
	WebElement designStream;
	
	@FindBy(xpath ="//a[contains(@href,'/open-position-detail/qa-engineer')]")
	WebElement qaPosition;
	
	@FindBy(xpath = "//input[@placeholder='eg. John Doe']")
	WebElement contactName;
	
	@FindBy(xpath="//input[@class='PhoneInputInput']")
	WebElement contactNumber;
	
	@FindBy(xpath="//input[@placeholder='eg. johndoe@example.com']")
	WebElement contactEmail;
	
	@FindBy(xpath="//input[@placeholder='eg. 2 years']")
	WebElement totalExperience;
	
	@FindBy(xpath="//input[@placeholder='eg. 4 LPA']")
	WebElement currentCTC;
	
	@FindBy(xpath="//input[@placeholder='eg. 5 LPA']")
	WebElement expectedCTC;
	
	
	@FindBy(xpath="//select[@id='notice-period']")
	WebElement noticePeriod;
	
	@FindBy(xpath="//textarea[@placeholder='Enter message']")
	WebElement message;
	
	@FindBy (xpath="//input[@accept=\"application/pdf\"]")
	WebElement chooseFile;
	
	@FindBy (xpath="//button[@class='primary-btn']")
	WebElement submit;
	
	
	
	
	
	public Home() {
		PageFactory.initElements(driver, this);
	}
	
	public void menuClick() throws InterruptedException {
		
		menuLink.click();
		
		System.out.println("Click on MenuLink");
		
	}
	
public void lifeDesignStringClick() throws InterruptedException {
		
	designStream.click();
		
		System.out.println("Click on Life@DesignString option");
		
	}
	
public void scrollAndClickQAPosition() throws InterruptedException {
	JavascriptExecutor js = (JavascriptExecutor) driver;
	
	
	js.executeScript("arguments[0].scrollIntoView();",qaPosition);
	
	js.executeScript("arguments[0].click();", qaPosition);
	
		System.out.println("Scroll down to Open Positions and Click on QA Engineer position. ");
		
	}

public void applyForJob()  {

	
	contactName.sendKeys("Asit Kumar Nayak");
	contactNumber.sendKeys("8917693025");
	contactEmail.sendKeys("asitkumarnayak1992@gmail.com");
	totalExperience.sendKeys("4 Years");
	currentCTC.sendKeys("6 LPA");
	expectedCTC.sendKeys("8 LPA");
	Select s = new Select(noticePeriod);
	s.selectByVisibleText("Immediate");
	message.sendKeys("Applying for the position QA, having experience in Manual and Automation Testing");
	chooseFile.sendKeys("C:\\Users\\asit\\Downloads\\Five-master\\Five-master\\KENCentralBDDwithPOM\\src\\main\\java\\net\\azurewebsites\\files\\Resume.doc");
	System.out.println("Details filled up successfully");
		
	}

private void assertTrue(boolean contains) {
	// TODO Auto-generated method stub
	
}

public void submit()  {

	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].click();", submit);
	System.out.println("Resume Submitted successfully");
		
	}



}
