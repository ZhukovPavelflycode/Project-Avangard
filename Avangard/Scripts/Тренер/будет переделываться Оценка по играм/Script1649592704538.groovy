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

'Нажимаю вкладка  оценка по играм'
WebUI.click(findTestObject('Avangard New/Object (Тренер)/Case (Оценка по играм)/grade for game'))

'Кнопка Редактировать'
WebUI.click(findTestObject('Avangard New/Object (Тренер)/Case (Оценка по играм)/edit'))

'Проверка что цифры оценки нажимаются'
WebUI.verifyElementClickable(findTestObject('Avangard New/Object (Тренер)/Case (Оценка по играм)/edit 4'))

'Скролл к сохранить'
WebUI.scrollToElement(findTestObject('Avangard New/Object (Тренер)/Case (Оценка по играм)/button_'), 0)

'Кнопка сохранить'
WebUI.click(findTestObject('Avangard New/Object (Тренер)/Case (Оценка по играм)/button_'))

'Проверка алерта'
WebUI.verifyElementText(findTestObject('Avangard New/Object (Тренер)/Case (Оценка по играм)/alert save'), 'Оценка сохранена')

'Нажать кнопку закрыть'
not_run: WebUI.click(findTestObject('Avangard New/Object (Тренер)/Case (Оценка по играм)/button close'))

'Главная'
WebUI.click(findTestObject('Avangard New/Object (Тренер)/Case (Оценка по играм)/home'))

WebUI.closeBrowser()

