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

WebUI.click(findTestObject('Audit/Object385_Add Schedule'))

WebUI.click(findTestObject('Audit/Object386_Select Group'))

WebUI.click(findTestObject('Audit/Object387_Search Group'))

WebUI.delay(2)

WebUI.setText(findTestObject('Audit/Object388_Search Field Text'), 'Warehouse')

WebUI.delay(2)

WebUI.click(findTestObject('Audit/Object390_Select Option Warehouse'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Audit/Object391_Apply Select Group'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Audit/Object392_Select category'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Audit/Object393_Select Utilitas'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Audit/Object394_Select Laptop'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Audit/Object395_Apply Category'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Audit/Object396_Select Tag Type'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Audit/Object397_Choose RFID Tag'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Audit/Object398_Select Audit Type'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Audit/Object399_Choose Existence'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Audit/Object400_select date'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Audit/Object401_date picker'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Audit/Object402_select audit frequency'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Audit/Object403_choose audit frequency'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Audit/Object404_enter audit date'), '1')

WebUI.sendKeys(findTestObject('Audit/Object404_enter audit date'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Audit/Object405_submit form audit'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.takeScreenshot('audit/Create Schedule.png', FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Audit/Object406_select single action'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Audit/Object407_choose delete'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Audit/Object408_confirm delete'), FailureHandling.STOP_ON_FAILURE)

