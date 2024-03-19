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

WebUI.navigateToUrl(GlobalVariable.localhost)

WebUI.click(findTestObject('1 localhost - advance'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('1 localhost - process localhost'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.navigateToUrl(GlobalVariable.URL)

WebUI.setText(findTestObject('1 Object0001_Email'), GlobalVariable.EMAIL)

WebUI.setText(findTestObject('1 Object0002_Password'), GlobalVariable.PASSWORD)

WebUI.delay(3)

WebUI.click(findTestObject('1 Object0003_Button login'))

WebUI.click(findTestObject('1 Object0004_Module Fixed Asset'))

WebUI.delay(10)

WebUI.click(findTestObject('1 Object1592_maintenance'))

WebUI.delay(10)

WebUI.click(findTestObject('Menu maintenance routine scheduled task/Object1730_sch task'))

WebUI.delay(3)

WebUI.click(findTestObject('Menu maintenance routine scheduled task/Object1731_scan rfid'))

WebUI.delay(3)

WebUI.click(findTestObject('Menu maintenance maintenable asset/Object1594_sync'))

WebUI.delay(3)

WebUI.click(findTestObject('Menu maintenance maintenable asset/Object1595_close'))

WebUI.delay(3)

'untuk test antara QR TRUK 14, RFID 16 20 21 BERSTATUS UNDER MAINTENANCE'
WebUI.click(findTestObject('Menu maintenance routine scheduled task/Object1731_scan rfid'))

WebUI.delay(8)

WebUI.click(findTestObject('Menu maintenance routine scheduled task/Object1759_titik 3'))

WebUI.delay(3)

WebUI.click(findTestObject('Menu maintenance routine scheduled task/Object1760_update'))

WebUI.delay(3)

WebUI.click(findTestObject('Menu maintenance routine scheduled task/Object1761_scan tag'))

WebUI.delay(8)

WebUI.click(findTestObject('Menu maintenance routine scheduled task/Object1762_dd 1'))

WebUI.delay(3)

WebUI.click(findTestObject('Menu maintenance routine scheduled task/Object1763_cb 1'))

WebUI.delay(3)

WebUI.click(findTestObject('Menu maintenance routine scheduled task/Object1764_dd 2'))

WebUI.delay(3)

WebUI.click(findTestObject('Menu maintenance routine scheduled task/Object1765_cb 2'))

WebUI.delay(3)

WebUI.setText(findTestObject('Menu maintenance routine scheduled task/Object1766_ketik 3'), '98')

WebUI.setText(findTestObject('Menu maintenance routine scheduled task/Object1767_ketik 4'), '97')

WebUI.setText(findTestObject('Menu maintenance routine scheduled task/Object1768_ketik 5'), '100')

WebUI.click(findTestObject('Menu maintenance routine scheduled task/Object1769_cb 3rd party'))

WebUI.delay(3)

WebUI.click(findTestObject('Menu maintenance routine scheduled task/Object1770_dd 3rd pt'))

WebUI.delay(3)

WebUI.click(findTestObject('Menu maintenance routine scheduled task/Object1771_cb 4 pt'))

WebUI.click(findTestObject('Menu maintenance routine scheduled task/Object1772_add cost'))

WebUI.click(findTestObject('Menu maintenance routine scheduled task/Object1773_add comp'))

WebUI.delay(3)

WebUI.setText(findTestObject('Menu maintenance routine scheduled task/Object1774_ketik nama biaya'), 'biaya admin')

WebUI.setText(findTestObject('Menu maintenance routine scheduled task/Object1775_ketik jumlah'), '2')

WebUI.setText(findTestObject('Menu maintenance routine scheduled task/Object1776_ketik harga'), '150000')

WebUI.uploadFile(findTestObject('Menu maintenance routine scheduled task/Object1777_upload doc'), 'C:\\Users\\aplikasi internal\\Downloads\\kursiolympic.jpg')

WebUI.delay(3)

WebUI.click(findTestObject('Menu maintenance routine scheduled task/Object1778_apply doc'))

WebUI.delay(3)

WebUI.setText(findTestObject('Menu maintenance routine scheduled task/Object1779_add notes'), 'updateeeeeeeee')

WebUI.delay(3)

WebUI.click(findTestObject('Menu maintenance routine scheduled task/Object1780_submit update'))

WebUI.delay(3)

WebUI.click(findTestObject('Menu maintenance routine scheduled task/Object1781_ya'))

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.takeScreenshot('Screenshot/TC.Log.080.009 update task.png', FailureHandling.STOP_ON_FAILURE)

