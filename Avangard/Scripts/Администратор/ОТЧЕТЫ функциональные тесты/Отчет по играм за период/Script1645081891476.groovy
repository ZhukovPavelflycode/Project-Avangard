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

'выбор отчета '
WebUI.click(findTestObject('Object Repository/admin/reports/period/Page_/div_'))

WebUI.verifyTextPresent('ОТЧЕТ ПО ИГРАМ ЗА ПЕРИОД', true)

'заполнение фильтров'
WebUI.setText(findTestObject('Object Repository/admin/reports/period/Page_/input__react-select-2-input'), 'академия')

'заполнение фильтров'
WebUI.sendKeys(findTestObject('Object Repository/admin/reports/period/Page_/input__react-select-2-input'), Keys.chord(Keys.ENTER))

'заполнение фильтров'
WebUI.setText(findTestObject('Object Repository/admin/reports/period/Page_/input__react-select-3-input'), GlobalVariable.school)

'заполнение фильтров'
WebUI.sendKeys(findTestObject('Object Repository/admin/reports/period/Page_/input__react-select-3-input'), Keys.chord(Keys.ENTER))

'заполнение фильтров'
WebUI.setText(findTestObject('Object Repository/admin/reports/period/Page_/input_._year'), '2020')

'ожидание пока не пропадет лого прелоадера '
WebUI.waitForElementNotPresent(findTestObject('Object Repository/admin/reports/period/Page_/img_ _sc-cMljjf KiCqS'), 0)

WebUI.verifyTextPresent('Управление командой со скамейки', true)

WebUI.verifyTextPresent('Самоотверженность / воля к победе', true)

WebUI.verifyTextPresent('СРЕДНЯЯ ОЦЕНКА', false)

WebUI.verifyTextPresent('АТАКУЮЩИЕ ДЕЙСТВИЯ', false)

WebUI.verifyTextPresent('ОБОРОНИТЕЛЬНЫЕ ДЕЙСТВИЯ', false)

WebUI.verifyTextPresent('Защитник', false)

WebUI.verifyTextPresent('Нападающий', false)

WebUI.click(findTestObject('Object Repository/admin/reports/period/Page_/root'))

WebUI.closeBrowser()

