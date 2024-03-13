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

WebUI.delay(10)

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

WebUI.click(findTestObject('Menu report create basic info group realtime/Object1469_bt create report'))

WebUI.delay(5)

WebUI.setText(findTestObject('Menu report/Object1448_ketik nama laporan'), 'Laporan basic category historical')

WebUI.delay(5)

WebUI.click(findTestObject('Menu report create basic info group realtime/Object1470_dd tipe laporan'))

WebUI.delay(2)

WebUI.click(findTestObject('Menu report create basic info group realtime/Object1471_cb custom report'))

WebUI.delay(2)

WebUI.click(findTestObject('Menu report create basic info group realtime/Object1472_dd asset info'))

WebUI.delay(2)

WebUI.click(findTestObject('Menu report create basic info group realtime/Object1473_basic info'))

WebUI.click(findTestObject('Menu report create basic info group realtime/Object1474_dd list by'))

WebUI.delay(2)

WebUI.click(findTestObject('Menu report create basic info group realtime/Object1367_cb cat'))

WebUI.click(findTestObject('Menu report create basic info group realtime/Object1476_dd data type'))

WebUI.delay(2)

WebUI.click(findTestObject('Menu report custom group historical/Object1376_Menu report group historical'))

WebUI.delay(2)

WebUI.click(findTestObject('Menu report create basic info group realtime/Object1501_cb aset id'))

WebUI.click(findTestObject('Menu report create basic info group realtime/Object1502_cb status'))

WebUI.click(findTestObject('Menu report create basic info group realtime/Object1503_cb group'))

WebUI.delay(2)

WebUI.click(findTestObject('Menu report create basic info group realtime/Object1504_cb tag'))

WebUI.click(findTestObject('Menu report create basic info group realtime/Object1505_cb cat'))

WebUI.click(findTestObject('Menu report create basic info group realtime/Object1506_cb brand'))

WebUI.click(findTestObject('Menu report create basic info group realtime/Object1507_cb model'))

WebUI.delay(2)

WebUI.click(findTestObject('Menu report create basic info group realtime/Object1508_regist date'))

WebUI.click(findTestObject('Menu report create basic info group realtime/Object1509_unit'))

WebUI.click(findTestObject('Menu report create basic info group realtime/Object1510_end garansi'))

WebUI.click(findTestObject('Menu report create basic info group realtime/Object1501_cb aset id'))

WebUI.delay(2)

WebUI.click(findTestObject('Menu report create basic info group realtime/Object1501_cb aset id'))

WebUI.click(findTestObject('Menu report create basic info group realtime/Object1511_tgl beli'))

WebUI.click(findTestObject('Menu report create basic info group realtime/Object1512_cb harga bayar'))

WebUI.delay(2)

WebUI.click(findTestObject('Menu report create basic info group realtime/Object1515_clear field filter'))

WebUI.delay(2)

WebUI.click(findTestObject('Menu report create basic info group realtime/Object1478_select group create'))

WebUI.delay(2)

WebUI.click(findTestObject('Menu report create basic info group realtime/Object1479_lantai 1 create'))

WebUI.click(findTestObject('Menu report create basic info group realtime/Object1480_lantai 2 create'))

WebUI.delay(2)

WebUI.click(findTestObject('Menu report create basic info group realtime/Object1481_apply group'))

WebUI.delay(2)

WebUI.click(findTestObject('Menu report create basic info group realtime/Object1482_select cat create'))

WebUI.click(findTestObject('Menu report create basic info group realtime/Object1483_all cat create'))

WebUI.delay(2)

WebUI.click(findTestObject('Menu report create basic info group realtime/Object1484_apply cat'))

WebUI.delay(2)

WebUI.click(findTestObject('Menu report create basic info group realtime/Object1485_dd asset name'))

WebUI.delay(2)

WebUI.click(findTestObject('Menu report create basic info group realtime/Object1486_asset kursi'))

WebUI.click(findTestObject('Menu report create basic info group realtime/Object1487_dd brand'))

WebUI.delay(2)

WebUI.click(findTestObject('Menu report create basic info group realtime/Object1488_cb olympic'))

WebUI.click(findTestObject('Menu report create basic info group realtime/Object1489_dd model'))

WebUI.delay(2)

WebUI.click(findTestObject('Menu report create basic info group realtime/Object1490_cb chair'))

WebUI.click(findTestObject('Menu report create basic info group realtime/Object1491_cb desk'))

WebUI.click(findTestObject('Menu report create basic info group realtime/Object1492_dd tag'))

WebUI.delay(2)

WebUI.click(findTestObject('Menu report create basic info group realtime/Object1493_cb qr tag'))

WebUI.click(findTestObject('Menu report create basic info group realtime/Object1494_cb non tag'))

WebUI.click(findTestObject('Menu report create basic info group realtime/Object1495_dd status'))

WebUI.delay(2)

WebUI.click(findTestObject('Menu report create basic info group realtime/Object1496_cb avail'))

WebUI.delay(2)

WebUI.click(findTestObject('Menu report create basic info group realtime/Object1497_date'))

WebUI.delay(2)

WebUI.click(findTestObject('Menu report create basic info group realtime/Object1498_mundur date'))

WebUI.delay(2)

WebUI.click(findTestObject('Menu report create basic info group realtime/Object1499_tgl 1'))

WebUI.click(findTestObject('Menu report create basic info group realtime/Object1500_tgl 29'))

WebUI.delay(2)

WebUI.click(findTestObject('Menu report create basic info group realtime/Object1513_download report'))

WebUI.delay(2)

WebUI.setText(findTestObject('Menu report create basic info group realtime/Object1514_ketik penerima'), 'employee4@mailnesia.com')

WebUI.delay(3)

WebUI.click(findTestObject('Menu report/Object1442_dd schedule edit'))

WebUI.delay(3)

WebUI.click(findTestObject('Menu report create basic info group realtime/Object1516_daly sch create'))

WebUI.delay(2)

WebUI.click(findTestObject('Menu report/Object1449_submit edit report'))

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.takeScreenshot('Screenshot/TC.Log.075.001 create basic info report categoy historical.png', FailureHandling.STOP_ON_FAILURE)

