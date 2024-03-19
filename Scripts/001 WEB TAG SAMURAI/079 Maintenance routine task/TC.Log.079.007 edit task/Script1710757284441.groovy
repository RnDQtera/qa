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

WebUI.delay(10)

WebUI.click(findTestObject('Menu maintenance task/Object1633_tab task'))

WebUI.delay(3)

WebUI.click(findTestObject('Menu maintenance task/Object1673_search'))

WebUI.delay(3)

WebUI.setText(findTestObject('Menu maintenance task/Object1674_ketik search'), 'automate')

WebUI.sendKeys(findTestObject('Menu maintenance task/Object1674_ketik search'), Keys.chord(Keys.ENTER))

WebUI.delay(3)

WebUI.click(findTestObject('Menu maintenance task/Object1703_titik'))

WebUI.delay(3)

WebUI.click(findTestObject('Menu maintenance task/Object1704_act edit'))

WebUI.delay(3)

WebUI.click(findTestObject('Menu maintenance task/Object1719_tambah id'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.setText(findTestObject('Menu maintenance task/Object1706_ketik id'), 'range kerusakan')

WebUI.click(findTestObject('Menu maintenance task/Object1707_dd type ed'))

WebUI.delay(3)

WebUI.click(findTestObject('Menu maintenance task/Object1708_type 2'))

WebUI.click(findTestObject('Menu maintenance task/Object1709_dd value type'))

WebUI.delay(3)

WebUI.click(findTestObject('Menu maintenance task/Object1710_cb number'))

WebUI.delay(3)

WebUI.click(findTestObject('Menu maintenance task/Object1711_cb standar value'))

WebUI.delay(3)

WebUI.click(findTestObject('Menu maintenance task/Object1712_dd value'))

WebUI.delay(3)

WebUI.click(findTestObject('Menu maintenance task/Object1713_cb 2'))

WebUI.delay(3)

WebUI.setText(findTestObject('Menu maintenance task/Object1714_min range'), '7')

WebUI.setText(findTestObject('Menu maintenance task/Object1715_max range'), '10')

WebUI.click(findTestObject('Menu maintenance task/Object1716_cb mandatory'))

WebUI.click(findTestObject('Menu maintenance task/Object1717_save indi'))

WebUI.delay(3)

WebUI.setText(findTestObject('Menu maintenance task/Object1705_nama'), 'automate edited')

WebUI.setText(findTestObject('Menu maintenance task/Object1720_durasi'), '2')

WebUI.delay(3)

WebUI.doubleClick(findTestObject('Menu maintenance task/Object1718_save edit'))

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.takeScreenshot('Screenshot/TC.Log.079.007 edit task.png', FailureHandling.STOP_ON_FAILURE)

