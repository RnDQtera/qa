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

WebUI.click(findTestObject('Menu report create/Object1469_bt create report'))

WebUI.delay(5)

WebUI.setText(findTestObject('Menu report/Object1448_ketik nama laporan'), 'Laporan basic group realtime')

WebUI.delay(5)

WebUI.click(findTestObject('Menu report create/Object1470_dd tipe laporan'))

WebUI.delay(2)

WebUI.click(findTestObject('Menu report create/Object1471_cb custom report'))

WebUI.delay(5)

WebUI.click(findTestObject('Menu report create/Object1472_dd asset info'))

WebUI.delay(5)

WebUI.click(findTestObject('Menu report create/Object1473_basic info'))

WebUI.click(findTestObject('Menu report create/Object1474_dd list by'))

WebUI.delay(5)

WebUI.click(findTestObject('Menu report create/Object1475_cb group list'))

WebUI.click(findTestObject('Menu report create/Object1476_dd data type'))

WebUI.delay(2)

WebUI.click(findTestObject('Menu report create/Object1477_cb realtime data'))

WebUI.click(findTestObject('Menu report create/Object1478_select group create'))

WebUI.delay(2)

WebUI.click(findTestObject('Menu report create/Object1479_lantai 1 create'))

WebUI.click(findTestObject('Menu report create/Object1480_lantai 2 create'))

WebUI.click(findTestObject('Menu report create/Object1481_apply group'))

WebUI.delay(2)

WebUI.click(findTestObject('Menu report create/Object1482_select cat create'))

WebUI.click(findTestObject('Menu report create/Object1483_all cat create'))

WebUI.click(findTestObject('Menu report create/Object1484_apply cat'))

WebUI.delay(2)

WebUI.click(findTestObject('Menu report create/Object1485_dd asset name'))

WebUI.delay(2)

WebUI.click(findTestObject('Menu report create/Object1486_asset kursi'))

WebUI.click(findTestObject('Menu report create/Object1487_dd brand'))

WebUI.delay(2)

WebUI.click(findTestObject('Menu report create/Object1488_cb olympic'))

WebUI.click(findTestObject('Menu report create/Object1489_dd model'))

WebUI.delay(2)

WebUI.click(findTestObject('Menu report create/Object1490_cb chair'))

WebUI.click(findTestObject('Menu report create/Object1491_cb desk'))

WebUI.click(findTestObject('Menu report create/Object1492_dd tag'))

WebUI.delay(2)

WebUI.click(findTestObject('Menu report create/Object1493_cb qr tag'))

WebUI.click(findTestObject('Menu report create/Object1494_cb non tag'))

WebUI.click(findTestObject('Menu report create/Object1495_dd status'))

WebUI.delay(2)

WebUI.click(findTestObject('Menu report create/Object1496_cb avail'))

WebUI.click(findTestObject('Menu report create/Object1497_date'))

WebUI.delay(2)

WebUI.click(findTestObject('Menu report create/Object1498_mundur date'))

WebUI.delay(2)

WebUI.click(findTestObject('Menu report create/Object1499_tgl 1'))

WebUI.click(findTestObject('Menu report create/Object1500_tgl 29'))

WebUI.click(findTestObject('Menu report create/Object1501_cb aset id'))

WebUI.delay(2)

WebUI.delay(2)

WebUI.delay(2)

WebUI.delay(2)

WebUI.delay(2)

WebUI.delay(2)

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.takeScreenshot('Screenshot/TC.Log.072.001 create basic info report group realtime.png', FailureHandling.STOP_ON_FAILURE)

