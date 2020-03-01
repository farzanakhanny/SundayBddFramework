package bdd.newtours.PageElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class RegisterPageLocators {


		//Enter First Name in Contact Information Tab
		@FindBy(xpath="//input[@name='firstName']") // Initiated xpath
		public WebElement FirstName;
	
		//Enter Last Name in Contact Information Tab
		@FindBy(xpath="//input[@name='lastName']") // Initiated xpath
		public WebElement LastName;
	
		//Enter phone number in Contact Tab
		@FindBy(xpath="//input[@name='phone']") // Initiated xpath
		public WebElement PhoneNumber;
	
		//Enter Email in Contact Tab
		@FindBy(xpath="//input[@id='userName']") // Initiated xpath
		public WebElement EmailAddress;
	
		//WebElement Addressline1
		@FindBy(xpath="//input[@name='address1']") // Initiated xpath
		public WebElement AddressLine1;
		
		//WebElement Addressline2
		@FindBy(xpath="//input[@name='address2']") // Initiated xpath
		public WebElement AddressLine2;
		
		//WebElement City
		@FindBy(xpath="//input[@name='city']") // Initiated xpath
		public WebElement City;
		
		//WebElement State
		@FindBy(xpath="//input[@name='state']") // Initiated xpath
		public WebElement State;
		
		//WebElement Postal Code
		@FindBy(xpath="//input[@name='postalCode']") // Initiated xpath
		public WebElement Postal;
		
		//WebElement Country
		@FindBy(xpath="//select[@name='country']") // Initiated xpath
		public WebElement Country;
		
		//WebElement UserName
		@FindBy(xpath="//input[@id='email']") // Initiated xpath
		public WebElement UserName;
		
		//WebElement Password
		@FindBy(xpath="//input[@name='password']") // Initiated xpath
		public WebElement Password;
		
		//WebElement Confirm Password
		@FindBy(xpath="//input[@name='confirmPassword']") // Initiated xpath
		public WebElement ConfirmPassword;
		
		//WebElement Submit Button
		@FindBy(xpath="//input[@name='register']") // Initiated xpath
		public WebElement SubmitButton;

}

