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

WebUI.navigateToUrl(GlobalVariable.URL)

WebUI.setText(findTestObject('1 Object001_email'), GlobalVariable.email)

WebUI.setText(findTestObject('1 Object002_pw'), GlobalVariable.pw)

WebUI.click(findTestObject('1 Object003_btn login'))

WebUI.delay(10)

WebUI.click(findTestObject('1 Object004_fixedasset module'))

WebUI.delay(20)

WebUI.click(findTestObject('1 Object016_Button Audit'))

WebUI.click(findTestObject('Audit/Object385_Add Schedule'))

WebUI.click(findTestObject('Audit/Object386_Select Group'))

WebUI.delay(2)

WebUI.click(findTestObject('Menu audit schedule/Object2033_sub lt 3'))

WebUI.delay(2)

WebUI.click(findTestObject('Menu audit schedule/Object2035_regal'))

WebUI.delay(2)

WebUI.click(findTestObject('Audit/Object391_Apply Select Group'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Audit/Object392_Select category'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Menu audit schedule/Object2036_cat furn'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Audit/Object395_Apply Category'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Menu audit schedule/Object2227_dd tag type'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Menu audit schedule/Object2037_qr tag'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Audit/Object398_Select Audit Type'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Audit/Object399_Choose Existence'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Audit/Object400_select date'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

'tanggal berubah sewaktu waktu/ harus update'
WebUI.click(findTestObject('Menu audit schedule/Object2038_tgl 21'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Audit/Object402_select audit frequency'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Menu audit schedule/Object2039_daily'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Audit/Object404_enter audit date'), '1')

WebUI.sendKeys(findTestObject('Audit/Object404_enter audit date'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Audit/Object405_submit form audit'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.takeScreenshot('Screenshot/TC.Log.087.002 create audit schedule existing.png', FailureHandling.STOP_ON_FAILURE)

