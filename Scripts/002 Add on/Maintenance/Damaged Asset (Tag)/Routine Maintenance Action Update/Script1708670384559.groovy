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

WebUI.click(findTestObject('Routine Task/Object313_Check Under Maintenance'))

WebUI.delay(3)

WebUI.click(findTestObject('Routine Task/Object304_Submit Filter Data'))

WebUI.delay(3)

WebUI.click(findTestObject('Routine Task/Object305_Single Action Schedule Task'))

WebUI.click(findTestObject('Routine Task/Object315_Update'))

WebUI.delay(3)

WebUI.click(findTestObject('Routine Task/Object314_Scan Asset'))

WebUI.mouseOver(findTestObject('1 Object007_sync process'))

WebUI.click(findTestObject('1 Object007_sync process'))

WebUI.delay(5)

WebUI.click(findTestObject('Routine Task/Object316_Closed Scan'))

WebUI.click(findTestObject('Routine Task/Object314_Scan Asset'))

WebUI.delay(5)

WebUI.setText(findTestObject('Routine Task/Object317_Set input text'), '50')

WebUI.click(findTestObject('Routine Task/Object318_check using third party'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Routine Task/Object319_select service center'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Routine Task/Object320_choose service center'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Routine Task/Object321_check for additional cost'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Routine Task/Object322_add component'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Routine Task/Object323_name part or service'), 'Service')

WebUI.setText(findTestObject('Routine Task/Object324_number qty'), '1')

WebUI.setText(findTestObject('Routine Task/Object325_Unit price'), '500000')

WebUI.delay(15, FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Routine Task/Object326_Set note'), 'Finish ')

WebUI.click(findTestObject('Routine Task/Object327_Submit'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Routine Task/Object328_submit confirm'), FailureHandling.STOP_ON_FAILURE)

