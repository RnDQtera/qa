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

WebUI.delay(10)

WebUI.click(findTestObject('1 Object0004_Module Fixed Asset'))

WebUI.delay(10)

WebUI.click(findTestObject('1 Object0005_Menu atas fixed asset'))

WebUI.delay(10)

WebUI.click(findTestObject('Menu fixed asset borrow prelist/Object0076_bt menu borrow'))

WebUI.click(findTestObject('Menu fixed asset borrow borrowed/Object0087_menu borrow borrowed'))

WebUI.delay(5)

WebUI.click(findTestObject('Menu fixed asset borrow borrowed/Object0088_search borrow borrowed'))

WebUI.delay(5)

WebUI.setText(findTestObject('Menu fixed asset borrow borrowed/Object0086_ketik search borrow borrowed'), 'kursi')

WebUI.sendKeys(findTestObject('Menu fixed asset borrow borrowed/Object0086_ketik search borrow borrowed'), Keys.chord(Keys.ENTER))

WebUI.delay(5)

WebUI.click(findTestObject('Menu fixed asset borrow borrowed/Object2231_titik 3'))

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Menu fixed asset borrow borrowed/Object2234_extend'))

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Menu fixed asset borrow borrowed/Object2235_ketik durasi'), '3')

WebUI.click(findTestObject('Menu fixed asset borrow borrowed/Object2236_submit extend'))

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Menu fixed asset borrow borrowed/Object2231_titik 3'))

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Menu fixed asset borrow borrowed/Object2237_confirm extend'))

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Menu fixed asset borrow borrowed/Object2238_dd approval'))

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Menu fixed asset borrow borrowed/Object2239_cb approve'))

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Menu fixed asset borrow borrowed/Object2240_submit extend'))

WebUI.delay(3, FailureHandling.STOP_ON_FAILURE)

WebUI.takeScreenshot('Screenshot/TC.Log.020.006 extend borrow borrowed.png', FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('1 Object2228_notifikasi'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5, FailureHandling.STOP_ON_FAILURE)

WebUI.takeScreenshot('Screenshot/Notifikasi/TC.Log.020.006 extend borrow borrowed.png', FailureHandling.STOP_ON_FAILURE)

