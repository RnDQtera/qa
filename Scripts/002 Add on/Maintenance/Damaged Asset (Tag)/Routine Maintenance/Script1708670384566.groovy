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

WebUI.click(findTestObject('1 Object004_fixedasset module'))

WebUI.delay(20)

WebUI.click(findTestObject('1 localhost -Add on'))

WebUI.click(findTestObject('1 localhost -Add on Maintenance'))

WebUI.delay(10)

WebUI.click(findTestObject('Routine Task/Object300_Tab Schedule Task'))

WebUI.click(findTestObject('Routine Task/Object301_Filter Schedule Task'))

WebUI.click(findTestObject('Routine Task/Object302_Select Status'))

WebUI.click(findTestObject('Routine Task/Object303_check waiting for assignment'))

WebUI.delay(3)

WebUI.click(findTestObject('Routine Task/Object304_Submit Filter Data'))

WebUI.delay(3)

WebUI.click(findTestObject('Routine Task/Object305_Single Action Schedule Task'))

WebUI.click(findTestObject('Routine Task/Object306_Menu Assign Staff'))

WebUI.click(findTestObject('Routine Task/Object307_Button Assign'))

WebUI.click(findTestObject('Routine Task/Object308_Search Assign Staff'))

WebUI.setText(findTestObject('Routine Task/Object309_Find Text'), 'Laurent abigails')

WebUI.sendKeys(findTestObject('Routine Task/Object309_Find Text'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Routine Task/Object310_Choose User'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Routine Task/Object311_Apply Choose User'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Routine Task/Object312_Submit Assign Staff'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.takeScreenshot('Damaged and maintenance/Assign Asset in Routine.png', FailureHandling.STOP_ON_FAILURE)

