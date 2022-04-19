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

WebUI.callTestCase(findTestCase('Доктор/Авторизация врач'), [:], FailureHandling.STOP_ON_FAILURE)

'Поле ввода Школа'
WebUI.setText(findTestObject('Avangard New/Object (Доктор)/Case (Создание карточки и удаление)/input__school eat'), 
    '"Авангард" Академия')

'Выбор 1 позиции в школе'
WebUI.click(findTestObject('Avangard New/Object (Доктор)/Case (Создание карточки и удаление)/1 posithion school eat'))

not_run: WebUI.sendKeys(findTestObject('Avangard New/Object (Доктор)/Case (Создание карточки и удаление)/input__school eat keys'), 
    Keys.chord(Keys.ENTER))

'Поле ввода Команда'
WebUI.setText(findTestObject('Avangard New/Object (Доктор)/Case (Создание карточки и удаление)/input__team eat'), 
    GlobalVariable.school)

'Выбор 1 позиции в команде'
WebUI.click(findTestObject('Avangard New/Object (Доктор)/Case (Создание карточки и удаление)/1 posithion team eat'))

not_run: WebUI.sendKeys(findTestObject('Avangard New/Object (Доктор)/Case (Создание карточки и удаление)/input__school eat keys'), 
    Keys.chord(Keys.ENTER))

WebUI.scrollToElement(findTestObject('Avangard New/Object (Доктор)/Case (Создание карточки и удаление)/card avtotestirovanie'), 
    0)

'Нажать на карточку'
WebUI.click(findTestObject('Avangard New/Object (Доктор)/Case (Создание карточки и удаление)/card avtotestirovanie'))

'Выбор Стадии'
WebUI.setText(findTestObject('Avangard New/Object (Доктор)/Case (Создание карточки и удаление)/input__stady'), 
    'Допуск на игру')

WebUI.sendKeys(findTestObject('Avangard New/Object (Доктор)/Case (Создание карточки и удаление)/input__stady'), 
    Keys.chord(Keys.ENTER))

'Сохранение'
WebUI.scrollToElement(findTestObject('Avangard New/Object (Доктор)/Case (Создание карточки и удаление)/button_save'), 
    0)

'Сохранение'
WebUI.click(findTestObject('Avangard New/Object (Доктор)/Case (Создание карточки и удаление)/button_save'))

WebUI.verifyElementText(findTestObject('Avangard New/Object (Доктор)/Case (Создание карточки и удаление)/verif eat alert'), 
    'Карточка успешно сохранена')

WebUI.callTestCase(findTestCase('Доктор/Проверка в профиле статуса Доступен (переиспользуется во Вкладке удаление)'), [:], 
    FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Доктор/Авторизация врач'), [:], FailureHandling.STOP_ON_FAILURE)

'Поле ввода Школа'
WebUI.setText(findTestObject('Avangard New/Object (Доктор)/Case (Создание карточки и удаление)/input__school eat'), 
    '"Авангард" Академия')

'Выбор 1 позиции в школе'
WebUI.click(findTestObject('Avangard New/Object (Доктор)/Case (Создание карточки и удаление)/1 posithion school eat'))

not_run: WebUI.sendKeys(findTestObject('Avangard New/Object (Доктор)/Case (Создание карточки и удаление)/input__school eat keys'), 
    Keys.chord(Keys.ENTER))

'Поле ввода Команда'
WebUI.setText(findTestObject('Avangard New/Object (Доктор)/Case (Создание карточки и удаление)/input__team eat'), 
    GlobalVariable.school)

'Выбор 1 позиции в команде'
WebUI.click(findTestObject('Avangard New/Object (Доктор)/Case (Создание карточки и удаление)/1 posithion team eat'))

not_run: WebUI.sendKeys(findTestObject('Avangard New/Object (Доктор)/Case (Создание карточки и удаление)/input__team eat keys'), 
    Keys.chord(Keys.ENTER))

WebUI.scrollToElement(findTestObject('Avangard New/Object (Доктор)/Case (Создание карточки и удаление)/card avtotestirovanie'), 
    0)

'Открывает карточку'
WebUI.click(findTestObject('Avangard New/Object (Доктор)/Case (Создание карточки и удаление)/card avtotestirovanie'))

'Проверка'
WebUI.verifyElementText(findTestObject('Avangard New/Object (Доктор)/Case (Создание карточки и удаление)/stady'), 
    'Допуск на игру')

'Нажать  Удалить'
WebUI.click(findTestObject('Avangard New/Object (Доктор)/Case (Создание карточки и удаление)/button_delete'))

'Подтверждение удаления'
WebUI.click(findTestObject('Avangard New/Object (Доктор)/Case (Создание карточки и удаление)/confirm'))

WebUI.verifyTextPresent('Карточка успешно удалена', false)

WebUI.closeBrowser()

'Переход на главную'
not_run: WebUI.click(findTestObject('Avangard New/Object (Доктор)/Case (Создание карточки и удаление)/span_home eat'))

'Клик на поле Школа'
not_run: WebUI.click(findTestObject('Avangard New/Object (Доктор)/Case (Создание карточки и удаление)/div_school click'))

'Клик на поле Команда'
not_run: WebUI.click(findTestObject('Avangard New/Object (Доктор)/Case (Создание карточки и удаление)/div__team click'))

'Выбор 1 поз школа'
not_run: WebUI.click(findTestObject('Avangard New/Object (Доктор)/Case (Создание карточки и удаление)/1 posithion school eat'))

'Выбор 1 поз команда'
not_run: WebUI.click(findTestObject('Avangard New/Object (Доктор)/Case (Создание карточки и удаление)/1 posithion team eat'))

