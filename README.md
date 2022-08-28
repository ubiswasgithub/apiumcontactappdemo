Appium setup
Prerequisite:
1.	Node js ( download latest node js and install )[run command : node –v to check the installed version, run command: npm  -v to check the NPM version]
2.	Appium ( install appium by using the command : npm install –g appium). Check appium installation by running the command : appium
3.	Appium-desktop client ( download and install latest appium desktop client)
4.	Appium-doctor ( install appium doctor by using the command: npm install –g appium-doctor). 
5.	Appium inspector ( install appium inspector )
6.	Android studio (download and install latest android sutido). Set path variable for adb.

Run the command: appium-doctor –android form the command line to check the android installation. If anything required package is missing install them. 
Environment setup:
1.	Set path variable for adb : go to path variable and add the path for the platform-tools : C:\Users\<username>\AppData\Local\Android\Sdk\platform-tools
Appium server vs Inspector connection:
1.	Start Appium server:
a.	Open the appium desktop client > go to advance and set the server as localhost and port as 4723
b.	Select “Allow-CORS”
2.	Open appium inspector and
a.	 set the server as localhost and port as 4723 and remote path = /wd/hub
b.	Select “Allow unauthorized Certificates
3.	Set desired capabilities based on attached device. In my case it was:
{
  "deviceName": "motog",
  "platformName": "Android",
  "automationName": "UiAutomator2",
  "platformVersion": "10"
}
Get device details
1.	Get device details by running the command : adb devices
Real device setup
•	Developer option 
•	Enable and disable USB debugging
Finding package and appactivtity name:
1.	Open the app and connect the device to the machine
2.	Run the command: 
a.	adb shell 
b.	dumpsys window windows | grep  -E “mObscuringWindow”  or dumpsys window windows | grep -E "mCurrentFocus|mFocusedApp"
Example: for native Contact app: com.google.android.contacts [package]/ com.android.contacts.activities.PeopleActivity [activity Name]


POM file:

<dependencies>
		<!-- https://mvnrepository.com/artifact/io.appium/java-client -->
		<dependency>
			<groupId>io.appium</groupId>
			<artifactId>java-client</artifactId>
			<version>8.1.1</version>
		</dependency>
		<!-- https://mvnrepository.com/artifact/org.testng/testng -->
		<dependency>
			<groupId>org.testng</groupId>
			<artifactId>testng</artifactId>
			<version>7.6.1</version>
			<scope>test</scope>
		</dependency>

	</dependencies>
