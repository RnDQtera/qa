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

WebUI.setText(findTestObject('1 Object0001_Email'), GlobalVariable.EMAIL)

WebUI.setText(findTestObject('1 Object0002_Password'), GlobalVariable.PASSWORD)

WebUI.click(findTestObject('1 Object0003_Button login'))

WebUI.click(findTestObject('1 Object0004_Module Fixed Asset'))

WebUI.delay(10)

WebUI.click(findTestObject('1 Object0005_Menu atas fixed asset'))

WebUI.click(findTestObject('1 Object0007_menu available fixed asset'))

WebUI.click(findTestObject('Fixed asset transfer asset/Object0041_filter menu available'))

WebUI.delay(3)

WebUI.click(findTestObject('Filter available asset/Object1030_dropdown tag'))

WebUI.delay(3)

WebUI.click(findTestObject('Filter available asset/Object1031_checkbox tag'))

WebUI.click(findTestObject('Fixed asset transfer asset/Object0040_dropdown menu available filter'))

WebUI.delay(10)

WebUI.setText(findTestObject('Fixed asset transfer asset/Object0042_ketik menu filter nama available'), 'kursi')

WebUI.delay(3)

WebUI.click(findTestObject('Fixed asset transfer asset/Object0044_pilih menu filter nama available'))

WebUI.click(findTestObject('Fixed asset transfer asset/Object0037_apply filter available'))

WebUI.delay(10)

WebUI.click(findTestObject('Fixed asset transfer asset/Object0048_titik 3 available'))

WebUI.delay(3)

WebUI.click(findTestObject('Fixed asset transfer asset/Object0038_available transfer'))

WebUI.click(findTestObject('Fixed asset transfer asset/Object0046_select group transfer'))

WebUI.doubleClick(findTestObject('Fixed asset transfer asset/Object0050_transfer group index 4'))

WebUI.click(findTestObject('Fixed asset transfer asset/Object0036_apply asset transfer'))

WebUI.delay(5)

WebUI.click(findTestObject('Fixed asset transfer asset/Object0047_submit asset transfer'))

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.takeScreenshot('Screenshot/TC.Log.003.001 Transfer asset.png', FailureHandling.STOP_ON_FAILURE)

