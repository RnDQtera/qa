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

WebUI.click(findTestObject('Damaged Asset (Tag)/Object210_tab repair'))

WebUI.click(findTestObject('Damaged Asset (Tag)/Object211_Filter Repair'))

WebUI.click(findTestObject('Damaged Asset (Tag)/Object212b_select status repair'))

WebUI.click(findTestObject('Damaged Asset (Tag)/Object213a_Search Status Repair'))

WebUI.setText(findTestObject('Damaged Asset (Tag)/Object213a_Search Status Repair'), 'Under Repair')

WebUI.click(findTestObject('Damaged Asset (Tag)/Object214b_check value text'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Damaged Asset (Tag)/Object215a_apply filter'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

TestObject myObject = findTestObject('Damaged Asset (Tag)/Object216a_single action completion')

WebUI.waitForElementClickable(myObject, 10)

WebUI.delay(3)

WebUI.click(myObject)

WebUI.click(findTestObject('Damaged Asset (Tag)/Object217a_choose completion'))

WebUI.click(findTestObject('Damaged Asset (Tag)/Object276_Scan Rfid Completion'))

WebUI.mouseOver(findTestObject('Damaged Asset (Tag)/Object202_sync scan'))

WebUI.click(findTestObject('Damaged Asset (Tag)/Object202_sync scan'))

WebUI.click(findTestObject('1 Object011_closed scan rfid in asset repair'))

WebUI.delay(3)

WebUI.click(findTestObject('Damaged Asset (Tag)/Object276_Scan Rfid Completion'))

WebUI.delay(3)

WebUI.click(findTestObject('Damaged Asset (Tag)/Object277_Internal repair result'))

WebUI.click(findTestObject('Damaged Asset (Tag)/Object278_choose Sucess'))

WebUI.delay(2)

WebUI.setText(findTestObject('Damaged Asset (Tag)/Object279_Repair Details'), 'Asset is Broken')

WebUI.click(findTestObject('Damaged Asset (Tag)/Object280_additional cost'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Damaged Asset (Tag)/Object281_name part'), 'Biaya Service')

WebUI.setText(findTestObject('Damaged Asset (Tag)/Object282_qty'), '2')

WebUI.setText(findTestObject('Damaged Asset (Tag)/Object283_price per unit'), '1000000')

WebUI.click(findTestObject('Damaged Asset (Tag)/Object284_ submit additional cost'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Damaged Asset (Tag)/Object285_submit form asset repair'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(7, FailureHandling.STOP_ON_FAILURE)

WebUI.takeScreenshot('Damaged and maintenance/Finish Asset Repair.png', FailureHandling.STOP_ON_FAILURE)

