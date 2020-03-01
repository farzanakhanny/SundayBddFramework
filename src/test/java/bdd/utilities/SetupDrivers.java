package bdd.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SetupDrivers {

	public static WebDriver driver; //**Creating an instance of driver

	public static void setupDriver() {
		WebDriverManager.chromedriver().version("79.0.3945.36").setup(); //dynamically downloading driver
		
		ChromeOptions options = new ChromeOptions(); //creating driver options
		options.addArguments("--disable-notifications"); // driver options
		driver = new ChromeDriver(options); // **initializing driver
	
		//driver = new ChromeDriver();
	}

	public static WebDriver getDriver() { //encapsulation method
		return driver;

	}

	public static void tearDownDriver() {
		driver.quit();// closing driver
	}

}
