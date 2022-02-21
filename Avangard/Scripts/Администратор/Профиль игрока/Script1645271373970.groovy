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

'Редактирование профиля '
WebUI.click(findTestObject('Object Repository/admin/students/Page_/editProfile'))

'Скролл к номеру телефона\r\n'
WebUI.scrollToElement(findTestObject('admin/students/Page_/input__phone'), 0)

'Очистка поля номера телефона'
WebUI.clearText(findTestObject('Object Repository/admin/students/Page_/input__phone'), FailureHandling.STOP_ON_FAILURE)

'Ввод номера телефона\r\n'
WebUI.setText(findTestObject('Object Repository/admin/students/Page_/input__phone'), '0 (123) 456-78-91')

WebUI.scrollToElement(findTestObject('Object Repository/admin/students/Page_/Save_button_'), 0)

'Сохранение изменений'
WebUI.click(findTestObject('Object Repository/admin/students/Page_/Save_button_'))

WebUI.verifyTextPresent('Пользователь сохранен', false)

'Архивация игрока'
WebUI.click(findTestObject('Object Repository/admin/students/Page_/arch_button'))

'Подтверждение архивации'
WebUI.click(findTestObject('Object Repository/admin/students/Page_/confirm_arch_button'))

WebUI.verifyTextPresent('Пользователь сохранен', false)

WebUI.click(findTestObject('Object Repository/admin/students/Page_/students'))

'Переход в архивированные игроки'
WebUI.click(findTestObject('Object Repository/admin/students/Page_/arch_player'))

'Ввод игрока'
WebUI.scrollToElement(findTestObject('admin/students/Page_/global_player'), 0)

'Выбор игрока'
WebUI.click(findTestObject('Object Repository/admin/students/Page_/global_player'))

'Нажатие редактирование профиля'
WebUI.click(findTestObject('Object Repository/admin/students/Page_/editProfile'))

'Возврат из архива'
WebUI.click(findTestObject('Object Repository/admin/students/Page_/recovery_player'))

'Нажатие кнопки восстановить'
WebUI.click(findTestObject('Object Repository/admin/students/Page_/confirm_recovery'))

WebUI.verifyTextPresent('Пользователь сохранен', false)

'Переход на вкладку Игроки'
WebUI.click(findTestObject('Object Repository/admin/students/Page_/students'))

WebUI.setText(findTestObject('Object Repository/admin/students/input'), GlobalVariable.player_for_test_1)

'Выбор игрока'
WebUI.click(findTestObject('Object Repository/admin/students/Page_/artur'))

'Запоминание номера игрока'
num = WebUI.getText(findTestObject('Object Repository/admin/students/Page_/player_num'))

'Сверка номера игрока'
WebUI.verifyElementText(findTestObject('Object Repository/admin/students/Page_/player_num1'), num)

'Переход ан вкладку преставители'
WebUI.click(findTestObject('Object Repository/admin/students/Page_/family'))

'Проверка вклади представители'
WebUI.verifyElementPresent(findTestObject('admin/panel'), 0)

WebUI.click(findTestObject('Object Repository/admin/students/Page_/Status'))

'Переход на вкладку игры'
WebUI.click(findTestObject('admin/zveno'))

WebUI.verifyElementPresent(findTestObject('Object Repository/admin/students/Page_/zveno'), 0)

'Проверка вкладки игры'
WebUI.verifyElementPresent(findTestObject('Object Repository/admin/students/Page_/zveno1'), 0)

'Кнопка статистики'
WebUI.click(findTestObject('Object Repository/admin/students/Page_/button_stats'))

WebUI.verifyTextPresent('Матчи', false)

WebUI.verifyTextPresent('Ранг', false)

WebUI.verifyTextPresent('Игр. время', false)

'Оценка игры'
WebUI.click(findTestObject('Object Repository/admin/students/Page_/button_estamition'))

WebUI.verifyTextPresent('АТАКУЮЩИЕ ДЕЙСТВИЯ', false)

WebUI.verifyTextPresent('ОБОРОНИТЕЛЬНЫЕ ДЕЙСТВИЯ', false)

WebUI.click(findTestObject('Object Repository/admin/students/Page_/button_skill'))

WebUI.verifyTextPresent('Ускорение', false)

WebUI.verifyTextPresent('Катание', false)

WebUI.verifyTextPresent('Скорость', false)

WebUI.verifyTextPresent('Баланс', false)

WebUI.closeBrowser()

