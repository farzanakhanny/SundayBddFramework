package bdd.stepDef;

import bdd.google.PageActions.SearchPageAction;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GoogleSearchSteps {

	
	SearchPageAction googlePage = new SearchPageAction();
	
	@Given("^Browse to Google homepage$")
	public void browse_to_Google_homepage() throws Throwable {
		
		googlePage.launchgoogleHomepage();
	}

	@When("^Search by \"([^\"]*)\"$")
	public void search_by(String Keyword) throws Throwable {
	   
		googlePage.searchByKeyword(Keyword);
	
	}

	@Then("^Verify search result appear$")
	public void verify_search_result_appear() throws Throwable {
	
		System.out.println("Search Complete");
	}



}
