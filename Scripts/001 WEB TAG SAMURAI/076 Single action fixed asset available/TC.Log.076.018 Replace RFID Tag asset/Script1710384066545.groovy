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

WebUI.delay(3)

WebUI.navigateToUrl(GlobalVariable.URL)

WebUI.delay(15)

WebUI.setText(findTestObject('1 Object0001_Email'), GlobalVariable.EMAIL)

WebUI.setText(findTestObject('1 Object0002_Password'), GlobalVariable.PASSWORD)

WebUI.delay(3)

WebUI.click(findTestObject('1 Object0003_Button login'))

WebUI.delay(3)

WebUI.click(findTestObject('1 Object0004_Module Fixed Asset'))

WebUI.delay(10)

WebUI.click(findTestObject('1 Object0005_Menu atas fixed asset'))

WebUI.click(findTestObject('1 Object0007_menu available fixed asset'))

WebUI.click(findTestObject('Fixed asset transfer asset/Object0041_filter menu available'))

WebUI.delay(3)

WebUI.click(findTestObject('Filter available asset/Object1030_dropdown tag'))

WebUI.delay(3)

WebUI.click(findTestObject('Menu single action fixed asset available/Object1397_rfid tag'))

WebUI.click(findTestObject('Fixed asset transfer asset/Object0040_dropdown menu available filter'))

WebUI.delay(10)

WebUI.setText(findTestObject('Fixed asset transfer asset/Object0042_ketik menu filter nama available'), 'kursi')

WebUI.delay(3)

WebUI.click(findTestObject('Fixed asset transfer asset/Object0044_pilih menu filter nama available'))

WebUI.click(findTestObject('Fixed asset transfer asset/Object0037_apply filter available'))

WebUI.delay(10)

WebUI.click(findTestObject('Menu single action fixed asset available/Object1398_titik 1 i1'))

WebUI.delay(3)

WebUI.click(findTestObject('Menu single action fixed asset available/Object1572_replace tag'))

WebUI.delay(2)

WebUI.click(findTestObject('Menu devices rfid tag paired/Object1262_scan rfid'))

WebUI.delay(2)

WebUI.click(findTestObject('Menu devices rfid tag paired/Object1263_sync'))

WebUI.delay(2)

WebUI.click(findTestObject('Menu devices rfid tag paired/Object1264_close sync replace'))

WebUI.delay(2)

WebUI.click(findTestObject('Menu devices rfid tag paired/Object1262_scan rfid'))

WebUI.delay(12)

WebUI.click(findTestObject('Menu devices replace rfid prelis/Object1214_submit'))

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.takeScreenshot('Screenshot/TC.Log.076.018 Replace RFID Tag asset.png', FailureHandling.STOP_ON_FAILURE)

