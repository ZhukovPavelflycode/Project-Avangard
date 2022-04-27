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

WebUI.callTestCase(findTestCase('Тренер/Авторизация тренер'), [:], FailureHandling.STOP_ON_FAILURE)

'Переход на вкладку составы'
WebUI.click(findTestObject('Avangard New/Object (Тренер)/Case (Составы)/span_sostav'))

not_run: WebUI.click(findTestObject('Avangard New/Object (Тренер)/Case (Составы)/team sostav'))

'Ввод команды'
not_run: WebUI.setText(findTestObject('Avangard New/Object (Тренер)/Case (Составы)/input__team sostav'), 
    'Омские')

not_run: WebUI.sendKeys(findTestObject('Avangard New/Object (Тренер)/Case (Составы)/input__team sostav'), 
    Keys.chord(Keys.ENTER))

'Очистить состав звеньев'
WebUI.click(findTestObject('Avangard New/Object (Тренер)/Case (Составы)/clear'))

'Очистить'
WebUI.click(findTestObject('Avangard New/Object (Тренер)/Case (Составы)/button_yes'))

'Когда место пустое пишется ЛН'
not_run: WebUI.click(findTestObject('Avangard New/Object (Тренер)/Case (Составы)/verif palyer null ln'))

'Проверка что позиции очистились'
WebUI.verifyElementText(findTestObject('Avangard New/Object (Тренер)/Case (Составы)/player null'), 'Игрок не выбран')

'Выбор игрока с переменной'
WebUI.scrollToElement(findTestObject('Avangard New/Object (Тренер)/Case (Составы)/choice_player'), 0)

'Выбор игрока с переменной'
WebUI.click(findTestObject('Avangard New/Object (Тренер)/Case (Составы)/choice_player'))

'Первая позиция'
WebUI.scrollToElement(findTestObject('Avangard New/Object (Тренер)/Case (Составы)/line_position'), 0)

'Первая позиция'
WebUI.click(findTestObject('Avangard New/Object (Тренер)/Case (Составы)/line_position'))

'Выбор первого игрока'
WebUI.click(findTestObject('Avangard New/Object (Тренер)/Case (Составы)/player 1'), FailureHandling.STOP_ON_FAILURE)

'Вторая позиция'
WebUI.click(findTestObject('Avangard New/Object (Тренер)/Case (Составы)/pos2'), FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('Avangard New/Object (Тренер)/Case (Составы)/player3'), 0, FailureHandling.STOP_ON_FAILURE)

'Выбор игрока'
WebUI.click(findTestObject('Avangard New/Object (Тренер)/Case (Составы)/player3'), FailureHandling.STOP_ON_FAILURE)

'Третья позиция'
WebUI.click(findTestObject('Avangard New/Object (Тренер)/Case (Составы)/po3'), FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('Avangard New/Object (Тренер)/Case (Составы)/player4'), 0, FailureHandling.STOP_ON_FAILURE)

'Четверный игрок'
WebUI.click(findTestObject('Avangard New/Object (Тренер)/Case (Составы)/player4'), FailureHandling.STOP_ON_FAILURE)

'Четвертая позиция'
WebUI.click(findTestObject('Avangard New/Object (Тренер)/Case (Составы)/pos4'), FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('Avangard New/Object (Тренер)/Case (Составы)/player5'), 0, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Avangard New/Object (Тренер)/Case (Составы)/player5'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyTextPresent('Игрок недоступен для выбора', false, FailureHandling.STOP_ON_FAILURE)

'Кнопка сохранить'
WebUI.click(findTestObject('Avangard New/Object (Тренер)/Case (Составы)/button_save'))

WebUI.verifyTextPresent('Изменения в составе сохранены', false)

WebUI.callTestCase(findTestCase('Игрок/Cоставы у Игрока (переиспользуется в Составы у Тренера)'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Тренер/Авторизация тренер'), [:], FailureHandling.STOP_ON_FAILURE)

'Переход на вкладку составы'
WebUI.click(findTestObject('Avangard New/Object (Тренер)/Case (Составы)/span_sostav'))

'Нажать очистка звеньев'
WebUI.click(findTestObject('Avangard New/Object (Тренер)/Case (Составы)/clear'))

'Очистить'
WebUI.click(findTestObject('Avangard New/Object (Тренер)/Case (Составы)/button_yes'))

'Сохранить'
WebUI.click(findTestObject('Avangard New/Object (Тренер)/Case (Составы)/button_save'))

'Проверка алерта'
WebUI.verifyTextPresent('Ошибка при загрузке: Состав не может быть пустым', false)

'Выход '
WebUI.scrollToElement(findTestObject('Avangard New/Object (Тренер)/Case (Составы)/exit profile'), 0)

WebUI.click(findTestObject('Avangard New/Object (Тренер)/Case (Составы)/exit profile'))

'Вход за Левашева'
WebUI.setText(findTestObject('Avangard New/Object (Тренер)/Case (Составы)/input_login Levashev'), 'levashev.ps@hc-avangard.com')

WebUI.setEncryptedText(findTestObject('Avangard New/Object (Тренер)/Case (Составы)/input__password Levashev'), 'G3QhECOlcrTdOvw/hygZOA==')

'Кнопка войти'
WebUI.click(findTestObject('Avangard New/Object (Тренер)/Case (Составы)/div_enter'))

'Вкладка состав'
WebUI.click(findTestObject('Avangard New/Object (Тренер)/Case (Составы)/span_sostav'))

'Кнопка очистить звенья'
WebUI.click(findTestObject('Avangard New/Object (Тренер)/Case (Составы)/button_'))

'Очистить (кнопка)'
WebUI.click(findTestObject('Avangard New/Object (Тренер)/Case (Составы)/button__1'))

WebUI.closeBrowser()

