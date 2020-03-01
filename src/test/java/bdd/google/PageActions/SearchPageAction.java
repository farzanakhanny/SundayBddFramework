package bdd.google.PageActions;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.PageFactory;
import bdd.google.PageElements.SearchPageLocators;

import bdd.utilities.SetupDrivers;

public class SearchPageAction {
	
	
	SearchPageLocators googleHomeLocators; //initialize a newly created object and executes first, created constructor.
	//class initialized outside method
	
	public SearchPageAction(){
	googleHomeLocators = new SearchPageLocators();
	PageFactory.initElements(bdd.utilities.SetupDrivers.driver, googleHomeLocators); //PageFactory to instantiate the instance of the PageObject.
																			//every time we call a method on the WebElement,
																			//the driver will go and find it on the current page again.
	}
	
	public void launchgoogleHomepage() throws Exception{
		
		bdd.utilities.SetupDrivers.driver.get("https://www.google.com/");
		bdd.utilities.SetupDrivers.driver.manage().window().maximize();
		bdd.utilities.SetupDrivers.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}
	
	public void searchByKeyword(String Keyword) {
		
		googleHomeLocators.SearchBox.sendKeys(Keyword);
		googleHomeLocators.ClickBtn.click();
		
	}
}