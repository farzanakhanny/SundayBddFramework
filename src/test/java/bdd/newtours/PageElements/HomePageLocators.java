package bdd.newtours.PageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageLocators {

	//Register button Locator
	@FindBy (xpath="//a[contains(text(),'REGISTER')]")
	public WebElement RegisterButton;
}
