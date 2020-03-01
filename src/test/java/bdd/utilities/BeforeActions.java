package bdd.utilities;

import cucumber.api.Scenario;
import cucumber.api.java.Before;

public class BeforeActions { 

	@Before //Setting up method which will run before running every feature file
	public void beforeAction(Scenario scen){
		System.out.println(">> Initializing Chrome Driver");
		SetupDrivers.setupDriver();			//Setting up driver and Calling actions from class
		System.out.println(scen.getName());
		
	}

}
