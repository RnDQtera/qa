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

WebUI.setText(findTestObject('Menu report/Object1448_ketik nama laporan'), 'Laporan maintenance repair group realtime')

WebUI.delay(5)

WebUI.click(findTestObject('Menu report create basic info group realtime/Object1470_dd tipe laporan'))

WebUI.delay(2)

WebUI.click(findTestObject('Menu report create basic info group realtime/Object1471_cb custom report'))

WebUI.delay(5)

WebUI.click(findTestObject('Menu report create basic info group realtime/Object1472_dd asset info'))

WebUI.delay(5)

WebUI.click(findTestObject('Menu report create maintenane repair group realtime/Object1315_cb maintenance repair'))

WebUI.click(findTestObject('Menu report create basic info group realtime/Object1474_dd list by'))

WebUI.delay(5)

WebUI.click(findTestObject('Menu report create basic info group realtime/Object1475_cb group list'))

WebUI.click(findTestObject('Menu report create basic info group realtime/Object1476_dd data type'))

WebUI.delay(2)

WebUI.click(findTestObject('Menu report create basic info group realtime/Object1477_cb realtime data'))

WebUI.delay(2)

WebUI.click(findTestObject('Menu report create basic info group realtime/Object1501_cb aset id'))

WebUI.click(findTestObject('Menu report create basic info group realtime/Object1502_cb status'))

WebUI.click(findTestObject('Menu report create basic info group realtime/Object1503_cb group'))

WebUI.delay(2)

WebUI.click(findTestObject('Menu report create borrow group realtime/Object1533_cb tag'))

WebUI.click(findTestObject('Menu report create borrow group realtime/Object1534_cb group'))

WebUI.click(findTestObject('Menu report create borrow group realtime/Object1535_cb cat'))

WebUI.click(findTestObject('Menu report create borrow group realtime/Object1536_cb brand'))

WebUI.delay(2)

WebUI.click(findTestObject('Menu report create borrow group realtime/Object1537_model'))

WebUI.click(findTestObject('Menu report create borrow group realtime/Object1538_req date'))

WebUI.click(findTestObject('Menu report create borrow group realtime/Object1539_req by'))

WebUI.click(findTestObject('Menu report create borrow group realtime/Object1540_cb durasi'))

WebUI.click(findTestObject('Menu report create borrow group realtime/Object1541_cb due return'))

WebUI.delay(2)

WebUI.click(findTestObject('Menu report create maintenane repair group realtime/Object1317_clear field rpair'))

WebUI.delay(2)

WebUI.click(findTestObject('Menu report create basic info group realtime/Object1478_select group create'))

WebUI.delay(2)

WebUI.click(findTestObject('Menu report create transfer group realtime/Object1551_all cat'))

WebUI.delay(2)

WebUI.click(findTestObject('Menu report create basic info group realtime/Object1481_apply group'))

WebUI.delay(2)

WebUI.click(findTestObject('Menu report create transfer group realtime/Object1549_dd asset name trf'))

WebUI.delay(2)

WebUI.setText(findTestObject('Menu report create borrow group realtime/Object1518_ketik asset name'), 'truk')

WebUI.click(findTestObject('Menu report create borrow group realtime/Object1519_cb 1'))

WebUI.delay(2)

WebUI.click(findTestObject('Menu report create basic info group realtime/Object1485_dd asset name'))

WebUI.delay(2)

WebUI.setText(findTestObject('Menu report create borrow group realtime/Object1518_ketik asset name'), 'hino')

WebUI.delay(2)

WebUI.click(findTestObject('Menu report create transfer group realtime/Object1552_cb 1 br'))

WebUI.click(findTestObject('Menu report create basic info group realtime/Object1487_dd brand'))

WebUI.delay(2)

WebUI.setText(findTestObject('Menu report create transfer group realtime/Object1553_ketik model'), 'hyund')

WebUI.delay(2)

WebUI.click(findTestObject('Menu report create transfer group realtime/Object1554_cb 1 model trd'))

WebUI.delay(2)

WebUI.click(findTestObject('Menu report create basic info group realtime/Object1489_dd model'))

WebUI.delay(2)

WebUI.click(findTestObject('Menu report create transfer group realtime/Object1557_cb 4 tag trf'))

WebUI.click(findTestObject('Menu report create transfer group realtime/Object1558_select origin trf'))

WebUI.delay(2)

WebUI.click(findTestObject('Menu report create basic info group realtime/Object1480_lantai 2 create'))

WebUI.delay(2)

WebUI.click(findTestObject('Menu report create basic info group realtime/Object1481_apply group'))

WebUI.delay(2)

WebUI.click(findTestObject('Menu report create basic info group realtime/Object1495_dd status'))

WebUI.delay(2)

WebUI.click(findTestObject('Menu report create borrow group realtime/Object1524_cb 2 status'))

WebUI.click(findTestObject('Menu report create borrow group realtime/Object1526_req by'))

WebUI.delay(2)

WebUI.click(findTestObject('Menu report create transfer group realtime/Object1562_dd manager trf'))

WebUI.delay(2)

WebUI.click(findTestObject('Menu report create disposal group realtime/Object1311_cb 2 metod'))

WebUI.click(findTestObject('Menu report create disposal group realtime/Object1312_cb 3 metod'))

WebUI.delay(2)

WebUI.click(findTestObject('Menu report create transfer group realtime/Object1564_cb 1 manager'))

WebUI.click(findTestObject('Menu report create maintenane repair group realtime/Object1316_cb 4 result repair'))

WebUI.click(findTestObject('Menu report create tracking group realtime/Object1294_dd tracked'))

WebUI.delay(2)

WebUI.setText(findTestObject('Menu report create tracking group realtime/Object1295_ketik tracked'), 'normal')

WebUI.delay(2)

WebUI.click(findTestObject('Menu report create tracking group realtime/Object1296_cb 1 tracked'))

WebUI.click(findTestObject('Menu report create maintenane repair group realtime/Object1318_date'))

WebUI.delay(2)

WebUI.click(findTestObject('Menu report create maintenane repair group realtime/Object1319_mundur'))

WebUI.delay(2)

WebUI.click(findTestObject('Menu report create maintenane repair group realtime/Object1320_tgl 1'))

WebUI.click(findTestObject('Menu report create maintenane repair group realtime/Object1321_tgl 29'))

WebUI.delay(2)

WebUI.click(findTestObject('Menu report create basic info group realtime/Object1513_download report'))

WebUI.delay(5)

WebUI.setText(findTestObject('Menu report create basic info group realtime/Object1514_ketik penerima'), 'employee4@mailnesia.com')

WebUI.delay(2)

WebUI.click(findTestObject('Menu report/Object1442_dd schedule edit'))

WebUI.delay(2)

WebUI.click(findTestObject('Menu report create basic info group realtime/Object1516_daly sch create'))

WebUI.delay(2)

WebUI.click(findTestObject('Menu report/Object1449_submit edit report'))

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.takeScreenshot('Screenshot/TC.Log.072.009 create maintenance repair report group realtime.png', FailureHandling.STOP_ON_FAILURE)

