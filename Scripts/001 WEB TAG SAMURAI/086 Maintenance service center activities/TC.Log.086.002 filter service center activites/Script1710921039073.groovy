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

WebUI.click(findTestObject('Menu maintenance service center list/Object1920_service center'))

WebUI.delay(10)

WebUI.click(findTestObject('Menu maintenance service center activities/Object2006_activities'))

WebUI.delay(10)

WebUI.click(findTestObject('Menu maintenance service center activities/Object2009_bt filter'))

WebUI.delay(3)

WebUI.click(findTestObject('Menu maintenance service center activities/Object2010_dd name'))

WebUI.delay(3)

WebUI.click(findTestObject('Menu maintenance service center activities/Object2011_cb truk'))

WebUI.click(findTestObject('Menu maintenance service center activities/Object2012_dd brand'))

WebUI.delay(3)

WebUI.click(findTestObject('Menu maintenance service center activities/Object2013_cb 1'))

WebUI.click(findTestObject('Menu maintenance service center activities/Object2014_dd model'))

WebUI.delay(3)

WebUI.click(findTestObject('Menu maintenance service center activities/Object2015_cb 3'))

WebUI.click(findTestObject('Menu maintenance service center activities/Object2016_select g'))

WebUI.delay(3)

WebUI.click(findTestObject('Menu maintenance service center activities/Object2017_lt 1'))

WebUI.delay(3)

WebUI.click(findTestObject('Menu maintenance service center activities/Object2018_apply g'))

WebUI.delay(3)

WebUI.click(findTestObject('Menu maintenance service center activities/Object2019_dd mtype'))

WebUI.delay(3)

WebUI.click(findTestObject('Menu maintenance service center activities/Object2020_cb 2'))

WebUI.click(findTestObject('Menu maintenance service center activities/Object2021_dd status'))

WebUI.delay(3)

WebUI.click(findTestObject('Menu maintenance service center activities/Object2022_cb repaired'))

WebUI.click(findTestObject('Menu maintenance service center activities/Object2023_date'))

WebUI.delay(3)

WebUI.click(findTestObject('Menu maintenance service center activities/Object2024_tgl 1'))

WebUI.click(findTestObject('Menu maintenance service center activities/Object2025_tgl 31'))

WebUI.setText(findTestObject('Menu maintenance service center activities/Object2026_input dt'), '0')

WebUI.setText(findTestObject('Menu maintenance service center activities/Object2027_input dt2'), '240')

WebUI.click(findTestObject('Menu maintenance service center activities/Object2028_apply filter'))

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.takeScreenshot('Screenshot/TC.Log.086.002 filter service center activites.png', FailureHandling.STOP_ON_FAILURE)

