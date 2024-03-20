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

WebUI.click(findTestObject('Menu maintenance service center list/Object1920_service center'))

WebUI.delay(10)

WebUI.click(findTestObject('Menu maintenance service center list/Object1921_create'))

WebUI.setText(findTestObject('Menu maintenance service center list/Object1922_ketik nama'), 'PT Piala Liga Champion')

WebUI.click(findTestObject('Menu maintenance service center list/Object1940_select group'))

WebUI.delay(3)

WebUI.click(findTestObject('Menu maintenance service center list/Object1923_cat furn'))

WebUI.delay(3)

WebUI.click(findTestObject('Menu maintenance service center list/Object1924_apply cat'))

WebUI.click(findTestObject('Menu maintenance service center list/Object1925_select brand'))

WebUI.delay(3)

WebUI.click(findTestObject('Menu maintenance service center list/Object1926_cb 1 br'))

WebUI.click(findTestObject('Menu maintenance service center list/Object1927_dd country'))

WebUI.delay(3)

WebUI.setText(findTestObject('Menu maintenance service center list/Object1928_ketik country'), 'spain')

WebUI.delay(3)

WebUI.click(findTestObject('Menu maintenance service center list/Object1929_cb 1 country'))

WebUI.click(findTestObject('Menu maintenance service center list/Object1930_dd state'))

WebUI.delay(3)

WebUI.click(findTestObject('Menu maintenance service center list/Object1931_cb 4 state'))

WebUI.click(findTestObject('Menu maintenance service center list/Object1932_dd city'))

WebUI.delay(3)

WebUI.click(findTestObject('Menu maintenance service center list/Object1933_cb city'))

WebUI.setText(findTestObject('Menu maintenance service center list/Object1934_ketik zip'), '28055')

WebUI.setText(findTestObject('Menu maintenance service center list/Object1935_ketik alamat'), 'Santiago Bernabeu')

WebUI.setText(findTestObject('Menu maintenance service center list/Object1936_ketik nomor'), '12345678910')

WebUI.setText(findTestObject('Menu maintenance service center list/Object1937_ketik pic'), 'foundation')

WebUI.setText(findTestObject('Menu maintenance service center list/Object1938_ketik no pic'), '12345678910')

WebUI.doubleClick(findTestObject('Menu maintenance service center list/Object1939_submit create'))

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.takeScreenshot('Screenshot/TC.Log.085.001 create service center.png', FailureHandling.STOP_ON_FAILURE)

