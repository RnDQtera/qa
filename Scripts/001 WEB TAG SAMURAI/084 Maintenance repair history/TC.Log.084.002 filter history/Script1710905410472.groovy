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

WebUI.click(findTestObject('Menu maintenance repair damaged report/Object1815_repair'))

WebUI.delay(10)

WebUI.click(findTestObject('Menu maintenance repair history/Object1906_history'))

WebUI.delay(10)

WebUI.click(findTestObject('Menu maintenance repair history/Object1910_filter'))

WebUI.delay(3)

WebUI.click(findTestObject('Menu maintenance routine history/Object1796_dd nama'))

WebUI.delay(3)

WebUI.setText(findTestObject('Menu maintenance routine history/Object1797_ketik nama'), 'truk')

WebUI.delay(3)

WebUI.click(findTestObject('Menu maintenance routine history/Object1798_cb 1'))

WebUI.click(findTestObject('Menu maintenance routine history/Object1799_dd brand'))

WebUI.delay(3)

WebUI.click(findTestObject('Menu maintenance routine history/Object1800_cb 2 br'))

WebUI.click(findTestObject('Menu maintenance repair history/Object1911_cb 1status'))

WebUI.click(findTestObject('Menu maintenance routine history/Object1801_dd model'))

WebUI.delay(3)

WebUI.click(findTestObject('Menu maintenance repair history/Object1912_cb 1 hand'))

WebUI.click(findTestObject('Menu maintenance repair history/Object1913_dd result'))

WebUI.delay(3)

WebUI.click(findTestObject('Menu maintenance repair history/Object1914_cb result'))

WebUI.click(findTestObject('Menu maintenance routine history/Object1806_dd status'))

WebUI.delay(3)

WebUI.click(findTestObject('Menu maintenance routine history/Object1807_select al'))

WebUI.click(findTestObject('Menu maintenance routine history/Object1808_date'))

WebUI.delay(3)

WebUI.click(findTestObject('Menu maintenance routine history/Object1809_tgl 1'))

WebUI.click(findTestObject('Menu maintenance routine history/Object1810_tgl 31'))

WebUI.setText(findTestObject('Menu maintenance repair history/Object1915_input dt'), '1')

WebUI.setText(findTestObject('Menu maintenance repair history/Object1916_input dt2'), '360')

WebUI.click(findTestObject('Menu maintenance repair history/Object1917_apply filter'))

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.takeScreenshot('Screenshot/TC.Log.084.002 filter history.png', FailureHandling.STOP_ON_FAILURE)

