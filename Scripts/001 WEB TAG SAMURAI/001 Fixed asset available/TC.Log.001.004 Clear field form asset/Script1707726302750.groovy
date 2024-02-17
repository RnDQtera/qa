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

WebUI.setText(findTestObject('1 Object0001_Email'), GlobalVariable.EMAIL)

WebUI.setText(findTestObject('1 Object0002_Password'), GlobalVariable.PASSWORD)

WebUI.click(findTestObject('1 Object0003_Button login'))

WebUI.click(findTestObject('1 Object0004_Module Fixed Asset'))

WebUI.delay(10)

WebUI.click(findTestObject('1 Object0005_Menu atas fixed asset'))

WebUI.delay(5)

WebUI.click(findTestObject('Fixed asset register asset/Object0008_Tambah asset button'))

WebUI.click(findTestObject('Fixed asset register asset/Object0010_Pilih kategori'))

WebUI.click(findTestObject('Fixed asset register asset/Object0026_dropdown kategori i4'))

WebUI.click(findTestObject('Fixed asset register asset/Object0025_apply kategori'))

WebUI.delay(2)

WebUI.click(findTestObject('Fixed asset register asset/Object0009_Pilih group'))

WebUI.click(findTestObject('Fixed asset register asset/Object0023_lantai index 5 group'))

WebUI.click(findTestObject('Fixed asset register asset/Object0024_apply group'))

WebUI.click(findTestObject('Fixed asset register asset/Object0030_pilih nama asset'))

WebUI.delay(3)

WebUI.doubleClick(findTestObject('Fixed asset register asset/Object0029_nama asset 1'))

WebUI.click(findTestObject('Fixed asset register asset/Object0019_dropdown brand asset'))

WebUI.delay(2)

WebUI.doubleClick(findTestObject('Fixed asset register asset/Object0018_brand asset 1'))

WebUI.click(findTestObject('Fixed asset register asset/Object0027_dropdown model type asset'))

WebUI.delay(2)

WebUI.doubleClick(findTestObject('Fixed asset register asset/Object0028_model type asset 1'))

WebUI.click(findTestObject('Fixed asset register asset/Object0189_dropdown ukuran asset'))

WebUI.delay(2)

WebUI.doubleClick(findTestObject('Fixed asset register asset/Object0190_ukuran asset 1'))

WebUI.click(findTestObject('Fixed asset register asset/Object0021_dropdown color asset'))

WebUI.delay(2)

WebUI.doubleClick(findTestObject('Fixed asset register asset/Object0020_color asset 1'))

WebUI.click(findTestObject('Fixed asset register asset/Object0015_Clear field tambah asset'))

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.takeScreenshot('Screenshot/TC.Log.001.004 Clear field form asset.png', FailureHandling.STOP_ON_FAILURE)

