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

WebUI.click(findTestObject('Menu maintenance repair damaged report/Object1832_changelog'))

WebUI.delay(3)

WebUI.click(findTestObject('Menu maintenance repair damaged report/Object1835_filter cl'))

WebUI.delay(3)

WebUI.click(findTestObject('Menu maintenance repair damaged report/Object1836_date'))

WebUI.delay(3)

WebUI.click(findTestObject('Menu maintenance repair damaged report/Object1837_tgl 1'))

WebUI.click(findTestObject('Menu maintenance repair damaged report/Object1838_tgl 31'))

WebUI.click(findTestObject('Menu maintenance repair damaged report/Object1839_dd act'))

WebUI.delay(3)

WebUI.click(findTestObject('Menu maintenance repair damaged report/Object1840_cb 3 act'))

WebUI.click(findTestObject('Menu maintenance repair damaged report/Object1841_dd asset name'))

WebUI.delay(3)

WebUI.setText(findTestObject('Menu maintenance repair damaged report/Object1842_ketik name'), 'router')

WebUI.delay(3)

WebUI.click(findTestObject('Menu maintenance repair damaged report/Object1843_cb 1'))

WebUI.click(findTestObject('Menu maintenance repair damaged report/Object1844_select g'))

WebUI.delay(3)

WebUI.click(findTestObject('Menu maintenance repair damaged report/Object1845_lg'))

WebUI.delay(3)

WebUI.click(findTestObject('Menu maintenance repair damaged report/Object1846_apply group'))

WebUI.delay(3)

WebUI.click(findTestObject('Menu maintenance repair damaged report/Object1847_dd handled by'))

WebUI.delay(3)

WebUI.click(findTestObject('Menu maintenance repair damaged report/Object1848_cb 1'))

WebUI.click(findTestObject('Menu maintenance repair damaged report/Object1849_dd result'))

WebUI.delay(3)

WebUI.click(findTestObject('Menu maintenance repair damaged report/Object1850_cb 4'))

WebUI.click(findTestObject('Menu maintenance repair damaged report/Object1851_mod by'))

WebUI.delay(3)

WebUI.click(findTestObject('Menu maintenance repair damaged report/Object1852_cb 4'))

WebUI.click(findTestObject('Menu maintenance repair damaged report/Object1853_apply'))

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.takeScreenshot('Screenshot/TC.Log.082.006 filter changelog.png', FailureHandling.STOP_ON_FAILURE)

