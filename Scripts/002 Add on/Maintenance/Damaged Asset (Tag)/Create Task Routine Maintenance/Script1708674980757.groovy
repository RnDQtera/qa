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

WebUI.navigateToUrl(GlobalVariable.localhost)

WebUI.click(findTestObject('1 localhost - advance'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('1 localhost - process localhost'), FailureHandling.STOP_ON_FAILURE)

WebUI.navigateToUrl(GlobalVariable.URL)

WebUI.setText(findTestObject('1 Object001_email'), GlobalVariable.email)

WebUI.setText(findTestObject('1 Object002_pw'), GlobalVariable.pw)

WebUI.click(findTestObject('1 Object003_btn login'))

WebUI.delay(10)

WebUI.click(findTestObject('1 Object004_fixedasset module'))

WebUI.delay(20)

WebUI.click(findTestObject('1 localhost -Add on'))

WebUI.click(findTestObject('1 localhost -Add on Maintenance'))

WebUI.delay(10)

WebUI.click(findTestObject('Routine Task/Object336_tab task'))

WebUI.delay(2)

WebUI.click(findTestObject('Routine Task/Object330_Create Task Routine'))

WebUI.setText(findTestObject('Routine Task/Object331_input name task'), 'Routine Task')

WebUI.click(findTestObject('Routine Task/Object332_schedule task routine maintenance'))

WebUI.click(findTestObject('Routine Task/Object337_insert date'))

WebUI.delay(2)

WebUI.click(findTestObject('Routine Task/Object334_submit date'))

WebUI.click(findTestObject('Routine Task/Object333_select frequency'))

WebUI.click(findTestObject('Routine Task/Object335_choose once'))

WebUI.setText(findTestObject('Routine Task/Object338_input duration'), '1')

WebUI.click(findTestObject('Routine Task/Object339_add indicator'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Routine Task/Object340_set indicator name'), 'indikator name')

WebUI.click(findTestObject('Routine Task/Object341_select type'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Routine Task/Object342_choose Type'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Routine Task/Object343_measurement'), 'Psi')

WebUI.click(findTestObject('Routine Task/Object344_select section'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Routine Task/Object345_input option 1'), 'Option 1')

WebUI.click(findTestObject('Routine Task/Object344_select section'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Routine Task/Object346_input option 2'), 'Option 2')

WebUI.click(findTestObject('Routine Task/Object347_check have standart value'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Routine Task/Object348_set standart value'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Routine Task/Object349_select option standart value'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Routine Task/Object348_set standart value'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Routine Task/Object350_set as mandatory'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Routine Task/Object351_save indicator'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Routine Task/Object352_select asset name'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Routine Task/Object353_button search asset name'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Routine Task/Object354_field asset name'), 'Optima')

WebUI.sendKeys(findTestObject('Routine Task/Object354_field asset name'), Keys.chord(Keys.ENTER))

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Routine Task/Object355_choose asset name'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Routine Task/Object356_save selection asset name'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Routine Task/Object357_select button assign'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Routine Task/Object358_check assign staff'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Routine Task/Object359_apply assign staff'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Routine Task/Object360_submit create task'), FailureHandling.STOP_ON_FAILURE)

