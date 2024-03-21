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

WebUI.navigateToUrl(GlobalVariable.URL)

WebUI.setText(findTestObject('1 Object001_email'), GlobalVariable.email)

WebUI.setText(findTestObject('1 Object002_pw'), GlobalVariable.pw)

WebUI.click(findTestObject('1 Object003_btn login'))

WebUI.delay(10)

WebUI.click(findTestObject('1 Object004_fixedasset module'))

WebUI.delay(20)

WebUI.click(findTestObject('1 Object016_Button Audit'))

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Audit/Object446_Change log audit'))

WebUI.delay(2)

WebUI.click(findTestObject('Menu audit schedule/Object2058_bt filter cl'))

WebUI.delay(2)

WebUI.click(findTestObject('Audit/Object450_select date'))

WebUI.delay(2)

WebUI.click(findTestObject('Menu audit schedule/Object2056_tgl 1'))

WebUI.click(findTestObject('Menu audit schedule/Object2057_tgl 31'))

WebUI.delay(2)

WebUI.click(findTestObject('Audit/Object452_select action'))

WebUI.delay(2)

WebUI.click(findTestObject('Menu audit schedule/Object2059_cb 1 act'))

WebUI.delay(2)

WebUI.click(findTestObject('Audit/Object454_select field'))

WebUI.delay(2)

WebUI.click(findTestObject('Menu audit schedule/Object2060_cb 1 field'))

WebUI.delay(2)

WebUI.click(findTestObject('Audit/Object456_select modified'))

WebUI.delay(2)

WebUI.setText(findTestObject('Menu audit schedule/Object2062_ketik nama mod'), 'laur')

WebUI.delay(2)

WebUI.click(findTestObject('Menu audit schedule/Object2061_ cb 1 mod by'))

WebUI.delay(2)

WebUI.click(findTestObject('Audit/Object456_select modified'))

WebUI.click(findTestObject('Audit/Object458_apply filter'))

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.takeScreenshot('Screenshot/TC.Log.087.006 filter changelog audit schedule.png', FailureHandling.STOP_ON_FAILURE)

