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

WebUI.setText(findTestObject('1 Object0001_Email'), GlobalVariable.EMAIL)

WebUI.setText(findTestObject('1 Object0002_Password'), GlobalVariable.PASSWORD)

WebUI.click(findTestObject('1 Object0003_Button login'))

WebUI.click(findTestObject('1 Object0004_Module Fixed Asset'))

WebUI.delay(20)

WebUI.click(findTestObject('1 Object0159_menu atas setting'))

WebUI.delay(15)

WebUI.click(findTestObject('Setting asset-categories asset name/Object0401_menu kategori asset'))

WebUI.delay(12)

WebUI.click(findTestObject('Setting asset-categories asset name/Object0407_tambah kategori asset'))

WebUI.delay(8)

WebUI.setText(findTestObject('Setting asset-categories asset name/Object0400_ketik nama tambah kategori asset'), '1 alat dapur')

WebUI.click(findTestObject('Setting asset-categories asset name/Object0399_dropdown unit measurement'))

WebUI.delay(5)

WebUI.click(findTestObject('Setting asset-categories asset name/Object0404_pilihan 1 unit measurement'))

WebUI.click(findTestObject('Setting asset-categories asset name/Object0402_pilih kategori'))

WebUI.delay(3)

WebUI.click(findTestObject('Setting asset-categories asset name/Object0403_pilih kategori alat kantor'))

WebUI.click(findTestObject('Setting asset-categories asset name/Object0396_apply kategori asset baru'))

WebUI.delay(3)

WebUI.click(findTestObject('Setting asset-categories asset name/Object0406_submit tambah kategori asset'))

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.takeScreenshot('Screenshot/TC.Log.009.001 menambah kategori asset.png', FailureHandling.STOP_ON_FAILURE)

