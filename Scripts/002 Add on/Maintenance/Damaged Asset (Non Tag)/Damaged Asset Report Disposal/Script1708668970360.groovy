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

WebUI.navigateToUrl(GlobalVariable.URL)

WebUI.setText(findTestObject('1 Object001_email'), GlobalVariable.email)

WebUI.setText(findTestObject('1 Object002_pw'), GlobalVariable.pw)

WebUI.delay(4)

WebUI.click(findTestObject('1 Object003_btn login'))

WebUI.click(findTestObject('1 Object004_fixedasset module'))

WebUI.click(findTestObject('1 Object Navbar - Fixed Asset'))

WebUI.click(findTestObject('Damaged Asset (Non Tag)/Object161_Menu Damaged'))

WebUI.click(findTestObject('Damaged Asset (Non Tag)/Object162_Single Action menu damaged'))

WebUI.click(findTestObject('Damaged Asset (Non Tag)/Object176_report disposal'))

WebUI.setText(findTestObject('Damaged Asset (Non Tag)/Object177_Set Notes Report disposal'), 'Disposed Asset')

WebUI.click(findTestObject('Damaged Asset (Non Tag)/Object178_Submit Report Disposal'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1, FailureHandling.STOP_ON_FAILURE)

WebUI.takeScreenshot('Damaged and maintenance/Reportdisposal.png', FailureHandling.STOP_ON_FAILURE)


