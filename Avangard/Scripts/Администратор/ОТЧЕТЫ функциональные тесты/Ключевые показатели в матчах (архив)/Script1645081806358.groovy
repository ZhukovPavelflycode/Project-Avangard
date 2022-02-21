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

WebUI.callTestCase(findTestCase('Администратор/Авторизация'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/admin/reports/keys/reports/report'))

WebUI.click(findTestObject('Object Repository/admin/reports/keys/Page_/key'))

WebUI.verifyTextPresent('КЛЮЧЕВЫЕ ПОКАЗАТЕЛИ В МАТЧАХ', true)

WebUI.takeFullPageScreenshot(('C:\\scr\\' + GlobalVariable.school) + '12.jpg')

WebUI.click(findTestObject('Object Repository/admin/reports/keys/Page_/button_._react-daterange-picker__calendar-b_487f96'))

WebUI.click(findTestObject('Object Repository/admin/franch/franch/Page_/button_'))

WebUI.click(findTestObject('Object Repository/admin/franch/franch/Page_/button_1'))

WebUI.click(findTestObject('Object Repository/admin/franch/franch/Page_/button__1'))

WebUI.click(findTestObject('Object Repository/admin/franch/franch/Page_/button_1'))

WebUI.setText(findTestObject('Object Repository/admin/reports/keys/Page_/input__react-select-3-input'), 'ака')

WebUI.sendKeys(findTestObject('Object Repository/admin/reports/keys/Page_/input__react-select-3-input'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/admin/reports/keys/Page_/input__react-select-4-input'), GlobalVariable.school)

WebUI.sendKeys(findTestObject('Object Repository/admin/reports/keys/Page_/input__react-select-4-input'), Keys.chord(Keys.ENTER))

WebUI.takeFullPageScreenshot(('C:\\scr\\' + GlobalVariable.school) + '13.jpg', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/admin/franch/franch/Page_/root'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.closeBrowser()

