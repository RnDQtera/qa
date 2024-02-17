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

WebUI.delay(5)

WebUI.setText(findTestObject('Page Tag Samurai/1 Object0001_Email'), GlobalVariable.EMAIL)

WebUI.setText(findTestObject('Page Tag Samurai/1 Object0002_Password'), GlobalVariable.PASSWORD)

WebUI.click(findTestObject('Page Tag Samurai/1 Object0003_Button login'))

WebUI.click(findTestObject('Page Tag Samurai/1 Object0004_Module Fixed Asset'))

WebUI.delay(20)

WebUI.click(findTestObject('Page Tag Samurai/1 Object0159_menu atas setting'))

WebUI.delay(15)

WebUI.click(findTestObject('Page Tag Samurai/Setting user/Object0228_Menu user'))

WebUI.delay(12)

WebUI.click(findTestObject('Page Tag Samurai/Setting user/Object0212_Tambah user'))

WebUI.delay(10)

WebUI.setText(findTestObject('Page Tag Samurai/Setting user/Object0200_First name user'), 'gal')

WebUI.setText(findTestObject('Page Tag Samurai/Setting user/Object0203_Last name user'), 'gadot')

WebUI.setText(findTestObject('Page Tag Samurai/Setting user/Object0196_Divisi'), 'artist')

WebUI.setText(findTestObject('Page Tag Samurai/Setting user/Object0198_Email user'), 'galgadot@gmail.com')

WebUI.setText(findTestObject('Page Tag Samurai/Setting user/Object0210_tambah nomor telefon user'), '62821124')

WebUI.setText(findTestObject('Page Tag Samurai/Setting user/Object0211_tambah posisi user'), 'celebrity')

WebUI.setText(findTestObject('Page Tag Samurai/Setting user/Object0209_tambah id user'), 'ididi03')

WebUI.click(findTestObject('Page Tag Samurai/Setting user/Object0205_pilih group user'))

WebUI.delay(5)

WebUI.doubleClick(findTestObject('Page Tag Samurai/Setting user/Object0201_group 301 user'))

WebUI.click(findTestObject('Page Tag Samurai/Setting user/Object0192_apply group user'))

WebUI.click(findTestObject('Page Tag Samurai/Setting user/Object0194_Button tambah user'))

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.takeScreenshot('Screenshot/TC.Log.006.001 Menambah user.png', FailureHandling.STOP_ON_FAILURE)

