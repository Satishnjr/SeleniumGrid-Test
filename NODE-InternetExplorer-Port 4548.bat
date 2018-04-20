Echo off
Title InternetExplorerDriver Node on port 4548

Echo Setting Project Location for Node
set projectLocation=D:\Satish\Selenium Grid\SeleniumGrid-Test
pushd %projectLocation%

Echo setting InternetExplorerDriver path and creating Node on 4548
java -Dwebdriver.ie.driver=D:\IEDriverServer.exe -jar "D:\Satish\Selenium Grid\selenium-server-standalone-3.11.0.jar" -role node -hub http://localhost:4444/grid/register -port 4548 
pause