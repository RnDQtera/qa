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

WebUI.maximizeWindow(FailureHandling.STOP_ON_FAILURE)

WebUI.navigateToUrl(GlobalVariable.localhost)

WebUI.click(findTestObject('1 localhost - advance'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('1 localhost - process localhost'), FailureHandling.STOP_ON_FAILURE)

WebUI.navigateToUrl(GlobalVariable.URL)

WebUI.setText(findTestObject('1 Object001_email'), GlobalVariable.email)

WebUI.setText(findTestObject('1 Object002_pw'), GlobalVariable.pw)

WebUI.click(findTestObject('1 Object003_btn login'))

WebUI.delay(10)

WebUI.click(findTestObject('1 Object004_fixedasset module'))

WebUI.delay(20)

WebUI.click(findTestObject('1 localhost -Add on'))

WebUI.click(findTestObject('1 localhost -Add on Maintenance'))

WebUI.delay(10)

WebUI.click(findTestObject('Routine Task/Object300_Tab Schedule Task'))

WebUI.click(findTestObject('Routine Task/Object301_Filter Schedule Task'))

WebUI.click(findTestObject('Routine Task/Object302_Select Status'))

WebUI.click(findTestObject('Review Maintenance/Object329_Choose Waiting for review'))

WebUI.delay(3)

WebUI.click(findTestObject('Routine Task/Object304_Submit Filter Data'))

WebUI.delay(3)

WebUI.click(findTestObject('Routine Task/Object305_Single Action Schedule Task'))

WebUI.click(findTestObject('Review Maintenance/Object330_Choose Review Maintenance'))

WebUI.click(findTestObject('Review Maintenance/Object331_Chose Approval'))

WebUI.click(findTestObject('Review Maintenance/Object332_select option approve'))

WebUI.setText(findTestObject('Review Maintenance/Object333_Set notes'), 'finish')

WebUI.click(findTestObject('Review Maintenance/Object334_Submit'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Review Maintenance/Object335_confirm submit form'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.takeScreenshot('Damaged and maintenance/Review Maintenance.png', FailureHandling.STOP_ON_FAILURE)

