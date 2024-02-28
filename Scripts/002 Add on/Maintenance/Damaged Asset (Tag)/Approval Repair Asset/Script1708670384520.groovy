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

WebUI.waitForPageLoad(10)

WebUI.click(findTestObject('1 Object004_fixedasset module'))

WebUI.click(findTestObject('1 Object012_Menu Approval from employee'))

WebUI.delay(10)

WebUI.click(findTestObject('Approval Maintenance Reapir/Object286_Sidebar approval maintenance'))

WebUI.click(findTestObject('Approval Maintenance Reapir/Object287_Repair approval'))

WebUI.delay(10)

WebUI.click(findTestObject('Approval Maintenance Reapir/Object288_Filter approval maintenance'))

WebUI.click(findTestObject('Approval Maintenance Reapir/Object289_select status'))

WebUI.delay(3)

WebUI.setText(findTestObject('Approval Maintenance Reapir/Object290_input need approval'), 'Need Approval')

WebUI.click(findTestObject('Approval Maintenance Reapir/Object291_check choose need approval'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Approval Maintenance Reapir/Object292_submit filter'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.click(findTestObject('Approval Maintenance Reapir/Object293_single action'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Approval Maintenance Reapir/Object294_choose approval'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Approval Maintenance Reapir/Object295_select approval'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Approval Maintenance Reapir/Object296_select for approve'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Approval Maintenance Reapir/Object297_set note approval'), 'this approve')

WebUI.click(findTestObject('Approval Maintenance Reapir/Object298_submit approval'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Approval Maintenance Reapir/Object299_finish submit approval'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.takeScreenshot('Damaged and maintenance/Approval maintenance.png', FailureHandling.STOP_ON_FAILURE)

