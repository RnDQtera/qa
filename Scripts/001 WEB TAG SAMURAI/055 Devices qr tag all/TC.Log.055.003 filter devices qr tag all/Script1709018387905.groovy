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

WebUI.navigateToUrl(GlobalVariable.URL)

WebUI.delay(3)

WebUI.setText(findTestObject('1 Object0001_Email'), GlobalVariable.EMAIL)

WebUI.setText(findTestObject('1 Object0002_Password'), GlobalVariable.PASSWORD)

WebUI.click(findTestObject('1 Object0003_Button login'))

WebUI.click(findTestObject('1 Object0004_Module Fixed Asset'))

WebUI.delay(15)

WebUI.click(findTestObject('1 Object0770_menu atas devices'))

WebUI.delay(5)

WebUI.click(findTestObject('1 Object0771_devices rfid qr tag'))

WebUI.delay(5)

WebUI.click(findTestObject('Menu devices qr tag all/Object0884_Menu devices qr tag all'))

WebUI.delay(12)

WebUI.click(findTestObject('Menu device rfid tag all/Object0776_bt filter devices rfid tag'))

WebUI.click(findTestObject('Menu device rfid tag all/Object0777_dropdown filter devices rfid tag'))

WebUI.delay(3)

WebUI.setText(findTestObject('Menu device rfid tag all/Object1377_ketik asset name'), 'tru')

WebUI.click(findTestObject('Menu device rfid tag all/Object0778_checkbox filter devices rfid tag'))

WebUI.click(findTestObject('Menu device rfid tag all/Object1032_dropdown tag'))

WebUI.delay(3)

WebUI.click(findTestObject('Menu device rfid tag all/Object1033_checkbox tag'))

WebUI.click(findTestObject('Menu device rfid tag all/Object1158_dd status'))

WebUI.delay(3)

WebUI.click(findTestObject('Menu device rfid tag all/Object1159_paired'))

WebUI.click(findTestObject('Menu device rfid tag all/Object1160_select group'))

WebUI.delay(3)

WebUI.click(findTestObject('Menu device rfid tag all/Object1161_group 1'))

WebUI.delay(3)

WebUI.click(findTestObject('Menu device rfid tag all/Object1162_apply filter'))

WebUI.delay(3)

WebUI.click(findTestObject('Menu device rfid tag all/Object0779_apply filter devices rfid tag'))

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.takeScreenshot('Screenshot/TC.Log.055.003 filter devices qr tag all.png', FailureHandling.STOP_ON_FAILURE)

