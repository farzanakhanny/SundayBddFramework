package bdd.stepDef;

import bdd.newtours.PageActions.NewtoursHomePageAction;
import bdd.newtours.PageActions.RegisterConfrPageAction;
import bdd.newtours.PageActions.RegisterPageActions;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class NewtoursRegisterSteps {
	
	NewtoursHomePageAction homePageAction = new NewtoursHomePageAction();
	RegisterPageActions newtoursRegisterPageActions = new RegisterPageActions();
	RegisterConfrPageAction registerConfrPageActionsobj = new RegisterConfrPageAction();

	@Given("^Browse to Newtours homepage$")
	public void browse_to_Newtours_homepage() throws Throwable {
		homePageAction.launchNewtoursHomepage();
	}

	@When("^Navigate to Register page$")
	public void navigate_to_Register_page() throws Throwable {
		homePageAction.NavigatetoRegisterPage();
	}

	@When("^Fill form with some basic information$")
	public void fill_form_with_some_basic_information() throws Throwable {
		newtoursRegisterPageActions.fillUpContactInfo();
		newtoursRegisterPageActions.fillUpMailingInfo();
		
	}

	@When("^Complete creating account with \"([^\"]*)\"$")
	public void complete_creating_account_with(String UserName) throws Throwable {
		newtoursRegisterPageActions.fillUpUserInfo(UserName);
		newtoursRegisterPageActions.submitForm();

	}

	@Then("^Verify account created successfully$")
	public void verify_account_created_successfully() throws Throwable {
	    registerConfrPageActionsobj.verifyThankyouRegister();
		
	}


}
