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

WebUI.delay(4)

WebUI.click(findTestObject('1 Object003_btn login'))

WebUI.delay(10)

WebUI.click(findTestObject('1 Object004_fixedasset module'))

WebUI.delay(20)

WebUI.click(findTestObject('1 Object Navbar - Fixed Asset'))

WebUI.click(findTestObject('Menu available asset/Object0060_button menu available asset'))

WebUI.click(findTestObject('Damaged Asset (Non Tag)/Object166_Filter Available'))

WebUI.click(findTestObject('Damaged Asset (Non Tag)/Object167_select Section Tag'))

WebUI.click(findTestObject('Damaged Asset (Non Tag)/Object168_select non tag'))

WebUI.click(findTestObject('Damaged Asset (Non Tag)/Object167_select Section Tag'))

WebUI.click(findTestObject('Damaged Asset (Non Tag)/Object169_submit filter'))

WebUI.delay(2)

WebUI.click(findTestObject('Damaged Asset (Non Tag)/Object170_single action available asset'))

WebUI.click(findTestObject('Damaged Asset (Non Tag)/Object171_Choose Report damaged'))

WebUI.uploadFile(findTestObject('Damaged Asset (Non Tag)/Object178a_Upload foto'), 'C:\\Users\\user\\Pictures\\1.png')

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Damaged Asset (Non Tag)/Object172_Adjust image'))

WebUI.setText(findTestObject('Damaged Asset (Non Tag)/Object173_Set Text Note'), 'Damaged Asset')

WebUI.click(findTestObject('Damaged Asset (Non Tag)/Object174_Submit Report Damaged'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Damaged Asset (Non Tag)/Object175_Confirm Report Damaged Asset'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1, FailureHandling.STOP_ON_FAILURE)

WebUI.takeScreenshot('Damaged and maintenance/Report Damaged form available.png', FailureHandling.STOP_ON_FAILURE)

