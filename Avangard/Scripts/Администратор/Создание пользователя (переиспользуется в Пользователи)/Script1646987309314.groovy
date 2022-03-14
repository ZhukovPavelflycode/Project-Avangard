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

'Для проверки отдельно'
not_run: WebUI.callTestCase(findTestCase('Администратор/Авторизация'), [:], FailureHandling.STOP_ON_FAILURE)

'Вкладка пользователи'
WebUI.click(findTestObject('Object Repository/Avangard New/Object (Администратор)/Case (Пользователи)/span users'))

'Нажимает кнопку Добавить пользователя'
WebUI.click(findTestObject('Object Repository/Avangard New/Object (Администратор)/Case (Пользователи)/button_add users'))

'Нажимает на поле роль'
WebUI.click(findTestObject('Object Repository/Avangard New/Object (Администратор)/Case (Пользователи)/div__role'))

'Роль: Тренер'
WebUI.click(findTestObject('Object Repository/Avangard New/Object (Администратор)/Case (Пользователи)/div__trainer add'))

'Имя'
WebUI.setText(findTestObject('Object Repository/Avangard New/Object (Администратор)/Case (Пользователи)/input__Name'), 'User')

'Фамилия'
WebUI.setText(findTestObject('Object Repository/Avangard New/Object (Администратор)/Case (Пользователи)/imput family'), 
    'Test')

'Отчество'
WebUI.setText(findTestObject('Object Repository/Avangard New/Object (Администратор)/Case (Пользователи)/imput otch'), 'add')

'Открывает дата пикер'
WebUI.click(findTestObject('Object Repository/Avangard New/Object (Администратор)/Case (Пользователи)/svg'))

'Меню выбора года'
WebUI.click(findTestObject('Object Repository/Avangard New/Object (Администратор)/Case (Пользователи)/span_2022_react-datepicker'))

WebUI.scrollToElement(findTestObject('Object Repository/Avangard New/Object (Администратор)/Case (Пользователи)/div_2000'), 
    0)

'2000 год'
WebUI.click(findTestObject('Object Repository/Avangard New/Object (Администратор)/Case (Пользователи)/div_2000'))

'15 число'
WebUI.click(findTestObject('Object Repository/Avangard New/Object (Администратор)/Case (Пользователи)/div_15'))

WebUI.click(findTestObject('Object Repository/Avangard New/Object (Администратор)/Case (Пользователи)/div__number'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Avangard New/Object (Администратор)/Case (Пользователи)/div__number'), '8(905)045-87-54')

'Поле ввода Школа'
WebUI.click(findTestObject('Object Repository/Avangard New/Object (Администратор)/Case (Пользователи)/div__schooladd'))

'Авангард академия'
WebUI.click(findTestObject('Object Repository/Avangard New/Object (Администратор)/Case (Пользователи)/font_avangard'))

'Поле ввода команда'
WebUI.click(findTestObject('Object Repository/Avangard New/Object (Администратор)/Case (Пользователи)/div__team'))

'Омские Ястребы'
WebUI.click(findTestObject('Object Repository/Avangard New/Object (Администратор)/Case (Пользователи)/font_ystrebi'))

'Поле ввода Тип\r\n'
WebUI.click(findTestObject('Object Repository/Avangard New/Object (Администратор)/Case (Пользователи)/div_tipe'))

'Тип Тренер'
WebUI.click(findTestObject('Object Repository/Avangard New/Object (Администратор)/Case (Пользователи)/div__1'))

WebUI.setText(findTestObject('Object Repository/Avangard New/Object (Администратор)/Case (Пользователи)/input__login'), 
    'testuser@mail.ru')

WebUI.setEncryptedText(findTestObject('Object Repository/Avangard New/Object (Администратор)/Case (Пользователи)/input__password'), 
    'KYHCBHc84S1cPnf6Imz4kQ==')

WebUI.scrollToElement(findTestObject('Object Repository/Avangard New/Object (Администратор)/Case (Пользователи)/font_save'), 
    0)

'Сохранение'
WebUI.click(findTestObject('Object Repository/Avangard New/Object (Администратор)/Case (Пользователи)/font_save'))

WebUI.verifyElementText(findTestObject('Avangard New/Object (Администратор)/Case (Пользователи)/proverka alert'), 'Пользователь создан')

'Скролл к кнопке Выход с профиля'
WebUI.scrollToElement(findTestObject('Avangard New/Object (Администратор)/Case (Пользователи)/span_exit profile'), 0)

'Скролл к кнопке Выход с профиля'
WebUI.click(findTestObject('Avangard New/Object (Администратор)/Case (Пользователи)/span_exit profile'))

'Ввод логина'
WebUI.setText(findTestObject('Object Repository/Avangard New/Object (Администратор)/Case (Пользователи)/input_authorization'), 
    'testuser@mail.ru')

'Ввод пароля'
WebUI.setEncryptedText(findTestObject('Object Repository/Avangard New/Object (Администратор)/Case (Пользователи)/input__password test user'), 
    'KYHCBHc84S1cPnf6Imz4kQ==')

'Вход'
WebUI.click(findTestObject('Object Repository/Avangard New/Object (Администратор)/Case (Пользователи)/div enter'))

WebUI.scrollToElement(findTestObject('Avangard New/Object (Администратор)/Case (Пользователи)/div_User Test'), 0)

WebUI.verifyElementText(findTestObject('Avangard New/Object (Администратор)/Case (Пользователи)/div_User Test'), 'Test User')

