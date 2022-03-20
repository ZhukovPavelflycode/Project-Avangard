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
WebUI.click(findTestObject('Object Repository/Avangard New/Object (Тренер)/Case (Физическое тестирование)/div__exercises'))

'FMS тест'
WebUI.click(findTestObject('Object Repository/Avangard New/Object (Тренер)/Case (Физическое тестирование)/div_FMS'))

'Ввод значений'
WebUI.clearText(findTestObject('Object Repository/Avangard New/Object (Тренер)/Case (Физическое тестирование)/input_FMS1'), 
    FailureHandling.STOP_ON_FAILURE)

'Ввод значений'
WebUI.setText(findTestObject('Object Repository/Avangard New/Object (Тренер)/Case (Физическое тестирование)/input_FMS1'), 
    '50,8')

WebUI.scrollToElement(findTestObject('Avangard New/Object (Тренер)/Case (Физическое тестирование)/input_FMS 3'), 0)

WebUI.clearText(findTestObject('Object Repository/Avangard New/Object (Тренер)/Case (Физическое тестирование)/input_FMS 2'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Avangard New/Object (Тренер)/Case (Физическое тестирование)/input_FMS 2'), 
    '0')

WebUI.clearText(findTestObject('Avangard New/Object (Тренер)/Case (Физическое тестирование)/input_FMS 3'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Avangard New/Object (Тренер)/Case (Физическое тестирование)/input_FMS 3'), '1000')

WebUI.click(findTestObject('Object Repository/Avangard New/Object (Тренер)/Case (Физическое тестирование)/button_save'))

'Проверка сохранения'
WebUI.verifyElementText(findTestObject('Avangard New/Object (Тренер)/Case (Физическое тестирование)/alert fiz testing'), 
    'Оценка сохранена')

WebUI.scrollToElement(findTestObject('Object Repository/Avangard New/Object (Тренер)/Case (Физическое тестирование)/button_close fiz test'), 
    0)

'Кнопка закрыть'
WebUI.click(findTestObject('Object Repository/Avangard New/Object (Тренер)/Case (Физическое тестирование)/button_close fiz test'))

WebUI.click(findTestObject('Object Repository/Avangard New/Object (Тренер)/Case (Физическое тестирование)/button__close 2 fiz test'))

