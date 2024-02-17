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

WebUI.delay(15)

WebUI.click(findTestObject('1 Object0005_Menu atas fixed asset'))

WebUI.click(findTestObject('1 Object0007_menu available fixed asset'))

WebUI.delay(12)

WebUI.click(findTestObject('Fixed asset transfer asset/Object0041_filter menu available'))

WebUI.click(findTestObject('Fixed asset transfer asset/Object0040_dropdown menu available filter'))

WebUI.delay(10)

WebUI.setText(findTestObject('Fixed asset transfer asset/Object0042_ketik menu filter nama available'), 
    'kursi')

WebUI.click(findTestObject('Fixed asset transfer asset/Object0044_pilih menu filter nama available'))

WebUI.delay(8)

WebUI.click(findTestObject('Fixed asset transfer asset/Object0037_apply filter available'))

WebUI.delay(5)

WebUI.click(findTestObject('Fixed asset transfer asset/Object0048_titik 3 available'))

WebUI.click(findTestObject('Menu fixed asset damage reported/Object0631_bt damage reported'))

WebUI.delay(3)

WebUI.uploadFile(findTestObject('Menu fixed asset damage reported/Object0632_upload foto damage reported'), 
    'C:\\Users\\aplikasi internal\\Downloads\\objek repo.jpg')

WebUI.delay(3)

WebUI.click(findTestObject('Menu fixed asset damage reported/Object0634_apply upload foto damage reported'))

WebUI.delay(3)

WebUI.setText(findTestObject('Menu fixed asset damage reported/Object0633_isi text damage reported'), 'test report')

WebUI.click(findTestObject('Menu fixed asset damage reported/Object0635_submit damage reported'))

WebUI.delay(3)

WebUI.click(findTestObject('Menu fixed asset damage reported/Object0636_ya laporkan kerusakan'))

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.takeScreenshot('Screenshot/TC.Log.033.001 Tambah damage reported.png', FailureHandling.STOP_ON_FAILURE)

