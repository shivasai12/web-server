import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.InternalData
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable

import org.openqa.selenium.By
import org.openqa.selenium.Keys
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement



InternalData data= findTestData('TestData1')

String fromCity= data.getObjectValue('From City', 1)
String toCity= data.getObjectValue('To City',1)
String booking= data.getObjectValue('Type of Booking',1)

WebUI.openBrowser(GlobalVariable.Url)
WebUI.maximizeWindow()

/*if(WebUI.verifyElementPresent(findTestObject('Object Repository/popupDialogTxt'), 5000)) {
	Thread.sleep(3000)
	WebUI.click(findTestObject('Object Repository/btnLogin'))
}*/

Thread.sleep(3000)



WebUI.click(findTestObject('Object Repository/btnLogin'))

WebUI.click(findTestObject('Object Repository/btnFlight', ['val': booking]))
WebUI.click(findTestObject('Object Repository/btnFromCity'))
WebUI.setText(findTestObject('Object Repository/dropdwnFrom'), fromCity)
Thread.sleep(2000)
WebUI.click(findTestObject('Object Repository/selectFromCity', ['id': fromCity]))

WebUI.sendKeys(findTestObject('Object Repository/dropdwnTo'), toCity)
WebUI.click(findTestObject('Object Repository/selectFromCity', ['id': toCity]))

WebUI.click(findTestObject('Object Repository/btnSearch'))

WebUI.waitForPageLoad(3000)

WebDriver driver= DriverFactory.getWebDriver()

MakeMyTrip_Utils utils=new MakeMyTrip_Utils()
utils.closePopup(driver)

List<WebElement> list= driver.findElements(By.xpath("//div[@id='listing-id']//following::div[@class='listingCard']//following::div[@class='textRight flexOne']"))

List<String> text= new ArrayList<String>();


for(WebElement element: list) {
	
	text.add(element.getText())
}


Collections.sort(text)

int i=0;
for(WebElement element:list) {
	i++
	if(element.getText().equals(text.get(0))) {
		
		driver.findElement(By.xpath("(//div[@id='listing-id']//following::div[@class='listingCard']//following::span[text()='View Prices'])["+i+"]")).click()
		
		break	
		
	}
}

