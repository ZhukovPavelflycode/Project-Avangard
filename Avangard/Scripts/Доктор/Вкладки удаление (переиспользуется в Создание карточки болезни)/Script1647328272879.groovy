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

'Выбор школы\r\n'
WebUI.click(findTestObject('Object Repository/Avangard New/Object (Доктор)/Case (Создание карточки и удаление)/school'))

WebUI.click(findTestObject('Object Repository/Avangard New/Object (Доктор)/Case (Создание карточки и удаление)/var_school'))

'Выбор команды'
WebUI.click(findTestObject('Object Repository/Avangard New/Object (Доктор)/Case (Создание карточки и удаление)/team'))

WebUI.click(findTestObject('Object Repository/Avangard New/Object (Доктор)/Case (Создание карточки и удаление)/Global school'))

WebUI.scrollToElement(findTestObject('Object Repository/Avangard New/Object (Доктор)/Case (Создание карточки и удаление)/p_1'), 
    0)

'Нажать на карточку'
WebUI.click(findTestObject('Object Repository/Avangard New/Object (Доктор)/Case (Создание карточки и удаление)/p_1'))

WebUI.setText(findTestObject('Object Repository/Avangard New/Object (Доктор)/Case (Создание карточки и удаление)/input__stady'), 
    'Допуск на игру')

WebUI.sendKeys(findTestObject('Object Repository/Avangard New/Object (Доктор)/Case (Создание карточки и удаление)/input__stady'), 
    Keys.chord(Keys.ENTER))

'Сохранение'
WebUI.click(findTestObject('Object Repository/Avangard New/Object (Доктор)/Case (Создание карточки и удаление)/button_save'))

WebUI.scrollToElement(findTestObject('Object Repository/Avangard New/Object (Доктор)/Case (Создание карточки и удаление)/p_1'), 
    0)

WebUI.click(findTestObject('Object Repository/Avangard New/Object (Доктор)/Case (Создание карточки и удаление)/p_1'))

'Проверка'
WebUI.verifyElementText(findTestObject('Object Repository/Avangard New/Object (Доктор)/Case (Создание карточки и удаление)/stady'), 
    'Допуск на игру')

WebUI.click(findTestObject('Object Repository/Avangard New/Object (Доктор)/Case (Создание карточки и удаление)/button_delete'))

WebUI.click(findTestObject('Object Repository/Avangard New/Object (Доктор)/Case (Создание карточки и удаление)/confirm'))

WebUI.verifyTextPresent('Карточка успешно удалена', false)

WebUI.closeBrowser()

