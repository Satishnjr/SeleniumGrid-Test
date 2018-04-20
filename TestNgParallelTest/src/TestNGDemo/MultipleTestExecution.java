package TestNGDemo;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MultipleTestExecution {

	public static WebDriver driver;

	@Test
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\chrome-driver\\chromedriver.exe");
		driver = new ChromeDriver();

		Reporter.log("Test1 is executed via Thread and Thread Id is " + Thread.currentThread().getId(), true);

	}

	@Test
	public void loginApplication() {

		Reporter.log("Test2 is executed via Thread and Thread Id is " + Thread.currentThread().getId(), true);
	}

	@Test
	public void logoutApplication() {

		Reporter.log("Test3 is executed via Thread and Thread Id is " + Thread.currentThread().getId(), true);
	}

}
