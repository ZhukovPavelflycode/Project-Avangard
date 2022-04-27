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

'Вкладка оценка навыков'
WebUI.click(findTestObject('Avangard New/Object (Тренер)/Case (Оценка навыков)/span_home'))

'Кнопка редактировать'
WebUI.click(findTestObject('Avangard New/Object (Тренер)/Case (Оценка навыков)/edit home'))

'Скрол к кнопке сохранить'
WebUI.scrollToElement(findTestObject('Avangard New/Object (Тренер)/Case (Оценка навыков)/button_save_home'), 0)

'Сохранить общая'
WebUI.click(findTestObject('Avangard New/Object (Тренер)/Case (Оценка навыков)/button_save_home'))

WebUI.disableSmartWait()

WebUI.verifyElementText(findTestObject('Avangard New/Object (Тренер)/Case (Оценка навыков)/alert home add'), 'Добавьте от 1 до 7 навыков для развития.', 
    FailureHandling.STOP_ON_FAILURE)

WebUI.enableSmartWait()

'Добавить'
WebUI.scrollToElement(findTestObject('Avangard New/Object (Тренер)/Case (Оценка навыков)/button add1'), 0)

'Оценка 10'
WebUI.click(findTestObject('Avangard New/Object (Тренер)/Case (Оценка навыков)/span_10'))

'Оценка 9'
WebUI.click(findTestObject('Avangard New/Object (Тренер)/Case (Оценка навыков)/span_9'))

'Добавить'
WebUI.click(findTestObject('Avangard New/Object (Тренер)/Case (Оценка навыков)/button add1'))

'Вставка в цель текста'
WebUI.setText(findTestObject('Avangard New/Object (Тренер)/Case (Оценка навыков)/input__title1'), 'автотест1')

'Вставка в описание текста'
WebUI.setText(findTestObject('Avangard New/Object (Тренер)/Case (Оценка навыков)/imput_title2'), 'автотест2')

'Добавить в фокусе'
WebUI.click(findTestObject('Avangard New/Object (Тренер)/Case (Оценка навыков)/button_add in focus'))

'Кнопка добавить 2 строка'
WebUI.click(findTestObject('Avangard New/Object (Тренер)/Case (Оценка навыков)/button_add2'))

'Ввод текст в цель'
WebUI.setText(findTestObject('Avangard New/Object (Тренер)/Case (Оценка навыков)/input__title1'), 'тест')

'Ввод текста в описание'
WebUI.setText(findTestObject('Avangard New/Object (Тренер)/Case (Оценка навыков)/imput_title2'), 'тест2')

'Кнопка добавить 2 фокуса'
WebUI.click(findTestObject('Avangard New/Object (Тренер)/Case (Оценка навыков)/button_add in focus'))

'Редактировать 2 фокус'
WebUI.click(findTestObject('Avangard New/Object (Тренер)/Case (Оценка навыков)/edit3'))

'Ввод текста в цель'
WebUI.setText(findTestObject('Avangard New/Object (Тренер)/Case (Оценка навыков)/input__title1'), 'автотест3')

'Ввод текста в описание'
WebUI.setText(findTestObject('Avangard New/Object (Тренер)/Case (Оценка навыков)/imput_title2'), 'автотест4')

'Кнопка добавить 2 фокус'
WebUI.click(findTestObject('Avangard New/Object (Тренер)/Case (Оценка навыков)/button_save_focuse2'))

'Скролл Сохранить общая'
WebUI.scrollToElement(findTestObject('Avangard New/Object (Тренер)/Case (Оценка навыков)/button_save_home'), 0)

'Сохранить общая'
WebUI.click(findTestObject('Avangard New/Object (Тренер)/Case (Оценка навыков)/button_save_home'))

WebUI.verifyElementText(findTestObject('Avangard New/Object (Тренер)/Case (Оценка навыков)/alert home'), 'Оценки успешно сохранены.')

'Вкладка оценка навыков'
WebUI.click(findTestObject('Avangard New/Object (Тренер)/Case (Оценка навыков)/span_home'))

'Смотреть отчет'
WebUI.scrollToElement(findTestObject('Avangard New/Object (Тренер)/Case (Оценка навыков)/report home'), 
    0)

'Смотреть отчет'
WebUI.click(findTestObject('Avangard New/Object (Тренер)/Case (Оценка навыков)/report home'))

if (WebUI.verifyElementText(findTestObject('Avangard New/Object (Тренер)/Case (Оценка навыков)/player2'), 'Бережной Станислав', 
    FailureHandling.OPTIONAL) == true) {
    'Проверка игрока'
    WebUI.verifyElementText(findTestObject('Avangard New/Object (Тренер)/Case (Оценка навыков)/player2'), 'Бережной Станислав', 
        FailureHandling.STOP_ON_FAILURE)
} else {
    'Проверка игрока'
    WebUI.verifyElementText(findTestObject('Avangard New/Object (Тренер)/Case (Оценка навыков)/player2'), 'Власенко Дмитрий', 
        FailureHandling.STOP_ON_FAILURE)
}

'Проверка оценок'
WebUI.verifyElementText(findTestObject('Avangard New/Object (Тренер)/Case (Оценка навыков)/div_10'), '10')

WebUI.verifyElementText(findTestObject('Avangard New/Object (Тренер)/Case (Оценка навыков)/div_9'), '9')

'Открытие модального окна'
WebUI.click(findTestObject('Avangard New/Object (Тренер)/Case (Оценка навыков)/div_10'))

WebUI.verifyElementText(findTestObject('Avangard New/Object (Тренер)/Case (Оценка навыков)/goal'), 'автотест1')

'Проверка введенных данных'
WebUI.verifyElementText(findTestObject('Avangard New/Object (Тренер)/Case (Оценка навыков)/description'), 'автотест2')

WebUI.click(findTestObject('Avangard New/Object (Тренер)/Case (Оценка навыков)/button_close'))

'Переход на вкладку Оценка навыков'
WebUI.click(findTestObject('Avangard New/Object (Тренер)/Case (Оценка навыков)/span_home'))

'Редактировать'
WebUI.click(findTestObject('Avangard New/Object (Тренер)/Case (Оценка навыков)/edit home'))

'Удалить 1 фокус'
WebUI.click(findTestObject('Avangard New/Object (Тренер)/Case (Оценка навыков)/editf'))

'Удалить фокус развития'
WebUI.click(findTestObject('Avangard New/Object (Тренер)/Case (Оценка навыков)/button_delete'))

'Подтверждение'
WebUI.click(findTestObject('Avangard New/Object (Тренер)/Case (Оценка навыков)/button_delete2'))

WebUI.verifyElementText(findTestObject('Avangard New/Object (Тренер)/Case (Оценка навыков)/Alert delete'), 'Фокус развития успешно удален.')

'Редактировать 2'
WebUI.click(findTestObject('Avangard New/Object (Тренер)/Case (Оценка навыков)/edit3'))

'Удалить 2 фокус'
WebUI.click(findTestObject('Avangard New/Object (Тренер)/Case (Оценка навыков)/button_delete'))

'Подтверждение удаления'
WebUI.click(findTestObject('Avangard New/Object (Тренер)/Case (Оценка навыков)/button_delete2'))

'На главную'
WebUI.click(findTestObject('Avangard New/Object (Тренер)/Case (Оценка навыков)/span_home home'))

WebUI.closeBrowser()

