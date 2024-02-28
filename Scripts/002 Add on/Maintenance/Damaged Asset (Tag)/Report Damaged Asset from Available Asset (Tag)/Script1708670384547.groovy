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

WebUI.navigateToUrl('https://localhost:9001')

WebUI.click(findTestObject('1 localhost - advance'))

WebUI.click(findTestObject('1 localhost - process localhost'))

WebUI.waitForPageLoad(10)

WebUI.navigateToUrl(GlobalVariable.URL)

WebUI.setText(findTestObject('1 Object001_email'), GlobalVariable.email)

WebUI.setText(findTestObject('1 Object002_pw'), GlobalVariable.pw)

WebUI.delay(4)

WebUI.click(findTestObject('1 Object003_btn login'))

WebUI.waitForPageLoad(10)

WebUI.click(findTestObject('1 Object004_fixedasset module'))

WebUI.delay(20)

WebUI.click(findTestObject('1 Object Navbar - Fixed Asset'))

WebUI.delay(2)

WebUI.click(findTestObject('1 Object0007_menu available fixed asset'))

WebUI.click(findTestObject('Damaged Asset (Non Tag)/Object166_Filter Available'))

WebUI.click(findTestObject('Damaged Asset (Non Tag)/Object167_select Section Tag'))

WebUI.click(findTestObject('Damaged Asset (Tag)/Object200_Select RFID Tag'))

WebUI.click(findTestObject('Damaged Asset (Non Tag)/Object167_select Section Tag'))

WebUI.click(findTestObject('Damaged Asset (Tag)/Object219_select section Asset policy'))

WebUI.click(findTestObject('Damaged Asset (Tag)/Object220_choose maintenance'))

WebUI.click(findTestObject('Damaged Asset (Tag)/Object219_select section Asset policy'))

WebUI.click(findTestObject('Damaged Asset (Non Tag)/Object169_submit filter'))

WebUI.delay(5)

WebUI.click(findTestObject('Damaged Asset (Tag)/Object203_button single action'))

WebUI.click(findTestObject('Damaged Asset (Tag)/Object204_report damaged tag'))

WebUI.click(findTestObject('Damaged Asset (Tag)/Object201_Scan by RFID report damaged asset'))

WebUI.click(findTestObject('Damaged Asset (Tag)/Object286_sync asset repair'))

WebUI.delay(3)

WebUI.click(findTestObject('Damaged Asset (Tag)/Object205_Closed Scan RFID'))

WebUI.click(findTestObject('Damaged Asset (Tag)/Object201_Scan by RFID report damaged asset'))

'Proses uploaf foto\r\n'
WebUI.uploadFile(findTestObject('Damaged Asset (Non Tag)/Object178a_Upload foto'), 'C:\\Users\\user\\Pictures\\1.png')

'Proses uploaf foto\r\n'
WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Damaged Asset (Tag)/Object207_Adjust Photo'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Damaged Asset (Tag)/Object206_Set Note'), 'Asset Damaged')

WebUI.click(findTestObject('Damaged Asset (Tag)/Object208_submit data'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Damaged Asset (Tag)/Object209_confirm report'), FailureHandling.STOP_ON_FAILURE)

