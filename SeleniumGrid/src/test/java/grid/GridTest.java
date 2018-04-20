package grid;
import java.net.MalformedURLException;
import java.net.URL;
 
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;
 
public class SeleniumGridTest 
{
 
@Test
public void runFirefox() throws MalformedURLException
{
 
// We have to mention browser which we want to use for test execution
DesiredCapabilities cap=DesiredCapabilities.firefox();
 
// Set the platform where we want to run our test- we can use MAC and Linux and other platforms as well
cap.setPlatform(Platform.WINDOWS);
 
// Here you can use hub address, hub will take the responsibility to execute the test on respective node
URL url=new URL("http://localhost:4444/wd/hub");
 
// Create driver with hub address and capability
WebDriver driver=new RemoteWebDriver(url, cap);
 
// start application
driver.get("http://learn-automation.com/");
 
// get the title and print the same
System.out.println("Blog title is "+driver.getTitle());
 
driver.close();
 
}
 
}
HOMESELENIUM FRAMEWORKAPPIUMSELENIUM VIDEOSTESTNGKATALONTRAININGSERVICESCONTACT USABOUT MECUCUMBERWORKSHOPTOOLS GUEST AUTHOR

HOMEADVANCE SELENIUMComplete Setup Of Selenium Grid 2.0 With Hub And Node Setup
Complete setup of Selenium Grid 2.0 with Hub and Node setup
Selenium grid has introduced in Selenium RC itself and it is known as Selenium Grid 1.0 if you are using with Selenium RC. We can use Selenium Grid for remote execution on the different platform.This article will Guide you how to use Selenium grid in selenium webdriver.

What is Selenium Grid
Selenium grid is the concept which will allow you to run your test on multiple machines and on multiple browsers. Selenium grid will actually help you run the test on multiple nodes which will reduce the total execution time which is the main advantage of Test Automation.

Let me explain through an example- Let’s say you have 1 script which you need to run on MAC, Linux, Unix and Windows then you have 2 approaches.

1- Setup the complete infrastructure in every machine to run test (not recommended)

2- Setup the grid environment to run test on all platform with the help of Node and Hub concept (Recommended)

To understand the Selenium grid we need to understand HUB and NODE concept which will actually help you to create grid environment.

 

Hub – Hub will be the central machine which will redirect the commands to the respective node based on parameter

Node- Node will be the actual machine where the test will be executed.

 

Youtube Video for Selenium Grid


 

Below diagram will actually represent the Grid concept.

Selenium grid in selenium webdriver

 

Above image explains you Selenium hub can redirect the command to the respective node based on parameters.

 

Selenium grid in selenium webdriver
How to start Selenium Hub
Before proceeding further you should have selenium server standalone jar in your local machine because this jar file only will create Selenium hub and Selenium node for test execution.

If you do not have selenium server then you can download from their official site

 

Selenium grid in selenium webdriver

 

Once the file is downloaded you can start with hub creation.

Open CMD and execute below command

java -jar selenium-server-standalone-2.53.1.jar -role hub

Selenium Grid for remote execution

Hit enter and you will get grid is up and running

Selenium Grid for remote execution

Once Selenium hub  is ready then you can check the status on the browser as well.

Open http://localhost:4444/grid/consoles on local browser and hit enter

You will get below screen with no node connected

Selenium Grid for remote execution

Now we need to create node and hub will manage the nodes.Let’s create a node and then we will trigger the test on the node.

How to start Selenium node
To start the node execute below command and it will start the node

java -jar selenium-server-standalone-2.53.1.jar -role node  -hub http://localhost:4444/grid/register

Selenium Grid for remote execution

Selenium Grid for remote execution

 

Once node is connected just open the hub Dashboard and you can see node is connected and you can see the webdriver and RC instances

By default, once node is created you will get 11 instances for WebDriver and 11 Instance of  RC

5 Firefox, 5 Chrome and 1 IE browser

It means you can run 5 FF,5 Chrome, and 1 IE browser if you want to run more test on this browser then you can change from the command line while creating the node.

Selenium Grid for remote execution

Selenium Grid for remote execution
Now we can start implementing part, we have to use RemoteWebDriver to execute our test on grid environment. We also have to use DesiredCapability class to specify platform name and browsers as well.

 


