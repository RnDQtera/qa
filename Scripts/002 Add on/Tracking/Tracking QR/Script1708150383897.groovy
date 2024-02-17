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

WebUI.navigateToUrl(GlobalVariable.localhost)

WebUI.click(findTestObject('1 localhost - advance'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('1 localhost - process localhost'), FailureHandling.STOP_ON_FAILURE)

WebUI.navigateToUrl(GlobalVariable.URL)

WebUI.setText(findTestObject('1 Object001_email'), GlobalVariable.email)

WebUI.setText(findTestObject('1 Object002_pw'), GlobalVariable.pw)

WebUI.click(findTestObject('1 Object003_btn login'))

WebUI.click(findTestObject('1 Object004_fixedasset module'))

WebUI.delay(20)

WebUI.click(findTestObject('1 Object015_button Tracking'))

WebUI.click(findTestObject('Tracking/Object389_Tracked by QR'))

WebUI.click(findTestObject('Tracking/Object358_Select group by tracking'))

WebUI.click(findTestObject('Tracking/Object359_Choose Group'))

WebUI.click(findTestObject('Tracking/Object360_apply group'))

WebUI.click(findTestObject('Tracking/Object361_Start Tracking'))

WebUI.delay(2)

WebUI.click(findTestObject('Tracking/Object362_Sync Process'))

WebUI.delay(5)

WebUI.click(findTestObject('Tracking/Object363_Closed Sync'))

WebUI.delay(3)

WebUI.click(findTestObject('Tracking/Object389_Tracked by QR'))

WebUI.click(findTestObject('Tracking/Object358_Select group by tracking'))

WebUI.click(findTestObject('Tracking/Object359_Choose Group'))

WebUI.click(findTestObject('Tracking/Object360_apply group'))

WebUI.click(findTestObject('Tracking/Object361_Start Tracking'))

'Processing Scan\r\n'
WebUI.delay(15)

WebUI.click(findTestObject('Tracking/Object365_Tab Tracked'))

WebUI.delay(5)

WebUI.click(findTestObject('Tracking/Object366_button search on tab tracked'))

WebUI.setText(findTestObject('Tracking/Object367_Field Search asset on tab tracked'), 'Projector - 3\t')

WebUI.sendKeys(findTestObject('Tracking/Object367_Field Search asset on tab tracked'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Tracking/Object368_single action tab tracked'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Tracking/Object369_choose button update'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Tracking/Object370_Asset Verification'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(15, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Tracking/Object371_Select condition'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Tracking/Object372_choose asset found normal conition'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Tracking/Object373_set note'), 'found asset')

WebUI.click(findTestObject('Tracking/Object374_submit asset found'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(4, FailureHandling.STOP_ON_FAILURE)

WebUI.takeScreenshot('confirm asset found/asset found.png', FailureHandling.STOP_ON_FAILURE)

