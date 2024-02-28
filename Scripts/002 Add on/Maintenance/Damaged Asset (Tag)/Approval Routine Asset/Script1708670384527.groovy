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

WebUI.waitForPageLoad(10)

WebUI.click(findTestObject('1 Object004_fixedasset module'))

WebUI.click(findTestObject('1 Object012_Menu Approval from employee'))

WebUI.delay(10)

WebUI.click(findTestObject('Approval Maintenance Reapir/Object286_Sidebar approval maintenance'))

WebUI.click(findTestObject('Approval Maintenance Routine/Object336_Routine Approval'))

WebUI.delay(10)

WebUI.click(findTestObject('Approval Maintenance Reapir/Object288_Filter approval maintenance'))

WebUI.click(findTestObject('Approval Maintenance Routine/Object337_select status'))

WebUI.click(findTestObject('Approval Maintenance Routine/Object338_select need approval'))

WebUI.click(findTestObject('Approval Maintenance Routine/Object339_Submit Filter'))

WebUI.delay(3)

WebUI.click(findTestObject('Approval Maintenance Routine/Object340_Single action Routine maintenance'))

WebUI.click(findTestObject('Approval Maintenance Routine/Object341_Choose Approval'))

WebUI.click(findTestObject('Approval Maintenance Routine/Object342_Select Approval'))

WebUI.click(findTestObject('Approval Maintenance Routine/Object343_Choose Approve'))

WebUI.setText(findTestObject('Approval Maintenance Routine/Object344_Set note'), 'Set Notes')

WebUI.click(findTestObject('Approval Maintenance Routine/Object345_SubmitRoutine Maintenance'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Approval Maintenance Routine/Object346_Submit approval'), FailureHandling.STOP_ON_FAILURE)

