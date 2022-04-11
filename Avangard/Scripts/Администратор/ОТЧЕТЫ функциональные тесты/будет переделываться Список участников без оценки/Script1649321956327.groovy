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

'Вкладка Отчеты'
WebUI.click(findTestObject('Object Repository/Avangard New/Object (Администратор)/Сase (Игровая статистика)/report'))

WebUI.click(findTestObject('Object Repository/admin/reports/not/Page_/not'))

WebUI.verifyTextPresent('СПИСОК УЧАСТНИКОВ БЕЗ ОЦЕНКИ', true)

WebUI.takeFullPageScreenshot(('C:\\scr\\' + GlobalVariable.school) + '29.jpg')

WebUI.setText(findTestObject('Object Repository/admin/reports/not/Page_/input__react-select-2-input'), 'ака')

WebUI.sendKeys(findTestObject('Object Repository/admin/reports/not/Page_/input__react-select-2-input'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/admin/reports/not/Page_/input__react-select-3-input'), GlobalVariable.school)

WebUI.sendKeys(findTestObject('Object Repository/admin/reports/not/Page_/input__react-select-3-input'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/admin/reports/not/Page_/input__react-select-4-input'), '26.8')

WebUI.sendKeys(findTestObject('Object Repository/admin/reports/not/Page_/input__react-select-4-input'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/manager/kale/Page_/root'))

WebUI.closeBrowser()

