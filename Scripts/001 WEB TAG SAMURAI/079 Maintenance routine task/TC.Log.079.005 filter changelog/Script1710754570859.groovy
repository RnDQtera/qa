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

WebUI.delay(10)

WebUI.setText(findTestObject('1 Object0001_Email'), GlobalVariable.EMAIL)

WebUI.setText(findTestObject('1 Object0002_Password'), GlobalVariable.PASSWORD)

WebUI.delay(3)

WebUI.click(findTestObject('1 Object0003_Button login'))

WebUI.click(findTestObject('1 Object0004_Module Fixed Asset'))

WebUI.delay(10)

WebUI.click(findTestObject('1 Object1592_maintenance'))

WebUI.delay(10)

WebUI.click(findTestObject('Menu maintenance task/Object1633_tab task'))

WebUI.delay(3)

WebUI.click(findTestObject('Menu maintenance task/Object1687_changelog'))

WebUI.delay(3)

WebUI.click(findTestObject('Menu maintenance task/Object1690_ilter log'))

WebUI.delay(3)

WebUI.click(findTestObject('Menu maintenance task/Object1691_dd task'))

WebUI.delay(3)

WebUI.click(findTestObject('Menu maintenance task/Object1692_cb 1 task'))

WebUI.click(findTestObject('Menu maintenance task/Object1693_dd mod by'))

WebUI.delay(3)

WebUI.click(findTestObject('Menu maintenance task/Object1694_cb 1 mod by'))

WebUI.click(findTestObject('Menu maintenance task/Object1695_dd action'))

WebUI.delay(3)

WebUI.click(findTestObject('Menu maintenance task/Object1696_cb 1 act'))

WebUI.click(findTestObject('Menu maintenance task/Object1697_dd field'))

WebUI.delay(3)

WebUI.click(findTestObject('Menu maintenance task/Object1698_cb all'))

WebUI.click(findTestObject('Menu maintenance task/Object1699_date'))

WebUI.delay(3)

WebUI.click(findTestObject('Menu maintenance task/Object1700_tgl 18'))

WebUI.click(findTestObject('Menu maintenance task/Object1701_apply filter'))

WebUI.delay(3)

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.takeScreenshot('Screenshot/TC.Log.079.005 filter change log task.png', FailureHandling.STOP_ON_FAILURE)

