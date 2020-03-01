package bdd.newtours.PageActions;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;

import bdd.google.PageElements.SearchPageLocators;
import bdd.newtours.PageElements.HomePageLocators;
import bdd.utilities.ReadExcelSheetData;
import bdd.utilities.SetupDrivers;

public class NewtoursHomePageAction {

	HomePageLocators newtoursHomePageLocators = new HomePageLocators();
	
	SearchPageLocators googleHomeLocators; //initialize a newly created object and executes first, created constructor.
	//class initialized outside method
	
	public NewtoursHomePageAction(){
		newtoursHomePageLocators = new HomePageLocators();
	PageFactory.initElements(bdd.utilities.SetupDrivers.driver, newtoursHomePageLocators); 
	}
	
	public void launchNewtoursHomepage() throws Exception{
		
		System.out.println(ReadExcelSheetData.getMapData("FirstName"));
		SetupDrivers.driver.get("http://www.newtours.demoaut.com/");
		SetupDrivers.driver.manage().window().maximize();
		SetupDrivers.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	public void NavigatetoRegisterPage(){
		newtoursHomePageLocators.RegisterButton.click();
		
		
	}
}

