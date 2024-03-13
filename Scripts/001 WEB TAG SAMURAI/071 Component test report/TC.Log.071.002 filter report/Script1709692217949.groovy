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

WebUI.delay(5)

WebUI.setText(findTestObject('1 Object0001_Email'), GlobalVariable.EMAIL)

WebUI.setText(findTestObject('1 Object0002_Password'), GlobalVariable.PASSWORD)

WebUI.click(findTestObject('1 Object0003_Button login'))

WebUI.click(findTestObject('1 Object0004_Module Fixed Asset'))

WebUI.delay(20)

WebUI.click(findTestObject('1 Object1400_menu atas report and log'))

WebUI.delay(5)

WebUI.click(findTestObject('1 Object1401_report'))

WebUI.delay(12)

WebUI.click(findTestObject('Menu report/Object1405_filter'))

WebUI.delay(5)

WebUI.click(findTestObject('Menu report/Object1406_dropdown active'))

WebUI.delay(2)

WebUI.click(findTestObject('Menu report/Object1407_cb 1 active'))

WebUI.click(findTestObject('Menu report/Object1408_report tipe'))

WebUI.delay(2)

WebUI.click(findTestObject('Menu report/Object1409_cb 1 custom'))

WebUI.click(findTestObject('Menu report/Object1410_dd frekuensi'))

WebUI.delay(2)

WebUI.click(findTestObject('Menu report/Object1411_cb 1 freq'))

WebUI.click(findTestObject('Menu report/Object1412_cb 2 freq'))

WebUI.click(findTestObject('Menu report/Object1413_cb 3 freq'))

WebUI.click(findTestObject('Menu report/Object1415_cb 4 freq'))

WebUI.click(findTestObject('Menu report/Object1416_cb 5 freq'))

WebUI.click(findTestObject('Menu report/Object1417_date'))

WebUI.delay(2)

WebUI.click(findTestObject('Menu report/Object1418_dd mod by'))

WebUI.delay(2)

WebUI.click(findTestObject('Menu report/Object1419_cb 1 lau'))

WebUI.click(findTestObject('Menu report/Object1414_apply filter'))

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.takeScreenshot('Screenshot/TC.Log.071.002 filter report.png', FailureHandling.STOP_ON_FAILURE)

