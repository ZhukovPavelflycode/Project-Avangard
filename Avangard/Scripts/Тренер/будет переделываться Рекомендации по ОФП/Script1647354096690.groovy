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

'Открытие вкладки физическое тестирование\r\n'
WebUI.click(findTestObject('Avangard New/Object (Тренер)/Case (Рекомендации по ОФП)/physical_testing_report'))

'Нажимает на поле Дата поценки'
WebUI.click(findTestObject('Avangard New/Object (Тренер)/Case (Рекомендации по ОФП)/div_31.07.2020'))

'Выбирает дату'
WebUI.click(findTestObject('Avangard New/Object (Тренер)/Case (Рекомендации по ОФП)/div_31.10.2020'))

'Скроллит к Ганину'
WebUI.scrollToElement(findTestObject('AA/gazizov'), 0)

'Открывает  добавить рекомендацию Ганина'
WebUI.click(findTestObject('Avangard New/Object (Тренер)/Case (Рекомендации по ОФП)/trikozov'))

'Нажимает кнопку закрыть на вкладке план тренеровок'
not_run: WebUI.click(findTestObject('Avangard New/Object (Тренер)/Case (Рекомендации по ОФП)/button exit'), FailureHandling.STOP_ON_FAILURE)

while (WebUI.verifyElementVisible(findTestObject('Avangard New/Object (Тренер)/Case (Рекомендации по ОФП)/add'), FailureHandling.OPTIONAL) == 
false) {
    WebUI.click(findTestObject('Avangard New/Object (Тренер)/Case (Рекомендации по ОФП)/button close1'))
}

'Нажимает добавить план тренировки'
WebUI.click(findTestObject('Avangard New/Object (Тренер)/Case (Рекомендации по ОФП)/add'))

WebUI.setText(findTestObject('Avangard New/Object (Тренер)/Case (Рекомендации по ОФП)/input_ _sc-eqIVtm fYABJt'), 'тестовый план тренировки')

'Открывает вкладку Задачи'
WebUI.click(findTestObject('Avangard New/Object (Тренер)/Case (Рекомендации по ОФП)/div__1zadacha'))

'Нажимает закрыть задачу во вклаке задачи'
not_run: WebUI.click(findTestObject('Avangard New/Object (Тренер)/Case (Рекомендации по ОФП)/button close'))

while (WebUI.verifyElementVisible(findTestObject('Avangard New/Object (Тренер)/Case (Рекомендации по ОФП)/addzadacha'), FailureHandling.OPTIONAL) == 
false) {
    WebUI.click(findTestObject('Avangard New/Object (Тренер)/Case (Рекомендации по ОФП)/button close2'))
}

'Нажимает добавить задачу'
WebUI.click(findTestObject('Avangard New/Object (Тренер)/Case (Рекомендации по ОФП)/addzadacha'))

'Ввод текста'
WebUI.setText(findTestObject('Avangard New/Object (Тренер)/Case (Рекомендации по ОФП)/input_ _sc-eqIVtm fYABJt_1'), 'тестовая задача ')

WebUI.scrollToElement(findTestObject('Avangard New/Object (Тренер)/Case (Рекомендации по ОФП)/save'), 0)

'Сохраняет'
WebUI.click(findTestObject('Avangard New/Object (Тренер)/Case (Рекомендации по ОФП)/save'))

WebUI.verifyTextPresent('Форма сохранена', false)

'Переход на главную'
WebUI.click(findTestObject('Avangard New/Object (Тренер)/Case (Рекомендации по ОФП)/root'))

WebUI.scrollToElement(findTestObject('Avangard New/Object (Тренер)/Case (Рекомендации по ОФП)/exit'), 0)

WebUI.click(findTestObject('Avangard New/Object (Тренер)/Case (Рекомендации по ОФП)/exit'))

'Ниже проверки под игроком (заморожено до появления у игрока рекомендаций)'
not_run: WebUI.callTestCase(findTestCase('Игрок/Авторизация игрок'), [:], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.scrollToElement(findTestObject('Avangard New/Object (Тренер)/Case (Рекомендации по ОФП)/div_19.02.22'), 0)

not_run: WebUI.verifyTextPresent('тестовая задача', false)

not_run: WebUI.click(findTestObject('Avangard New/Object (Тренер)/Case (Рекомендации по ОФП)/exit'))

'Ниже удаление добавленных рекомендаций под тренером'
WebUI.callTestCase(findTestCase('Тренер/Авторизация тренер'), [:], FailureHandling.STOP_ON_FAILURE)

'Переход на рекомендации ОФП'
WebUI.click(findTestObject('Avangard New/Object (Тренер)/Case (Рекомендации по ОФП)/physical_testing_report'))

WebUI.click(findTestObject('Avangard New/Object (Тренер)/Case (Рекомендации по ОФП)/div_31.07.2020'))

WebUI.click(findTestObject('Avangard New/Object (Тренер)/Case (Рекомендации по ОФП)/div_31.10.2020'))

'Нажал просмотр у Ганина'
WebUI.click(findTestObject('Avangard New/Object (Тренер)/Case (Рекомендации по ОФП)/prosmotr'))

'Удалил план тренировок'
not_run: WebUI.click(findTestObject('Avangard New/Object (Тренер)/Case (Рекомендации по ОФП)/delete'))

'Нажимает кнопку закрыть на вкладке план тренеровок'
WebUI.click(findTestObject('Avangard New/Object (Тренер)/Case (Рекомендации по ОФП)/button exit'), FailureHandling.STOP_ON_FAILURE)

'Перешел на вкладку задачи'
WebUI.click(findTestObject('Avangard New/Object (Тренер)/Case (Рекомендации по ОФП)/div__1zadacha'))

'Удалил задачу'
not_run: WebUI.click(findTestObject('Avangard New/Object (Тренер)/Case (Рекомендации по ОФП)/delete1'))

'Нажимает закрыть задачу во вклаке задачи'
WebUI.click(findTestObject('Avangard New/Object (Тренер)/Case (Рекомендации по ОФП)/button close'))

'Соранил\r\n'
WebUI.click(findTestObject('Avangard New/Object (Тренер)/Case (Рекомендации по ОФП)/save'))

'Перешел на главную'
WebUI.click(findTestObject('Avangard New/Object (Тренер)/Case (Рекомендации по ОФП)/root'))

WebUI.closeBrowser()

