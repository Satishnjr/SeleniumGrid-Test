
Echo off
Title ChromeDriver Node on port 4546

Echo Setting Project Location for Node
set projectLocation=D:\Satish\Selenium Grid\SeleniumGrid-Test
pushd %projectLocation%

Echo setting ChromeDriver path and creating Node on 4546
java -Dwebdriver.chrome.driver=C:\chrome-driver\chromedriver.exe -jar "D:\Satish\Selenium Grid\selenium-server-standalone-3.11.0.jar" -role node -hub http://localhost:4444/grid/register -port 4546 
pause		                                                                       