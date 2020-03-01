package bdd.google.PageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPageLocators {
	
	//Search Box Locator
			@FindBy (xpath="//input[@title='Search']")
			public WebElement SearchBox;
			
	//Search Box Locator
			@FindBy (xpath="//input[@value='Google Search']")
			public WebElement ClickBtn;

}
