package bdd.utilities;

import cucumber.api.java.After;

public class AfterActions {

	@After //Created a class
	public void afterAction(){
		SetupDrivers.tearDownDriver(); // calling method to close driver after every feature file
		System.out.println("----------");
	}
}
