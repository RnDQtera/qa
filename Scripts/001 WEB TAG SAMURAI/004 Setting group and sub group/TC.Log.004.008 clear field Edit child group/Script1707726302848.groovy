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

WebUI.delay(2)

WebUI.setText(findTestObject('Page Tag Samurai/1 Object0001_Email'), GlobalVariable.EMAIL)

WebUI.setText(findTestObject('Page Tag Samurai/1 Object0002_Password'), GlobalVariable.PASSWORD)

WebUI.click(findTestObject('Page Tag Samurai/1 Object0003_Button login'))

WebUI.click(findTestObject('Page Tag Samurai/1 Object0004_Module Fixed Asset'))

WebUI.delay(10)

WebUI.click(findTestObject('Page Tag Samurai/1 Object0159_menu atas setting'))

WebUI.delay(5)

WebUI.click(findTestObject('Page Tag Samurai/Setting group parent/Object0170_parent index 7'))

WebUI.click(findTestObject('Page Tag Samurai/Setting group parent/Object0162_buka parent index 7'))

WebUI.delay(3)

WebUI.click(findTestObject('Page Tag Samurai/Setting group child/Object0181_child 1 parent 7'))

WebUI.click(findTestObject('Page Tag Samurai/Setting group child/Object0187_titik 3 child 1 parent 7'))

WebUI.click(findTestObject('Page Tag Samurai/Setting group child/Object0183_edit child 1 parent index 7'))

WebUI.delay(3)

WebUI.setText(findTestObject('Page Tag Samurai/Setting group child/Object0185_ketik edit child 1 parent 7'), 
    'tulisan ini akan hilang')

WebUI.delay(3)

WebUI.click(findTestObject('Page Tag Samurai/Setting group child/Object0182_clear field edit child 1 parent 7'))

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.takeScreenshot('Screenshot/TC.Log.004.008 clear field Edit child.png', FailureHandling.STOP_ON_FAILURE)

