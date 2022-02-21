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

'Авторизация'
WebUI.callTestCase(findTestCase('Администратор/Авторизация'), [:], FailureHandling.STOP_ON_FAILURE)

'Переход на вкладку Игроки'
WebUI.click(findTestObject('Object Repository/admin/students/Page_/students'))

WebUI.setText(findTestObject('Object Repository/admin/students/input'), GlobalVariable.player_for_test_1)

'Выбор игрока'
WebUI.click(findTestObject('Object Repository/admin/students/Page_/artur'))

'Получение игрового номера для сверки\r\n'
num = WebUI.getText(findTestObject('Object Repository/admin/students/Page_/player_num'))

'Сверка игрового номера\r\n'
WebUI.verifyElementText(findTestObject('Object Repository/admin/students/Page_/player_num1'), num)

'Переход на вкладку представители'
WebUI.click(findTestObject('Object Repository/admin/students/Page_/family'))

'Проверка панели вкладки представители'
WebUI.verifyElementPresent(findTestObject('admin/panel'), 0)

WebUI.click(findTestObject('Object Repository/admin/students/Page_/Status'))

'Переход на вкладку игры'
WebUI.click(findTestObject('admin/zveno'))

'Проверка вкладки игры'
WebUI.verifyElementPresent(findTestObject('Object Repository/admin/students/Page_/zveno'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/admin/students/Page_/zveno1'), 0)

'Кнопка статистика'
WebUI.click(findTestObject('Object Repository/admin/students/Page_/button_stats'))

WebUI.verifyTextPresent('Матчи', false)

WebUI.verifyTextPresent('Ранг', false)

WebUI.verifyTextPresent('Игр. время', false)

'Оценка игр'
WebUI.click(findTestObject('Object Repository/admin/students/Page_/button_estamition'))

WebUI.verifyTextPresent('АТАКУЮЩИЕ ДЕЙСТВИЯ', false)

WebUI.verifyTextPresent('ОБОРОНИТЕЛЬНЫЕ ДЕЙСТВИЯ', false)

WebUI.click(findTestObject('Object Repository/admin/students/Page_/button_skill'))

WebUI.verifyTextPresent('Ускорение', false)

WebUI.verifyTextPresent('Катание', false)

WebUI.verifyTextPresent('Скорость', false)

WebUI.verifyTextPresent('Баланс', false)

WebUI.closeBrowser()

