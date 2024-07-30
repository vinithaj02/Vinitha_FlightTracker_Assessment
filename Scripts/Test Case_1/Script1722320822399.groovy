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

WebUI.navigateToUrl('https://www.flightstats.com/v2/flight-tracker/search')

WebUI.click(findTestObject('Object Repository/Page_Flight Tracker - Track the current sta_48f692/button_Manage Cookie Settings_onetrust-clos_251e3b'))

WebUI.setText(findTestObject('Object Repository/Page_Flight Tracker - Track the current sta_48f692/input_Airline_airlineInput'), 
    'Indigo')

WebUI.click(findTestObject('Object Repository/Page_Flight Tracker - Track the current sta_48f692/span_(6E) IndiGo'))

WebUI.setText(findTestObject('Object Repository/Page_Flight Tracker - Track the current sta_48f692/input_Flight Number_flightNumberInputValue'), 
    '2056')

WebUI.click(findTestObject('Object Repository/Page_Flight Tracker - Track the current sta_48f692/span_Search'))

WebUI.click(findTestObject('Object Repository/Page_6E2056 - IndiGo 6E 2056 Flight Tracker/a_VIEW FLIGHT DETAILS'))

WebUI.click(findTestObject('Object Repository/Page_IndiGo 6E 2056 Flight Details, Notes, _d6a692/span_VIEW FLIGHT STATUS'))

WebUI.click(findTestObject('Object Repository/Page_6E2056 - IndiGo 6E 2056 Flight Tracker/div_Positional Tracking Has Ended_leaflet-m_2dfaaf'))

WebUI.click(findTestObject('Object Repository/Page_6E2056 - IndiGo 6E 2056 Flight Tracker/div_Positional Tracking Has Ended_leaflet-m_2dfaaf'))

WebUI.closeBrowser()

