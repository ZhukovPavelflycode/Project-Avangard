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

WebUI.callTestCase(findTestCase('Администратор/Отчет для тк'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/admin/reports/basic/Page_/Page_/div_'))

WebUI.verifyTextPresent('ОТЧЕТ ИНДИВИДУАЛЬНОГО ПЛАНА', true)

WebUI.setText(findTestObject('Object Repository/admin/reports/basic/Page_/Page_/input__react-select-3-input'), 'ака')

WebUI.sendKeys(findTestObject('Object Repository/admin/reports/basic/Page_/Page_/input__react-select-3-input'), Keys.chord(
        Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/admin/reports/basic/Page_/Page_/input__react-select-4-input'), GlobalVariable.school)

WebUI.sendKeys(findTestObject('Object Repository/admin/reports/basic/Page_/Page_/input__react-select-4-input'), Keys.chord(
        Keys.ENTER))

'игрок из глоабальной переменной , при смене\\уходе из команды заменить в профиле Default'
WebUI.setText(findTestObject('Object Repository/admin/reports/basic/Page_/Page_/input__react-select-5-input'), GlobalVariable.player_for_test)

WebUI.sendKeys(findTestObject('Object Repository/admin/reports/basic/Page_/Page_/input__react-select-5-input'), Keys.chord(
        Keys.ENTER))

WebUI.click(findTestObject('Object Repository/manager/Page_/season'))

WebUI.click(findTestObject('Object Repository/manager/Page_/div_ 20-21'))

WebUI.verifyElementVisible(findTestObject('Object Repository/admin/reports/basic/Page_/Page_/canvas'))

WebUI.takeFullPageScreenshot(('C:\\scr\\' + GlobalVariable.school) + '14.jpg')

WebUI.scrollToElement(findTestObject('Object Repository/admin/reports/basic/Page_/Page_/div__1'), 0)

WebUI.takeFullPageScreenshot(('C:\\scr\\' + GlobalVariable.school) + '15.jpg')

WebUI.click(findTestObject('Object Repository/admin/reports/basic/Page_/Page_/div__1'))

WebUI.takeFullPageScreenshot(('C:\\scr\\' + GlobalVariable.school) + '16.jpg')

WebUI.click(findTestObject('Object Repository/admin/reports/basic/Page_/Page_/div__1_2'))

WebUI.takeFullPageScreenshot(('C:\\scr\\' + GlobalVariable.school) + '17.jpg')

WebUI.click(findTestObject('Object Repository/admin/reports/basic/Page_/Page_/button_'))

WebUI.takeFullPageScreenshot(('C:\\scr\\' + GlobalVariable.school) + '18.jpg')

WebUI.click(findTestObject('Object Repository/admin/reports/basic/Page_/Page_/div_  _sidebar__overlay sidebar__overlay_visible'))

WebUI.click(findTestObject('Object Repository/admin/reports/basic/Page_/Page_/button_'))

WebUI.click(findTestObject('Object Repository/admin/reports/basic/Page_/Page_/div_  _sidebar__overlay sidebar__overlay_visible'))

WebUI.click(findTestObject('Object Repository/admin/reports/basic/Page_/Page_/span_'))

WebUI.closeBrowser()

