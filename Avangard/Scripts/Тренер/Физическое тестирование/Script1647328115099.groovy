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

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl(GlobalVariable.url)

WebUI.setText(findTestObject('Object Repository/Avangard New/Object (Тренер)/Case (Физическое тестирование)/input__sc-lnrBVv eqPACj'), 
    GlobalVariable.OFP_trainer_login)

WebUI.setText(findTestObject('Object Repository/Avangard New/Object (Тренер)/Case (Физическое тестирование)/input__sc-lnrBVv eqPACj_1'), 
    GlobalVariable.OFP_trainer_password)

WebUI.click(findTestObject('Object Repository/Avangard New/Object (Тренер)/Case (Физическое тестирование)/go'))

'Вкладка физическое тестирование'
WebUI.click(findTestObject('Object Repository/Avangard New/Object (Тренер)/Case (Физическое тестирование)/buttom  fiz testing'))

'Упражнения'
WebUI.click(findTestObject('Object Repository/Avangard New/Object (Тренер)/Case (Физическое тестирование)/div__exercises'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Avangard New/Object (Тренер)/Case (Физическое тестирование)/input__exercise'), 
    'FMS тест (баллы)')

WebUI.sendKeys(findTestObject('Object Repository/Avangard New/Object (Тренер)/Case (Физическое тестирование)/input__exercise'), 
    Keys.chord(Keys.ENTER))

'Ананьин Егор'
WebUI.clearText(findTestObject('Object Repository/Avangard New/Object (Тренер)/Case (Физическое тестирование)/input_FMS 1'), 
    FailureHandling.STOP_ON_FAILURE)

'Ананьин Егор'
WebUI.setText(findTestObject('Object Repository/Avangard New/Object (Тренер)/Case (Физическое тестирование)/input_FMS 1'), 
    '21')

'Бережной Станислав'
WebUI.clearText(findTestObject('Object Repository/Avangard New/Object (Тренер)/Case (Физическое тестирование)/input_FMS 2'), 
    FailureHandling.STOP_ON_FAILURE)

'Бережной Станислав'
WebUI.setText(findTestObject('Object Repository/Avangard New/Object (Тренер)/Case (Физическое тестирование)/input_FMS 2'), 
    '15')

'Ганин Данила'
WebUI.clearText(findTestObject('Object Repository/Avangard New/Object (Тренер)/Case (Физическое тестирование)/input_FMS 3'), 
    FailureHandling.STOP_ON_FAILURE)

'Ганин Данила'
WebUI.setText(findTestObject('Object Repository/Avangard New/Object (Тренер)/Case (Физическое тестирование)/input_FMS 3'), 
    '7')

WebUI.scrollToElement(findTestObject('Object Repository/Avangard New/Object (Тренер)/Case (Физическое тестирование)/input_FMS 6'), 
    0)

WebUI.clearText(findTestObject('Object Repository/Avangard New/Object (Тренер)/Case (Физическое тестирование)/input_FMS 6'), 
    FailureHandling.STOP_ON_FAILURE)

'Фигурин Александр'
WebUI.setText(findTestObject('Object Repository/Avangard New/Object (Тренер)/Case (Физическое тестирование)/input_FMS 6'), 
    '0')

'Холодилин Никита'
WebUI.clearText(findTestObject('Object Repository/Avangard New/Object (Тренер)/Case (Физическое тестирование)/input_FMS 4'), 
    FailureHandling.STOP_ON_FAILURE)

'Холодилин Никита'
WebUI.setText(findTestObject('Object Repository/Avangard New/Object (Тренер)/Case (Физическое тестирование)/input_FMS 4'), 
    '3,7')

'Ядыкин Егор'
WebUI.clearText(findTestObject('Object Repository/Avangard New/Object (Тренер)/Case (Физическое тестирование)/input_FMS 5'), 
    FailureHandling.STOP_ON_FAILURE)

'Ядыкин Егор'
WebUI.setText(findTestObject('Object Repository/Avangard New/Object (Тренер)/Case (Физическое тестирование)/input_FMS 5'), 
    '1000')

WebUI.scrollToElement(findTestObject('Object Repository/Avangard New/Object (Тренер)/Case (Физическое тестирование)/button_save'), 
    0)

'Кнопка Сохранить'
WebUI.click(findTestObject('Object Repository/Avangard New/Object (Тренер)/Case (Физическое тестирование)/button_save'))

'Проверка сохранения'
WebUI.verifyElementText(findTestObject('Object Repository/Avangard New/Object (Тренер)/Case (Физическое тестирование)/alert fiz testing'), 
    'Оценка сохранена')

'Поле ввода этап'
WebUI.scrollToElement(findTestObject('Object Repository/Avangard New/Object (Тренер)/Case (Физическое тестирование)/stage 2'), 
    0)

'Поле ввода этап'
WebUI.click(findTestObject('Object Repository/Avangard New/Object (Тренер)/Case (Физическое тестирование)/stage 2'))

'Выбор 2 этапа'
WebUI.setText(findTestObject('Object Repository/Avangard New/Object (Тренер)/Case (Физическое тестирование)/input__etapi'), 
    'Этап №2')

WebUI.sendKeys(findTestObject('Object Repository/Avangard New/Object (Тренер)/Case (Физическое тестирование)/input__etapi'), 
    Keys.chord(Keys.ENTER))

'Ганин'
WebUI.clearText(findTestObject('Object Repository/Avangard New/Object (Тренер)/Case (Физическое тестирование)/input_FMS 3'), 
    FailureHandling.STOP_ON_FAILURE)

'Ганин'
WebUI.setText(findTestObject('Object Repository/Avangard New/Object (Тренер)/Case (Физическое тестирование)/input_FMS 3'), 
    '10,4')

WebUI.scrollToElement(findTestObject('Object Repository/Avangard New/Object (Тренер)/Case (Физическое тестирование)/button_save'), 
    0)

'Кнопка Сохранить'
WebUI.click(findTestObject('Object Repository/Avangard New/Object (Тренер)/Case (Физическое тестирование)/button_save'))

'Проверка сохранения'
WebUI.verifyElementText(findTestObject('Object Repository/Avangard New/Object (Тренер)/Case (Физическое тестирование)/alert fiz testing'), 
    'Оценка сохранена')

WebUI.scrollToElement(findTestObject('Object Repository/Avangard New/Object (Тренер)/Case (Физическое тестирование)/button_close fiz test'), 
    0)

'Кнопка закрыть'
WebUI.click(findTestObject('Object Repository/Avangard New/Object (Тренер)/Case (Физическое тестирование)/button_close fiz test'))

'Кнопка закрыть 2'
WebUI.click(findTestObject('Object Repository/Avangard New/Object (Тренер)/Case (Физическое тестирование)/button__close 2 fiz test'))

WebUI.callTestCase(findTestCase('Тренер/Отчет физического тестирования (переиспользуется в Физ. тестировании)'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Игрок/У игрока Отчет физического тестирования (переиспользуется в физ. тестировании у тренера)'), 
    [:], FailureHandling.STOP_ON_FAILURE)

