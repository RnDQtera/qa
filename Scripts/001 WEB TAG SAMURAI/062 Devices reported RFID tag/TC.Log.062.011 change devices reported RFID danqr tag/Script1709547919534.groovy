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

WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.localhost)

WebUI.click(findTestObject('1 localhost - advance'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('1 localhost - process localhost'), FailureHandling.STOP_ON_FAILURE)

WebUI.navigateToUrl(GlobalVariable.URL)

WebUI.delay(3)

WebUI.setText(findTestObject('1 Object0001_Email'), GlobalVariable.EMAIL)

WebUI.setText(findTestObject('1 Object0002_Password'), GlobalVariable.PASSWORD)

WebUI.click(findTestObject('1 Object0003_Button login'))

WebUI.click(findTestObject('1 Object0004_Module Fixed Asset'))

WebUI.delay(15)

WebUI.click(findTestObject('1 Object0770_menu atas devices'))

WebUI.delay(3)

WebUI.click(findTestObject('1 Object0771_devices rfid qr tag'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(8)

WebUI.click(findTestObject('Menu devices reported RFID tag/Object0923_menu reported'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(12)

WebUI.click(findTestObject('Menu devices reported RFID tag/Object0937_checkbox item 1'))

WebUI.click(findTestObject('Menu devices reported RFID tag/Object0938_bt bulk action'))

WebUI.delay(3)

WebUI.click(findTestObject('Menu devices reported RFID tag/Object1225_bulk change rfid qr'))

WebUI.click(findTestObject('Menu devices reported RFID tag/Object0940_apply bulk action'))

WebUI.delay(3)

WebUI.click(findTestObject('Menu devices replace rfid prelis/Object1213_scan rfid'))

WebUI.delay(2)

WebUI.click(findTestObject('Menu devices replace rfid prelis/Object1216_sync now'))

WebUI.delay(2)

WebUI.click(findTestObject('Menu devices replace rfid prelis/Object1217_close sync'))

WebUI.delay(2)

WebUI.click(findTestObject('Menu devices replace rfid prelis/Object1214_submit'))

WebUI.delay(2)

WebUI.click(findTestObject('Menu devices replace rfid prelis/Object1215_ya lanjtukan'))

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.takeScreenshot('Screenshot/TC.Log.062.011 bulk action change devices reported rfid dan qr.png', FailureHandling.STOP_ON_FAILURE)

