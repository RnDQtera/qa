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

WebUI.click(findTestObject('Menu audit task dan history/Object2111_tab history'))

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Menu audit task dan history/Object2080_bt filter'))

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Menu audit task dan history/Object2081_dd audit'))

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Menu audit task dan history/Object2082_cb 1 tipe'))

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Menu audit task dan history/Object2083_date'))

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Menu audit task dan history/Object2084_tgl 1'))

WebUI.click(findTestObject('Menu audit task dan history/Object2085_tgl 21'))

WebUI.click(findTestObject('Menu audit task dan history/Object2086_select cat'))

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Menu audit task dan history/Object2087_furn'))

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Menu audit task dan history/Object2088_apply cat'))

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Menu audit task dan history/Object2089_dd status'))

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Menu audit task dan history/Object2121_cb status'))

WebUI.click(findTestObject('Menu audit task dan history/Object2114_date'))

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Menu audit task dan history/Object2115_tgl 1'))

WebUI.click(findTestObject('Menu audit task dan history/Object2116_tgl 21'))

WebUI.setText(findTestObject('Menu audit task dan history/Object2117_ketik dt 1'), '1')

WebUI.setText(findTestObject('Menu audit task dan history/Object2118_ketik dt 2'), '1')

WebUI.click(findTestObject('Menu audit task dan history/Object2119_apply filter'))

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.takeScreenshot('Screenshot/TC.Log.088.006 filter audit history.png', FailureHandling.STOP_ON_FAILURE)

