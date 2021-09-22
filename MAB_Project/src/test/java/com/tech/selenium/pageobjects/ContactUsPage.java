package com.tech.selenium.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ContactUsPage {

    private WebDriver _driver = null;

    @FindBy(name = "q")
    WebElement _searchBox;

	

    public ContactUsPage(WebDriver driver) {
        this._driver = driver;
        PageFactory.initElements(_driver, this);
    }

    public void openURL(){
    	_driver.get("https://www.mortgageadvicebureau.com/contact-us");
    	_driver.manage().getCookies(); // gets all the cookies
    	_driver.manage().deleteAllCookies(); // deletes all the cookies
    }

	public void verifyCallback() throws InterruptedException {
		  String nameStatus = new org.openqa.selenium.support.ui.WebDriverWait(_driver, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"myModal\"]/div/div[2]/div/div/div/h2"))).getText();
		    if (nameStatus.contains("Request a call back")) {
		        System.out.println("Success: " + nameStatus);
		    } else {
		        System.out.println("Failed:" + nameStatus);
		        
		    }
		    
	}
		    
		    public void personalDetailsForm() {
		    	   _driver.findElement(By.id("FirstName")).sendKeys("Gina");
		    	   _driver.findElement(By.id("LastName")).sendKeys("Thornhill");
		    	   _driver.findElement(By.id("EmailAddress")).sendKeys("GinaThornhill@test.com");
		    	   _driver.findElement(By.id("PhoneNumber")).sendKeys("07999444555");
		    	   _driver.findElement(By.id("BestTimeToCallYou")).sendKeys("17:00");
		    	   _driver.findElement(By.id("ReasonForEnquiry")).click();
		    	   _driver.findElement(By.xpath(" //*[@id=\"ReasonForEnquiry\"]/option[2]")).click();
		    	   _driver.findElement(By.id("OptInEmail")).click();
		    	   
		    		    	   
		    	       	  
		    }

}
