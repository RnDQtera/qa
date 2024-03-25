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

WebUI.delay(3)

WebUI.click(findTestObject('1 Object0003_Button login'))

WebUI.click(findTestObject('1 Object0004_Module Fixed Asset'))

WebUI.delay(10)

WebUI.click(findTestObject('1 Object1592_maintenance'))

WebUI.click(findTestObject('Menu maintenance task/Object1633_tab task'))

WebUI.delay(10)

WebUI.click(findTestObject('Menu maintenance task/Object1634_tambah task'))

WebUI.delay(3)

WebUI.setText(findTestObject('Menu maintenance task/Object1635_ketik nama task'), 'automate test')

WebUI.click(findTestObject('Menu maintenance task/Object1636_date'))

WebUI.delay(3)

WebUI.click(findTestObject('Menu maintenance task/Object1672_tgl 18'))

WebUI.delay(3)

WebUI.click(findTestObject('Menu maintenance task/Object1638_apply date'))

WebUI.click(findTestObject('Menu maintenance task/Object1639_dd freq'))

WebUI.delay(3)

WebUI.click(findTestObject('Menu maintenance task/Object1640_cb 2 freq'))

WebUI.setText(findTestObject('Menu maintenance task/Object1641_ketik durasi'), '2')

WebUI.click(findTestObject('Menu maintenance task/Object1642_tambah indikator'))

WebUI.delay(3)

WebUI.setText(findTestObject('Menu maintenance task/Object1643_nama indikator'), 'test kondisi')

WebUI.click(findTestObject('Menu maintenance task/Object1644_dd type'))

WebUI.delay(3)

WebUI.click(findTestObject('Menu maintenance task/Object1645_cb 1 type'))

WebUI.delay(3)

WebUI.click(findTestObject('Menu maintenance task/Object1647_tambah selection'))

WebUI.delay(3)

WebUI.setText(findTestObject('Menu maintenance task/Object1646_input text selection'), 'baik')

WebUI.delay(3)

WebUI.click(findTestObject('Menu maintenance task/Object1647_tambah selection'))

WebUI.delay(3)

WebUI.setText(findTestObject('Menu maintenance task/Object1648_input select 2'), 'buruk')

WebUI.click(findTestObject('Menu maintenance task/Object1649_cb standar'))

WebUI.delay(3)

WebUI.click(findTestObject('Menu maintenance task/Object1650_dd standar'))

WebUI.delay(3)

WebUI.click(findTestObject('Menu maintenance task/Object1651_cb 1 standar'))

WebUI.click(findTestObject('Menu maintenance task/Object1652_close stndr'))

WebUI.delay(3)

WebUI.click(findTestObject('Menu maintenance task/Object1653_cb mandatory'))

WebUI.delay(3)

WebUI.click(findTestObject('Menu maintenance task/Object1654_save indicator'))

WebUI.delay(3)

WebUI.click(findTestObject('Menu maintenance task/Object1655_tambahkan asset'))

WebUI.delay(3)

WebUI.click(findTestObject('Menu maintenance task/Object1656_filter asset'))

WebUI.delay(3)

WebUI.click(findTestObject('Menu maintenance task/Object1657_dd nama asset'))

WebUI.delay(3)

WebUI.setText(findTestObject('Menu maintenance task/Object1658_ketik nama asset'), 'truk')

WebUI.delay(3)

WebUI.click(findTestObject('Menu maintenance task/Object1659_cb 1 nama asset'))

WebUI.click(findTestObject('Menu maintenance task/Object1660_selec group'))

WebUI.delay(3)

WebUI.click(findTestObject('Menu maintenance task/Object1661_lantai 1'))

WebUI.delay(3)

WebUI.click(findTestObject('Menu maintenance task/Object1662_apply group'))

WebUI.delay(3)

WebUI.click(findTestObject('Menu maintenance task/Object1663_apply filter'))

WebUI.delay(3)

WebUI.click(findTestObject('Menu maintenance task/Object1664_cb 1 asset'))

WebUI.delay(3)

WebUI.click(findTestObject('Menu maintenance task/Object1665_save asset name'))

WebUI.delay(3)

WebUI.click(findTestObject('Menu maintenance task/Object1666_tambah assign'))

WebUI.delay(3)

WebUI.click(findTestObject('Menu maintenance task/Object1667_search user'))

WebUI.delay(3)

WebUI.setText(findTestObject('Menu maintenance task/Object1668_ketik search user'), 'laure')

WebUI.sendKeys(findTestObject('Menu maintenance task/Object1668_ketik search user'), Keys.chord(Keys.ENTER))

WebUI.delay(3)

WebUI.click(findTestObject('Menu maintenance task/Object1669_cb 1 user'))

WebUI.delay(3)

WebUI.click(findTestObject('Menu maintenance task/Object1670_apply user'))

WebUI.delay(3)

WebUI.click(findTestObject('Menu maintenance task/Object1671_save task'))

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.takeScreenshot('Screenshot/TC.Log.079.001 membuat task.png', FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('1 Object2228_notifikasi'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('1 Object2229_show all notif'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5, FailureHandling.STOP_ON_FAILURE)

WebUI.takeScreenshot('Screenshot/Notifikasi/TC.Log.079.001 membuat task.png', FailureHandling.STOP_ON_FAILURE)

