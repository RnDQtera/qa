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

WebUI.delay(12)

WebUI.click(findTestObject('Menu devices prelist change tag to type RFID/Object0838_menu prelist to rfid'))

WebUI.click(findTestObject('Menu devices prelist change to QR/Object0854_menu change to qr'))

WebUI.delay(2)

WebUI.click(findTestObject('Menu devices prelist change tag to type RFID/Object0849_checkbox item 1'))

WebUI.delay(2)

WebUI.click(findTestObject('Menu devices prelist change tag to type RFID/Object0850_bulk action'))

WebUI.click(findTestObject('Menu devices prelist change tag to type RFID/Object1206_bulk action i1'))

WebUI.delay(2)

WebUI.click(findTestObject('Menu devices prelist change tag to type RFID/Object0852_apply hapus prelist'))

WebUI.delay(2)

WebUI.click(findTestObject('Menu devices prelist change tag to type RFID/Object1207_scan rfid'))

WebUI.delay(2)

WebUI.click(findTestObject('Menu devices prelist change tag to type RFID/Object1208_sync now'))

WebUI.delay(2)

WebUI.click(findTestObject('Menu devices prelist change tag to type RFID/Object1209_close sync'))

WebUI.delay(2)

WebUI.click(findTestObject('Menu devices prelist change tag to type RFID/Object1207_scan rfid'))

WebUI.delay(12)

WebUI.click(findTestObject('Menu devices prelist change tag to type RFID/Object1210_next change'))

WebUI.delay(2)

WebUI.click(findTestObject('Menu devices rfid tag paired/Object1253_ya lanjutkan tanpat veriv'))

WebUI.delay(2)

WebUI.click(findTestObject('Menu devices rfid tag paired/Object1254_scan qr change tye'))

WebUI.delay(12)

WebUI.click(findTestObject('Menu devices rfid tag paired/Object1255_submit change type qr'))

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.takeScreenshot('Screenshot/TC.Log.048.009 change to rfid tag.png', FailureHandling.STOP_ON_FAILURE)

