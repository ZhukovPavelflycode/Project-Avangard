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

WebUI.callTestCase(findTestCase('Игрок/Авторизация игрок'), [:], FailureHandling.STOP_ON_FAILURE)

'Вкладка Отчеты'
WebUI.click(findTestObject('Avangard New/Object (Игрок)/Сase (Отчет физического тестирования)/span_report player'))

'Отчет по физическому тестированию'
WebUI.click(findTestObject('Avangard New/Object (Игрок)/Сase (Отчет физического тестирования)/report fiz test player'))

'Поле на поле ввода упражнение'
WebUI.click(findTestObject('Avangard New/Object (Игрок)/Сase (Отчет физического тестирования)/yprazhnenie palyer'))

'Ввод текста'
WebUI.setText(findTestObject('Avangard New/Object (Игрок)/Сase (Отчет физического тестирования)/input__player report'), 
    'FMS тест (баллы)')

'Ввод текста'
WebUI.sendKeys(findTestObject('Avangard New/Object (Игрок)/Сase (Отчет физического тестирования)/input__player report'), 
    Keys.chord(Keys.ENTER))

'Показатель 7 Только для Ганина проверки (Омские Ястребы)'
WebUI.verifyElementText(findTestObject('Avangard New/Object (Игрок)/Сase (Отчет физического тестирования)/div_7'), '7', 
    FailureHandling.CONTINUE_ON_FAILURE)

'Оценка 3'
WebUI.verifyElementText(findTestObject('Avangard New/Object (Игрок)/Сase (Отчет физического тестирования)/div_3'), '3', 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Avangard New/Object (Игрок)/Сase (Отчет физического тестирования)/div_10,4'), '10,4', 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Avangard New/Object (Игрок)/Сase (Отчет физического тестирования)/div_4,5'), '4,5', 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Avangard New/Object (Игрок)/Сase (Отчет физического тестирования)/div_1,5'), '1,5', 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.closeBrowser()

