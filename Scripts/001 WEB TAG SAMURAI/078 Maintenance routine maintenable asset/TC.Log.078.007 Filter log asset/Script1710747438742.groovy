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

WebUI.delay(3)

WebUI.click(findTestObject('1 Object0003_Button login'))

WebUI.click(findTestObject('1 Object0004_Module Fixed Asset'))

WebUI.delay(10)

WebUI.click(findTestObject('1 Object1592_maintenance'))

WebUI.delay(10)

WebUI.click(findTestObject('Menu maintenance maintenable asset/Object1612_change log'))

WebUI.delay(3)

WebUI.click(findTestObject('Menu maintenance maintenable asset/Object1615_filter log'))

WebUI.delay(3)

'masi bug'
WebUI.click(findTestObject('Menu maintenance maintenable asset/Object1616_sate'))

WebUI.delay(3)

WebUI.click(findTestObject('Menu maintenance maintenable asset/Object1617_action'))

WebUI.delay(3)

WebUI.click(findTestObject('Menu maintenance maintenable asset/Object1618_active'))

WebUI.click(findTestObject('Menu maintenance maintenable asset/Object1619_nama'))

WebUI.delay(3)

WebUI.setText(findTestObject('Menu maintenance maintenable asset/Object1620_ketik nama'), 'truk')

WebUI.click(findTestObject('Menu maintenance maintenable asset/Object1621_cb 1'))

WebUI.delay(3)

WebUI.click(findTestObject('Menu maintenance maintenable asset/Object1622_dd mod by'))

WebUI.delay(3)

WebUI.click(findTestObject('Menu maintenance maintenable asset/Object1623_cb 1'))

WebUI.click(findTestObject('Menu maintenance maintenable asset/Object1624_apply filter log'))

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.takeScreenshot('Screenshot/TC.Log.078.007 filter log.png', FailureHandling.STOP_ON_FAILURE)

