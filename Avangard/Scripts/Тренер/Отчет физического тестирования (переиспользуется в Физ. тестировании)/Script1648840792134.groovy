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

WebUI.setText(findTestObject('Avangard New/Object (Тренер)/Case (Физическое тестирование)/input__sc-lnrBVv eqPACj'), 
    GlobalVariable.OFP_trainer_login)

'Вход под тренером ОФП'
WebUI.setText(findTestObject('Avangard New/Object (Тренер)/Case (Физическое тестирование)/input__sc-lnrBVv eqPACj_1'), 
    GlobalVariable.OFP_trainer_password)

'Кнопка Вход'
WebUI.click(findTestObject('Avangard New/Object (Тренер)/Case (Физическое тестирование)/go'))

'Вкладка Отчет\r\n'
WebUI.click(findTestObject('Avangard New/Object (Тренер)/Case (Физическое тестирование)/span_report fiz'))

'Отчет физического тестирования'
WebUI.click(findTestObject('Avangard New/Object (Тренер)/Case (Физическое тестирование)/fiz test report'))

'Поле ввода упрежнение'
WebUI.click(findTestObject('Avangard New/Object (Тренер)/Case (Физическое тестирование)/div_report uprazhnenie'))

'Ввод в поле FMS тест'
WebUI.setText(findTestObject('Avangard New/Object (Тренер)/Case (Физическое тестирование)/input__yprazhnenia report'), 
    'FMS тест (баллы)')

WebUI.sendKeys(findTestObject('Avangard New/Object (Тренер)/Case (Физическое тестирование)/input__yprazhnenia report'), 
    Keys.chord(Keys.ENTER))

'Показатель у Ананьина'
WebUI.verifyElementText(findTestObject('Avangard New/Object (Тренер)/Case (Физическое тестирование)/div_21'), 
    '21')

'Оценка 10 должна быть'
WebUI.verifyElementText(findTestObject('Avangard New/Object (Тренер)/Case (Физическое тестирование)/div_10'), 
    '10')

'Показатель 15 у Бережного'
WebUI.verifyElementText(findTestObject('Avangard New/Object (Тренер)/Case (Физическое тестирование)/div_15'), 
    '15')

'Должна быть оценка 7'
WebUI.verifyElementText(findTestObject('Avangard New/Object (Тренер)/Case (Физическое тестирование)/div_7'), 
    '7')

'Показатель Холодилин Никита\r\n'
WebUI.scrollToElement(findTestObject('Avangard New/Object (Тренер)/Case (Физическое тестирование)/div_3,7'), 
    0)

'Показатель 3,7 Холодилин Никита\r\n'
WebUI.verifyElementText(findTestObject('Avangard New/Object (Тренер)/Case (Физическое тестирование)/div_3,7'), 
    '3,7')

'Оценка должна быть 2'
WebUI.verifyElementText(findTestObject('Avangard New/Object (Тренер)/Case (Физическое тестирование)/div_2'), 
    '2')

WebUI.scrollToElement(findTestObject('Avangard New/Object (Тренер)/Case (Физическое тестирование)/div_stage 2  10,4'), 
    0)

'Показатель Ганину'
WebUI.verifyElementText(findTestObject('Avangard New/Object (Тренер)/Case (Физическое тестирование)/div_stage 2  10,4'), 
    '10,4')

'Оценка должна быть 4,5'
WebUI.verifyElementText(findTestObject('Avangard New/Object (Тренер)/Case (Физическое тестирование)/div_stage 2   4,5'), 
    '4,5')

'Разница вверх 1,5'
WebUI.verifyElementText(findTestObject('Avangard New/Object (Тренер)/Case (Физическое тестирование)/div_1,5'), 
    '1,5')

WebUI.closeBrowser()

