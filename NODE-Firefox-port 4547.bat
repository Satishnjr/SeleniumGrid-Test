Echo off
Title FirefoxDriver Node on port 4547

Echo Setting Project Location for Node
set projectLocation=D:\Satish\Selenium Grid\SeleniumGrid-Test
pushd %projectLocation%

Echo setting GeckoDriver path and creating Node on 4547
java -Dwebdriver.gecko.driver=D:\geckodriver.exe -jar "D:\Satish\Selenium Grid\selenium-server-standalone-3.11.0.jar" -role node -hub http://localhost:4444/grid/register -port 4547 
pause