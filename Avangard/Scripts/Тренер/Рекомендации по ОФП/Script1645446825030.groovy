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

'Открытие вкладки физическое тестирование\r\n'
WebUI.click(findTestObject('Object Repository/Avangard New/Object (Тренер)/physical_testing_report'))

'Нажимает на поле Дата поценки'
WebUI.click(findTestObject('Object Repository/Avangard New/Object (Тренер)/div_31.07.2020'))

'Выбирает дату'
WebUI.click(findTestObject('Object Repository/Avangard New/Object (Тренер)/div_31.10.2020'))

'Скроллит к Ганину'
WebUI.scrollToElement(findTestObject('Object Repository/AA/gazizov'), 0)

'Открывает  добавить рекомендацию Ганина'
WebUI.click(findTestObject('Object Repository/Avangard New/Object (Тренер)/trikozov'))

'Нажимает кнопку закрыть на вкладке план тренеровок'
not_run: WebUI.click(findTestObject('Object Repository/Avangard New/Object (Тренер)/button exit'), FailureHandling.STOP_ON_FAILURE)

while (WebUI.verifyElementVisible(findTestObject('Object Repository/Avangard New/Object (Тренер)/add'), FailureHandling.OPTIONAL) == 
false) {
    WebUI.click(findTestObject('Avangard New/Object (Тренер)/button close1'))
}

'Нажимает добавить план тренировки'
WebUI.click(findTestObject('Object Repository/Avangard New/Object (Тренер)/add'))

WebUI.setText(findTestObject('Object Repository/Avangard New/Object (Тренер)/input_ _sc-eqIVtm fYABJt'), 'тестовый план тренировки')

'Открывает вкладку Задачи'
WebUI.click(findTestObject('Object Repository/Avangard New/Object (Тренер)/div__1zadacha'))

'Нажимает закрыть задачу во вклаке задачи'
not_run: WebUI.click(findTestObject('Object Repository/Avangard New/Object (Тренер)/button close'))

while (WebUI.verifyElementVisible(findTestObject('Object Repository/Avangard New/Object (Тренер)/addzadacha'), FailureHandling.OPTIONAL) == 
false) {
    WebUI.click(findTestObject('Avangard New/Object (Тренер)/button close2'))
}

'Нажимает добавить задачу'
WebUI.click(findTestObject('Object Repository/Avangard New/Object (Тренер)/addzadacha'))

'Ввод текста'
WebUI.setText(findTestObject('Object Repository/Avangard New/Object (Тренер)/input_ _sc-eqIVtm fYABJt_1'), 'тестовая задача ')

WebUI.scrollToElement(findTestObject('Object Repository/Avangard New/Object (Тренер)/save'), 0)

'Сохраняет'
WebUI.click(findTestObject('Object Repository/Avangard New/Object (Тренер)/save'))

WebUI.verifyTextPresent('Форма сохранена', false)

'Переход на главную'
WebUI.click(findTestObject('Object Repository/Avangard New/Object (Тренер)/root'))

WebUI.scrollToElement(findTestObject('Object Repository/Avangard New/Object (Тренер)/exit'), 0)

WebUI.click(findTestObject('Object Repository/Avangard New/Object (Тренер)/exit'))

'Ниже проверки под игроком (заморожено до появления у игрока рекомендаций)'
not_run: WebUI.callTestCase(findTestCase('Игрок/Авторизация'), [:], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.scrollToElement(findTestObject('Object Repository/Avangard New/Object (Тренер)/div_19.02.22'), 0)

not_run: WebUI.verifyTextPresent('тестовая задача', false)

not_run: WebUI.click(findTestObject('Object Repository/Avangard New/Object (Тренер)/exit'))

'Ниже удаление добавленных рекомендаций под тренером'
WebUI.callTestCase(findTestCase('Тренер/Авторизация'), [:], FailureHandling.STOP_ON_FAILURE)

'Переход на рекомендации ОФП'
WebUI.click(findTestObject('Object Repository/Avangard New/Object (Тренер)/physical_testing_report'))

WebUI.click(findTestObject('Object Repository/Avangard New/Object (Тренер)/div_31.07.2020'))

WebUI.click(findTestObject('Object Repository/Avangard New/Object (Тренер)/div_31.10.2020'))

'Нажал просмотр у Ганина'
WebUI.click(findTestObject('Object Repository/Avangard New/Object (Тренер)/prosmotr'))

'Удалил план тренировок'
not_run: WebUI.click(findTestObject('Object Repository/Avangard New/Object (Тренер)/delete'))

'Нажимает кнопку закрыть на вкладке план тренеровок'
WebUI.click(findTestObject('Object Repository/Avangard New/Object (Тренер)/button exit'), FailureHandling.STOP_ON_FAILURE)

'Перешел на вкладку задачи'
WebUI.click(findTestObject('Object Repository/Avangard New/Object (Тренер)/div__1zadacha'))

'Удалил задачу'
not_run: WebUI.click(findTestObject('Object Repository/Avangard New/Object (Тренер)/delete1'))

'Нажимает закрыть задачу во вклаке задачи'
WebUI.click(findTestObject('Object Repository/Avangard New/Object (Тренер)/button close'))

'Соранил\r\n'
WebUI.click(findTestObject('Object Repository/Avangard New/Object (Тренер)/save'))

'Перешел на главную'
WebUI.click(findTestObject('Object Repository/Avangard New/Object (Тренер)/root'))

WebUI.closeBrowser()

