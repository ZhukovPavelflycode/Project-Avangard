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

'Кнопка Добавить'
WebUI.click(findTestObject('Avangard New/Object (Доктор)/Case (Создание карточки и удаление)/button_add'))

WebUI.click(findTestObject('Avangard New/Object (Доктор)/Case (Создание карточки и удаление)/school'))

'Выбор школы Авангард'
WebUI.click(findTestObject('Avangard New/Object (Доктор)/Case (Создание карточки и удаление)/avanguard'))

WebUI.click(findTestObject('Avangard New/Object (Доктор)/Case (Создание карточки и удаление)/team'))

'Выбор Команда с переменной'
WebUI.click(findTestObject('Avangard New/Object (Доктор)/Case (Создание карточки и удаление)/var_team'))

WebUI.click(findTestObject('Avangard New/Object (Доктор)/Case (Создание карточки и удаление)/player'))

'Выбор Игрока с переменной'
WebUI.click(findTestObject('Avangard New/Object (Доктор)/Case (Создание карточки и удаление)/var_player'))

WebUI.click(findTestObject('Avangard New/Object (Доктор)/Case (Создание карточки и удаление)/tip'))

'Выбор типа Травма'
WebUI.click(findTestObject('Avangard New/Object (Доктор)/Case (Создание карточки и удаление)/travma'))

WebUI.click(findTestObject('Avangard New/Object (Доктор)/Case (Создание карточки и удаление)/stady 1'))

'Выбор стадии Не допущен к тренировкам'
WebUI.click(findTestObject('Avangard New/Object (Доктор)/Case (Создание карточки и удаление)/choise_stady'))

WebUI.click(findTestObject('Avangard New/Object (Доктор)/Case (Создание карточки и удаление)/tip travm'))

'Травма Верхней части'
WebUI.click(findTestObject('Avangard New/Object (Доктор)/Case (Создание карточки и удаление)/choise_travm'))

'Ввод текста в описание'
WebUI.setText(findTestObject('Avangard New/Object (Доктор)/Case (Создание карточки и удаление)/dop opisanie'), 'автотестирование ')

'Сохранить'
WebUI.click(findTestObject('Avangard New/Object (Доктор)/Case (Создание карточки и удаление)/button_save'))

'Проверка алерта'
WebUI.verifyTextPresent('Карточка успешно сохранена', false)

WebUI.callTestCase(findTestCase('Доктор/Проверка в профиле статуса Травмирован (переиспользуется в Создание карточки болезни)'), 
    [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Доктор/Вкладки удаление (переиспользуется в Создание карточки болезни)'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.closeBrowser()

