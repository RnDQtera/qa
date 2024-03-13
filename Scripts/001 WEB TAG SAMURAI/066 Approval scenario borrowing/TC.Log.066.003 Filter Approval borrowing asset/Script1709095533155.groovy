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

WebUI.click(findTestObject('1 Object0960_menu atas approval'))

WebUI.delay(12)

WebUI.click(findTestObject('Menu Appoval borrowing/Object0972_bt filter'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(8)

WebUI.click(findTestObject('Menu Appoval borrowing/Object0973_dropdown filter'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.click(findTestObject('Menu Appoval borrowing/Object0974_checkbox finish'))

WebUI.click(findTestObject('Menu Appoval borrowing/Object1123_dd manager'))

WebUI.delay(3)

WebUI.click(findTestObject('Menu Appoval borrowing/Object1124_cb lau'))

WebUI.click(findTestObject('Menu Appoval borrowing/Object1121_dd borrower'))

WebUI.delay(3)

WebUI.click(findTestObject('Menu Appoval borrowing/Object1122_cb laur'))

WebUI.click(findTestObject('Menu Appoval borrowing/Object1131_date'))

WebUI.delay(3)

WebUI.click(findTestObject('Menu Appoval borrowing/Object1132_mundur date'))

WebUI.delay(3)

WebUI.click(findTestObject('Menu Appoval borrowing/Object1133_tgl 1'))

WebUI.click(findTestObject('Menu Appoval borrowing/Object1134_tgl 29'))

WebUI.click(findTestObject('Menu Appoval borrowing/Object1360_select group b'))

WebUI.delay(3)

WebUI.click(findTestObject('Menu Appoval borrowing/Object1359_lt 4 g'))

WebUI.delay(3)

WebUI.click(findTestObject('Menu Appoval borrowing/Object1361_apply g'))

WebUI.delay(3)

WebUI.click(findTestObject('Menu Appoval borrowing/Object0975_apply filter'))

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.takeScreenshot('Screenshot/TC.Log.066.003 Filter approval borrowing asset.png', FailureHandling.STOP_ON_FAILURE)

