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

WebUI.click(findTestObject('1 Object016_Button Audit'))

WebUI.delay(3)

WebUI.click(findTestObject('Audit/Object409_select sub tab task'))

WebUI.delay(3)

WebUI.click(findTestObject('Audit/Object410_Action Start Audit'))

WebUI.delay(4)

WebUI.click(findTestObject('Audit/Object411_Start Audit'))

WebUI.click(findTestObject('Audit/Object412_select for audit'))

WebUI.click(findTestObject('Audit/Object413_choose audit type'))

WebUI.click(findTestObject('Audit/Object414_start location audit'))

WebUI.click(findTestObject('Audit/Object415_sync process'))

WebUI.delay(5)

WebUI.click(findTestObject('Audit/Object416_closed sync'))

WebUI.click(findTestObject('Audit/Object412_select for audit'))

WebUI.click(findTestObject('Audit/Object413_choose audit type'))

WebUI.click(findTestObject('Audit/Object414_start location audit'))

WebUI.delay(5)

WebUI.click(findTestObject('Audit/Object431_Stop Scan RFID'))

WebUI.delay(5)

WebUI.click(findTestObject('Audit/Object429_Update Button Audited'))

WebUI.click(findTestObject('Audit/Object430_Update RFID'))

WebUI.delay(5)

WebUI.click(findTestObject('Audit/Object432_Select Condition'))

WebUI.delay(2)

WebUI.click(findTestObject('Audit/Object434_Asset Found Damaged Condition'))

WebUI.uploadFile(findTestObject('Audit/Object438_upload foto'), 'C:\\Users\\user\\Pictures\\1.png')

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Audit/Object439_apply image'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Audit/Object440_Set note for asset found damaged condition'), 'noted')

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Audit/Object441_Submit tag found damaged condition'), FailureHandling.STOP_ON_FAILURE)

