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

WebUI.setText(findTestObject('1 Object0001_Email'), GlobalVariable.EMAIL)

WebUI.setText(findTestObject('1 Object0002_Password'), GlobalVariable.PASSWORD)

WebUI.click(findTestObject('1 Object0003_Button login'))

WebUI.delay(5)

WebUI.click(findTestObject('1 Object0004_Module Fixed Asset'))

WebUI.delay(20)

WebUI.click(findTestObject('1 Object1400_menu atas report and log'))

WebUI.delay(5)

WebUI.click(findTestObject('1 Object1401_report'))

WebUI.delay(12)

WebUI.click(findTestObject('Menu report/Object1403_bt search'))

WebUI.delay(5)

WebUI.setText(findTestObject('Menu report/Object1404_ketik search'), 'pertama')

WebUI.sendKeys(findTestObject('Menu report/Object1404_ketik search'), Keys.chord(Keys.ENTER))

WebUI.delay(5)

WebUI.click(findTestObject('Menu report/Object1440_titik 3 report'))

WebUI.delay(5)

WebUI.click(findTestObject('Menu report/Object1441_edit report'))

WebUI.delay(5)

WebUI.setText(findTestObject('Menu report/Object1448_ketik nama laporan'), 'Laporan telah berhasil di edit')

WebUI.delay(2)

WebUI.click(findTestObject('Menu report/Object1466_cb table column uom'))

WebUI.delay(2)

WebUI.click(findTestObject('Menu report/Object1447_clear field edit'))

WebUI.delay(2)

WebUI.click(findTestObject('Menu report/Object1450_select group'))

WebUI.delay(2)

WebUI.click(findTestObject('Menu report/Object1451_lt 1 group'))

WebUI.delay(2)

WebUI.click(findTestObject('Menu report/Object1452_apply group'))

WebUI.delay(2)

WebUI.click(findTestObject('Menu report/Object1453_select cat'))

WebUI.delay(2)

WebUI.click(findTestObject('Menu report/Object1454_cat kendaraan'))

WebUI.delay(2)

WebUI.click(findTestObject('Menu report/Object1455_apply cat'))

WebUI.delay(2)

WebUI.click(findTestObject('Menu report/Object1456_dd asset name'))

WebUI.delay(2)

WebUI.click(findTestObject('Menu report/Object1457_cb truk tanah'))

WebUI.click(findTestObject('Menu report/Object1458_dd brand'))

WebUI.delay(2)

WebUI.click(findTestObject('Menu report/Object1459_cb hino'))

WebUI.click(findTestObject('Menu report/Object1460_dd model tipe'))

WebUI.delay(2)

WebUI.click(findTestObject('Menu report/Object1461_cb hyundai'))

WebUI.click(findTestObject('Menu report/Object1462_dd tag'))

WebUI.delay(2)

WebUI.click(findTestObject('Menu report/Object1463_cb non tag'))

WebUI.click(findTestObject('Menu report/Object1465_dd status'))

WebUI.delay(2)

WebUI.click(findTestObject('Menu report/Object1464_cb avail'))

WebUI.click(findTestObject('Menu report/Object1467_dd list by'))

WebUI.delay(2)

WebUI.click(findTestObject('Menu report/Object1468_cb cat'))

WebUI.delay(2)

WebUI.click(findTestObject('Menu report/Object1442_dd schedule edit'))

WebUI.delay(2)

WebUI.click(findTestObject('Menu report/Object1443_daily sch edit'))

WebUI.delay(2)

WebUI.click(findTestObject('Menu report/Object1449_submit edit report'))

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.takeScreenshot('Screenshot/TC.Log.071.009 edit report.png', FailureHandling.STOP_ON_FAILURE)

