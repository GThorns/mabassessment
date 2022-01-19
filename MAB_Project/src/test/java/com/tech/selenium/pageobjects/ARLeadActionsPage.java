package com.tech.selenium.pageobjects;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
public class ARLeadActionsPage {

    private WebDriver _driver = null;
//XPATHS ARE IN ORDER OF USAGE AND ARE REUSABLE ACROSS THE PROJECT 
    @FindBy(name = "q")
    WebElement _searchBox;

    @FindBy(id="Username")
    public WebElement username;
    
    @FindBy(id="Input_Password")
    public WebElement password;
    
    @FindBy(xpath="//button[contains(text(),'Sign In')]")
    public WebElement signInButton;
    
    @FindBy(xpath="//span[contains(text(),'Add New Lead')]")
    public WebElement addNewLeadTab;
    
    @FindBy(id="leadSource")
    public WebElement leadSource;
    
    @FindBy(id="allocatedAdviser")
    public WebElement allocatedAdviser;
    
    
    @FindBy(xpath="//body/app-root[1]/app-default-route[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[2]/app-direct-lead-capture[1]/div[1]/div[1]/div[1]/form[1]/kal-card[2]/div[1]/div[1]/app-customer-list[1]/form[1]/div[1]/app-customer[1]/form[1]/div[2]/input[1]")
    public WebElement leadFirstName;
    
    @FindBy(xpath="//body/app-root[1]/app-default-route[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[2]/app-direct-lead-capture[1]/div[1]/div[1]/div[1]/form[1]/kal-card[2]/div[1]/div[1]/app-customer-list[1]/form[1]/div[1]/app-customer[1]/form[1]/div[3]/input[1]")
    public WebElement leadLastName;
    
    @FindBy(xpath="//body/app-root[1]/app-default-route[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[2]/app-direct-lead-capture[1]/div[1]/div[1]/div[1]/form[1]/kal-card[2]/div[1]/div[1]/app-customer-list[1]/form[1]/div[1]/app-customer[1]/form[1]/div[4]/div[1]/input[1]")
    public WebElement leadEmail;
    
    
    @FindBy(xpath="//body/app-root[1]/app-default-route[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[2]/app-direct-lead-capture[1]/div[1]/div[1]/div[1]/form[1]/kal-card[2]/div[1]/div[1]/app-customer-list[1]/form[1]/div[1]/app-customer[1]/form[1]/div[5]/div[1]/input[1]")
    public WebElement leadPhoneNumber;
    

    @FindBy(xpath="//body/app-root[1]/app-default-route[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[2]/app-direct-lead-capture[1]/div[1]/div[1]/div[1]/form[1]/kal-card[2]/div[1]/div[1]/app-customer-list[1]/form[1]/div[1]/app-customer[1]/form[1]/div[6]/div[1]/input[1]")
    public WebElement leadDOB;
    
    @FindBy(xpath="//body[1]/app-root[1]/app-default-route[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[2]/app-direct-lead-capture[1]/div[1]/div[1]/div[1]/form[1]/kal-card[2]/div[1]/div[1]/app-customer-list[1]/form[1]/div[1]/app-customer[1]/form[1]/div[7]/div[1]/div[1]/input[1]")
    public WebElement genderMale;
    
    
    @FindBy(xpath="//label[contains(text(),'Married')]")
    public WebElement marriedStatus;
  
    @FindBy(id="demonstrableConsent")
    public WebElement customerGivenGDPR;
  
    @FindBy(xpath="//input[@id='contactMethodTypeRadio-1']")
    public WebElement dataGathered;
    
    @FindBy(id="howCanWeHelpRadio-1")
    public WebElement howCanWeHelpRadio;
    
    @FindBy(xpath="//input[@id='currentBuyingPositionRadio-1']")
    public WebElement buyingPosititon;
    
    @FindBy(xpath="//input[@id='prospectTypeRadio-1']")
    public WebElement prospectType;
    
    @FindBy(xpath="/html/body/div[2]/div/button[3]")
    public WebElement acceptCookies;
    
    @FindBy(xpath="//button[contains(text(),'Submit')]")
    public WebElement submitButton;
    

    public ARLeadActionsPage(WebDriver driver) {
        this._driver = driver;
        PageFactory.initElements(_driver, this);
    
    }
    
    public float getDecimalRandomNumber(){
        // create instance of Random class
        Random rand = new Random();
        // Generate and return Random number with decimal
        return rand.nextFloat();
    }
    

    public void openURL(){
    	_driver.get("https://qa.mab-development.co.uk/");
    
    }
    
    public void loginsAR() throws InterruptedException{
    	username.sendKeys("dd8@mab.org.uk");
    	password.sendKeys("Kamikaze@00");
    	signInButton.click();
    	_driver.manage().getCookies(); // gets all the cookies
    	_driver.manage().deleteAllCookies(); // deletes all the cookies
    	acceptCookies.click();
    }
    
    public void clickaddNewLeads() throws InterruptedException{
    	addNewLeadTab.click();
    
    }
    
    
    public void enterLeadDetailsForm() throws InterruptedException {
    	_driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
    	Select objSelect =new Select(_driver.findElement(By.id("adviserBranch")));
    	objSelect.selectByVisibleText("Branch One");

    	Thread.sleep(2500);
    	leadSource.click();
    	leadSource.sendKeys("Lead Source");

    	allocatedAdviser.click();
    	allocatedAdviser.sendKeys("");


    	Select leadTitle =new Select(_driver.findElement(By.xpath("//body/app-root[1]/app-default-route[1]/mat-sidenav-container[1]/mat-sidenav-content[1]/div[2]/app-direct-lead-capture[1]/div[1]/div[1]/div[1]/form[1]/kal-card[2]/div[1]/div[1]/app-customer-list[1]/form[1]/div[1]/app-customer[1]/form[1]/div[1]/div[1]/select[1]")));
    	leadTitle.selectByIndex(1);
    	
    	Thread.sleep(2500);
    	leadFirstName.click();
    	leadFirstName.sendKeys("Automation");
    	
    	
    	Thread.sleep(2500);
    	leadLastName.click();
    	leadLastName.sendKeys("Test");
    	
    	leadEmail.click();
    	leadEmail.sendKeys("ginamab00+"+getDecimalRandomNumber());
    	leadEmail.sendKeys("@gmail.com");
    	
    	leadPhoneNumber.sendKeys("01332225552");
    	leadDOB.sendKeys("01-01-1991");
    	
    	Thread.sleep(2500);
    	genderMale.click();
    	marriedStatus.click();
    	customerGivenGDPR.click();
    	dataGathered.click();
    	howCanWeHelpRadio.click();
    	buyingPosititon.click();
    	prospectType.click();
    	Thread.sleep(2500);
    }
    
    
    public void submit() throws InterruptedException{
    	submitButton.click();
    
    }

	public void successToastMessage() throws InterruptedException {
		  String nameStatus = new org.openqa.selenium.support.ui.WebDriverWait(_driver, 120).until(ExpectedConditions.elementToBeClickable(By.xpath("//app-page-header/mab-message[1]/div[1]/div[1]/div[1]/div[1]/kal-message-box[1]/div[1]"))).getText();
		    if (nameStatus.contains("Success")) {
		        System.out.println("Success: " + nameStatus);
		    } else {
		        System.out.println("Failed:" + nameStatus);
		        
		    }
		    
	}
		  

}
