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

WebUI.delay(3)

WebUI.setText(findTestObject('1 Object0001_Email'), GlobalVariable.EMAIL)

WebUI.setText(findTestObject('1 Object0002_Password'), GlobalVariable.PASSWORD)

WebUI.click(findTestObject('1 Object0003_Button login'))

WebUI.click(findTestObject('1 Object0004_Module Fixed Asset'))

WebUI.delay(15)

WebUI.click(findTestObject('1 Object0770_menu atas devices'))

WebUI.delay(3)

WebUI.click(findTestObject('1 Object0771_devices rfid qr tag'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(8)

WebUI.click(findTestObject('Menu devices unpair tag prelist/Object0908_menu unpair tag'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(12)

WebUI.click(findTestObject('Menu devices unpair tag prelist/Object1011_menu history'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(12)

WebUI.click(findTestObject('Menu devices unpair tag prelist/Object1016_bt filter'))

WebUI.delay(3)

WebUI.click(findTestObject('Menu devices history change tag/Object0859_dropdown filter'))

WebUI.delay(2)

WebUI.click(findTestObject('Menu devices history change tag/Object0860_checkbox filter'))

WebUI.click(findTestObject('Menu devices history change tag/Object1046_checkbox asset i2'))

WebUI.delay(2)

WebUI.click(findTestObject('Menu devices history change tag/Object1041_dropdown changed to'))

WebUI.delay(2)

WebUI.click(findTestObject('Menu devices history change tag/Object1042_checkbox i3'))

WebUI.click(findTestObject('Menu devices history change tag/Object1039_dropdown'))

WebUI.delay(2)

WebUI.click(findTestObject('Menu devices history change tag/Object1040_checkbox2'))

WebUI.click(findTestObject('Menu devices history change tag/Object1047_checkbox tag'))

WebUI.click(findTestObject('Menu devices unpair tag prelist/Object1018_checkbox 3'))

WebUI.delay(2)

WebUI.click(findTestObject('Menu devices pair tag type history/Object1169_date'))

WebUI.delay(2)

WebUI.click(findTestObject('Menu devices unpair tag prelist/Object1177_mundur date'))

WebUI.delay(2)

WebUI.click(findTestObject('Menu devices pair tag type history/Object1171_tgl 1'))

WebUI.click(findTestObject('Menu devices pair tag type history/Object1172_tgl 29'))

WebUI.delay(2)

WebUI.click(findTestObject('Menu devices pair tag type history/Object1173_select group'))

WebUI.delay(2)

WebUI.click(findTestObject('Menu devices unpair tag prelist/Object1176_lt 2'))

WebUI.delay(2)

WebUI.click(findTestObject('Menu devices pair tag type history/Object1175_apply group'))

WebUI.delay(2)

WebUI.click(findTestObject('Menu devices unpair tag prelist/Object1019_apply filter'))

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.takeScreenshot('Screenshot/TC.Log.070.002 filter devices tag unpair history.png', FailureHandling.STOP_ON_FAILURE)

