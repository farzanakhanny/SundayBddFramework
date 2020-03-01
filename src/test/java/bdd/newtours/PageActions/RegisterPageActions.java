package bdd.newtours.PageActions;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import bdd.newtours.PageElements.RegisterPageLocators;
import bdd.utilities.ReadExcelSheetData;

public class RegisterPageActions {
	
	RegisterPageLocators newtoursRegisterPageLocators = new RegisterPageLocators();
	ReadExcelSheetData ExcelData = new ReadExcelSheetData();
	
	public void fillUpContactInfo() throws Exception{
		newtoursRegisterPageLocators.FirstName.sendKeys(ReadExcelSheetData.getMapData("FirstName"));
		newtoursRegisterPageLocators.LastName.sendKeys("Khan");
		newtoursRegisterPageLocators.PhoneNumber.sendKeys("3479095000");
		newtoursRegisterPageLocators.EmailAddress.sendKeys("farzanakhan7112@gmail.com");
	}

	public void fillUpMailingInfo(){
		
		newtoursRegisterPageLocators.AddressLine1.sendKeys("540 Main St.");
		newtoursRegisterPageLocators.AddressLine2.sendKeys("Apt 1");
		newtoursRegisterPageLocators.City.sendKeys("New York");
		newtoursRegisterPageLocators.State.sendKeys("NY");
		newtoursRegisterPageLocators.Postal.sendKeys("11385");
		
		Select mydrpdwn = new Select(newtoursRegisterPageLocators.Country);
		mydrpdwn.selectByVisibleText("UNITED STATES");
		
	}
	
	public void fillUpUserInfo(String UserName){
		
		newtoursRegisterPageLocators.UserName.sendKeys(UserName);
		newtoursRegisterPageLocators.Password.sendKeys("Green1");
		newtoursRegisterPageLocators.ConfirmPassword.sendKeys("Green1");
		
	}
	
	public void submitForm(){
		
		newtoursRegisterPageLocators.SubmitButton.click();
		
	}
}
