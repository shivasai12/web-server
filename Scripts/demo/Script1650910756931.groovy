import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.makemytrip.com/')

WebUI.click(findTestObject('Object Repository/Page_MakeMyTrip - 1 Travel Website 50 OFF o_75db21/div_Introducing myBiz_loginModal displayBlo_e3f081'))

WebUI.click(findTestObject('Object Repository/Page_MakeMyTrip - 1 Travel Website 50 OFF o_75db21/label_FromDEL, Delhi Airport India'))

WebUI.setText(findTestObject('Object Repository/Page_MakeMyTrip - 1 Travel Website 50 OFF o_75db21/input_DEL, Delhi Airport India_react-autosu_75b041'), 
    'Hyderabad')

WebUI.click(findTestObject('Object Repository/Page_MakeMyTrip - 1 Travel Website 50 OFF o_75db21/img_DEL, Delhi Airport India_icLocAlt appendRight8'))

WebUI.setText(findTestObject('Object Repository/Page_MakeMyTrip - 1 Travel Website 50 OFF o_75db21/input_BLR, Bengaluru International Airport _adb91c'), 
    'Delhi')

WebUI.click(findTestObject('Object Repository/Page_MakeMyTrip - 1 Travel Website 50 OFF o_75db21/span__langCardClose'))

WebUI.click(findTestObject('Object Repository/Page_MakeMyTrip - 1 Travel Website 50 OFF o_75db21/p_New Delhi, India'))

WebUI.click(findTestObject('Object Repository/Page_MakeMyTrip - 1 Travel Website 50 OFF o_75db21/div_Sa_hsBackDrop'))

WebUI.click(findTestObject('Object Repository/Page_MakeMyTrip - 1 Travel Website 50 OFF o_75db21/a_Search'))

