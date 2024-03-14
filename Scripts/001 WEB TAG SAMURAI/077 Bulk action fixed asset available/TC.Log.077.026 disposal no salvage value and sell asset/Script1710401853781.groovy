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

WebUI.delay(3)

WebUI.click(findTestObject('1 Object0003_Button login'))

WebUI.click(findTestObject('1 Object0004_Module Fixed Asset'))

WebUI.delay(10)

WebUI.click(findTestObject('1 Object0005_Menu atas fixed asset'))

WebUI.delay(10)

WebUI.click(findTestObject('Menu available asset/Object0060_button menu available asset'))

WebUI.delay(10)

WebUI.click(findTestObject('Filter available asset/Object0057_button filter asset'))

WebUI.delay(3)

WebUI.click(findTestObject('Filter available asset/Object1030_dropdown tag'))

WebUI.delay(3)

WebUI.click(findTestObject('Filter available asset/Object1031_checkbox tag'))

WebUI.click(findTestObject('Filter available asset/Object0059_dropdown filter asset name'))

WebUI.delay(3)

WebUI.setText(findTestObject('Menu single action fixed asset available/Object1382_ketik filter nama asset'), 'kursi')

WebUI.delay(3)

WebUI.click(findTestObject('Menu single action fixed asset available/Object1384_cb 1 nama asset'))

WebUI.delay(3)

WebUI.click(findTestObject('Filter available asset/Object0056_apply filter avail asset'))

WebUI.delay(3)

WebUI.click(findTestObject('Bulk option available asset/Object0054_checkbox i1 avail asset'))

WebUI.click(findTestObject('Bulk option available asset/Object0052_button bulk action avail asset'))

WebUI.delay(3)

WebUI.click(findTestObject('Menu bulk action fixed asset available/Object1588_disposal'))

WebUI.click(findTestObject('Bulk option available asset/Object0051_button apply bulk action'))

WebUI.delay(5)

WebUI.click(findTestObject('Menu titik 3 fixed asset disposal prelist/Object0567_dropdown reason req disposal'))

WebUI.delay(8)

WebUI.click(findTestObject('Menu titik 3 fixed asset disposal prelist/Object0752_checkbox reason req disposal 3'))

WebUI.click(findTestObject('Menu titik 3 fixed asset disposal prelist/Object0569_dropdown metode req disposal'))

WebUI.delay(5)

WebUI.click(findTestObject('Menu titik 3 fixed asset disposal prelist/Object0754_checkbox metode req disposal 2'))

WebUI.setText(findTestObject('Menu titik 3 fixed asset disposal prelist/Object0755_isi nama penerima disposal asset'), 'PT B')

WebUI.click(findTestObject('Menu titik 3 fixed asset disposal prelist/Object0571_submit req disposal'))

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.takeScreenshot('Screenshot/TC.Log.077.026 disposal no salvage value and sell asset.png', FailureHandling.STOP_ON_FAILURE)

