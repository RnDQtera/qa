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

WebUI.delay(2)

WebUI.click(findTestObject('Menu audit schedule/Object2040_bt filter'))

WebUI.delay(2)

WebUI.click(findTestObject('Menu audit schedule/Object2041_dd freq'))

WebUI.delay(2)

WebUI.click(findTestObject('Menu audit schedule/Object2042_cb freq daily'))

WebUI.click(findTestObject('Menu audit schedule/Object2043_select cat'))

WebUI.delay(2)

WebUI.click(findTestObject('Menu audit schedule/Object2044_cb furn'))

WebUI.delay(2)

WebUI.click(findTestObject('Menu audit schedule/Object2045_apply cat'))

WebUI.click(findTestObject('Menu audit schedule/Object2046_date'))

WebUI.delay(2)

WebUI.click(findTestObject('Menu audit schedule/Object2047_tgl 1'))

WebUI.click(findTestObject('Menu audit schedule/Object2048_tgl 31'))

WebUI.setText(findTestObject('Menu audit schedule/Object2049_ketik dt11'), '1')

WebUI.setText(findTestObject('Menu audit schedule/Object2050_ketik ct 2'), '7')

WebUI.click(findTestObject('Menu audit schedule/Object2053_dd audit type'))

WebUI.delay(2)

WebUI.click(findTestObject('Menu audit schedule/Object2054_cb 2'))

WebUI.click(findTestObject('Menu audit schedule/Object2051_dd status'))

WebUI.delay(2)

WebUI.click(findTestObject('Menu audit schedule/Object2052_activ'))

WebUI.click(findTestObject('Menu audit schedule/Object2055_apply filter'))

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.takeScreenshot('Screenshot/TC.Log.087.004 filter audit schedule.png', FailureHandling.STOP_ON_FAILURE)

