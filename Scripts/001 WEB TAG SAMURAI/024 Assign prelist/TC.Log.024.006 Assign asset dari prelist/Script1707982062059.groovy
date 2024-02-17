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

WebUI.setText(findTestObject('Page Tag Samurai/1 Object0001_Email'), GlobalVariable.EMAIL)

WebUI.setText(findTestObject('Page Tag Samurai/1 Object0002_Password'), GlobalVariable.PASSWORD)

WebUI.click(findTestObject('Page Tag Samurai/1 Object0003_Button login'))

WebUI.click(findTestObject('Page Tag Samurai/1 Object0004_Module Fixed Asset'))

WebUI.delay(10)

WebUI.click(findTestObject('Page Tag Samurai/1 Object0005_Menu atas fixed asset'))

WebUI.click(findTestObject('Page Tag Samurai/1 Object0504_menu assign fixed asset'))

WebUI.delay(10)

WebUI.click(findTestObject('Page Tag Samurai/Menu titik 3 fixed asset assign prelist/Object0513_titik 3 assign prelist'))

WebUI.click(findTestObject('Page Tag Samurai/Menu titik 3 fixed asset assign prelist/Object0514_assign asset dari prelist'))

WebUI.click(findTestObject('Page Tag Samurai/Menu titik 3 fixed asset assign prelist/Object0515_dropdown select user assign prelist'))

WebUI.delay(5)

WebUI.click(findTestObject('Page Tag Samurai/Menu titik 3 fixed asset assign prelist/Object0516_pilihan user assign prelist'))

WebUI.click(findTestObject('Page Tag Samurai/Menu titik 3 fixed asset assign prelist/Object0517_apply select user assign prelist'))

WebUI.delay(5)

WebUI.click(findTestObject('Page Tag Samurai/Menu titik 3 fixed asset assign prelist/Object0518_submit assign asset'))

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.takeScreenshot('Screenshot/TC.Log.024.006 Assign asset dari prelist.png', FailureHandling.STOP_ON_FAILURE)

