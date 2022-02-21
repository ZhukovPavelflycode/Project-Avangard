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

WebUI.callTestCase(findTestCase('Тренер/Авторизация'), [:], FailureHandling.STOP_ON_FAILURE)

'Переход ан вкладку составы'
WebUI.click(findTestObject('Avangard New/Object (Тренер)/Case (Составы)/lines'))

'Очистить состав звеньев'
WebUI.click(findTestObject('Avangard New/Object (Тренер)/Case (Составы)/clear'))

'Очистить'
WebUI.click(findTestObject('Avangard New/Object (Тренер)/Case (Составы)/button_yes'))

'Выбор игрока'
WebUI.click(findTestObject('Avangard New/Object (Тренер)/Case (Составы)/choice_player'))

'Первая позиция'
WebUI.scrollToElement(findTestObject('Avangard New/Object (Тренер)/Case (Составы)/line_position'), 0)

'Первая позиция'
WebUI.click(findTestObject('Avangard New/Object (Тренер)/Case (Составы)/line_position'))

'Выбор первого игрока'
WebUI.click(findTestObject('Avangard New/Object (Тренер)/Case (Составы)/player 1'))

'Вторая позиция'
WebUI.click(findTestObject('Avangard New/Object (Тренер)/Case (Составы)/pos2'))

WebUI.scrollToElement(findTestObject('Avangard New/Object (Тренер)/Case (Составы)/player3'), 0)

'Выбор игрока'
WebUI.click(findTestObject('Avangard New/Object (Тренер)/Case (Составы)/player3'))

'Третья позиция'
WebUI.click(findTestObject('Avangard New/Object (Тренер)/Case (Составы)/po3'))

WebUI.scrollToElement(findTestObject('Avangard New/Object (Тренер)/Case (Составы)/player4'), 0)

'Четверный игрок'
WebUI.click(findTestObject('Avangard New/Object (Тренер)/Case (Составы)/player4'))

'Четвертая позиция'
WebUI.click(findTestObject('Avangard New/Object (Тренер)/Case (Составы)/pos4'))

WebUI.scrollToElement(findTestObject('Avangard New/Object (Тренер)/Case (Составы)/player5'), 0)

WebUI.click(findTestObject('Avangard New/Object (Тренер)/Case (Составы)/player5'))

WebUI.verifyTextPresent('Игрок недоступен для выбора', false)

'Кнопка сохранить'
WebUI.click(findTestObject('Avangard New/Object (Тренер)/Case (Составы)/button_save'))

WebUI.verifyTextPresent('Изменения в составе сохранены', false)

'Проверки вкладки составы у игрока'
WebUI.callTestCase(findTestCase('Тренер/Cоставы у игрока'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Тренер/Авторизация'), [:], FailureHandling.STOP_ON_FAILURE)

'Вкладка состав'
WebUI.click(findTestObject('Avangard New/Object (Тренер)/Case (Составы)/lines'))

'Нажать очистка звеньев'
WebUI.click(findTestObject('Avangard New/Object (Тренер)/Case (Составы)/clear'))

'Очистить'
WebUI.click(findTestObject('Avangard New/Object (Тренер)/Case (Составы)/button_yes'))

'Сохранить'
WebUI.click(findTestObject('Avangard New/Object (Тренер)/Case (Составы)/button_save'))

'Проверка алерта'
WebUI.verifyTextPresent('Ошибка при загрузке: Состав не может быть пустым', false)

WebUI.scrollToElement(findTestObject('Avangard New/Object (Тренер)/Case (Составы)/exit profile'), 0)

WebUI.click(findTestObject('Avangard New/Object (Тренер)/Case (Составы)/exit profile'))

WebUI.setText(findTestObject('Avangard New/Object (Тренер)/Case (Составы)/input__ui__Input-sc-1cni9v4-1 jzzeSa'), 'ageev.da@hc-avangard.com')

'Шифрованный пароль'
WebUI.setEncryptedText(findTestObject('Avangard New/Object (Тренер)/Case (Составы)/input__ui__Input-sc-1cni9v4-1 jzzeSa_1'), 
    '8SjyVsS+U6UG/NSlG18wrA==')

'Кнопка войти'
WebUI.click(findTestObject('Avangard New/Object (Тренер)/Case (Составы)/div_'))

'Вкладка состав'
WebUI.click(findTestObject('Avangard New/Object (Тренер)/Case (Составы)/span_'))

'Кнопка очистить звенья'
WebUI.click(findTestObject('Avangard New/Object (Тренер)/Case (Составы)/button_'))

'Очистить (кнопка)'
WebUI.click(findTestObject('Avangard New/Object (Тренер)/Case (Составы)/button__1'))

WebUI.click(findTestObject('Avangard New/Object (Тренер)/Case (Составы)/home ageev'))

WebUI.closeBrowser()

